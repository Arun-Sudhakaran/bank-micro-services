package com.sixdee.ooredoo.util;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.stereotype.Component;

/**
 * @author basil.jose
 * @since 05-Sep-2019 6:15:57 pm
 */

@Component

public class TrippleDes {

	private static Cipher cipher = null;
	private static SecretKey secretKey = null;

	private static final String CUSTOM_KEY = "imTheCustomKey";
	private static final String INITIALIZATION_VECTOR = "AODVNUASDNVVAOVF";

	public TrippleDes() throws Exception {

		Security.addProvider(new BouncyCastleProvider());
//		ECGenParameterSpec spec = new ECGenParameterSpec("secp256r1");
//		KeyPairGenerator gen = KeyPairGenerator.getInstance("ECDH", "BC");
//		SecureRandom random = new SecureRandom();
//		random.setSeed(CUSTOM_KEY.getBytes());
//		gen.initialize(spec, random);
//		KeyPair pair = gen.generateKeyPair();
		ECPublicKey partyXPubKey = getPublicKeyFromString("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEVb0Dc50r0h25R7nlDoW6JVzjwe1t8+naFkuO6u23QL2ilEuHPm/0I5UsM/r+GYmZZMruxCD4JZ4MoOrzUJO5Hw==");
		ECPrivateKey partyXPrivKey = getPrivateKeyFromString("MIGTAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBHkwdwIBAQQgimE/xd9IAVZGE7IuDZ8SfWLpqyBHz+od7AcMLWU913OgCgYIKoZIzj0DAQehRANCAARVvQNznSvSHblHueUOhbolXOPB7W3z6doWS47q7bdAvaKUS4c+b/QjlSwz+v4ZiZlkyu7EIPglngyg6vNQk7kf");

		// 1. Generate the pre-master shared secret
		KeyAgreement ka = KeyAgreement.getInstance("ECDH", "BC");
		ka.init(partyXPrivKey);
		ka.doPhase(partyXPubKey, true);
		byte[] sharedSecret = ka.generateSecret();

		// 4. Create a secret key from the session key and initialize a cipher with the secret key
		secretKey = new SecretKeySpec(sharedSecret, 0, sharedSecret.length, "AES");
		cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
	}

	public String encrypt(String unencryptedString) 
			throws BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException, InvalidKeyException, UnsupportedEncodingException {

		cipher.init(Cipher.ENCRYPT_MODE, secretKey, new IvParameterSpec(INITIALIZATION_VECTOR.getBytes("UTF-8")));
		byte[] encryptMeBytes = unencryptedString.getBytes(StandardCharsets.UTF_8);
		byte[] cipherText = cipher.doFinal(encryptMeBytes);
		String cipherString = java.util.Base64.getEncoder().encodeToString(cipherText);
		return cipherString;
	}

	public String decrypt(String encryptedString) 
			throws BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException, InvalidKeyException, UnsupportedEncodingException {

		cipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(INITIALIZATION_VECTOR.getBytes("UTF-8")));
		byte[] decryptMeBytes = java.util.Base64.getDecoder().decode(encryptedString);
		byte[] textBytes = cipher.doFinal(decryptMeBytes);
		String originalText = new String(textBytes);
		return originalText;
	}
	
	private ECPublicKey getPublicKeyFromString(String pubKey) throws InvalidParameterSpecException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
		
	    KeyFactory kf = KeyFactory.getInstance("ECDH", "BC");
		
		X509EncodedKeySpec keySpecX509 = new X509EncodedKeySpec(Base64.getDecoder().decode(pubKey.getBytes()));
		return (ECPublicKey) kf.generatePublic(keySpecX509);
	}
	
	private ECPrivateKey getPrivateKeyFromString(String pubKey) throws InvalidParameterSpecException, NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
		
		KeyFactory kf = KeyFactory.getInstance("ECDH", "BC");
		
		PKCS8EncodedKeySpec keySpecPKCS8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(pubKey.getBytes()));
		return (ECPrivateKey) kf.generatePrivate(keySpecPKCS8);
	}

	public static void main(String args[]) throws Exception {

		String planePin = "12456";
		TrippleDes td = new TrippleDes();
		String encrypted = td.encrypt(planePin);

		System.out.println("Encrypted String: " + encrypted);
		System.out.println("Decrypted String from the " + encrypted + " is: " + td.decrypt(encrypted));
		
//		System.out.println(td.getPublicKeyFromString("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEVb0Dc50r0h25R7nlDoW6JVzjwe1t8+naFkuO6u23QL2ilEuHPm/0I5UsM/r+GYmZZMruxCD4JZ4MoOrzUJO5Hw=="));
//		System.out.println(td.getPrivateKeyFromString("MIGTAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBHkwdwIBAQQgimE/xd9IAVZGE7IuDZ8SfWLpqyBHz+od7AcMLWU913OgCgYIKoZIzj0DAQehRANCAARVvQNznSvSHblHueUOhbolXOPB7W3z6doWS47q7bdAvaKUS4c+b/QjlSwz+v4ZiZlkyu7EIPglngyg6vNQk7kf"));
	}

}