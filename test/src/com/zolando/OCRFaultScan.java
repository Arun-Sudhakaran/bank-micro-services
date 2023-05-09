package com.zolando;

public class OCRFaultScan {
	
	public static boolean solution(String S, String T) {
        
        if(getStringLength(S) != getStringLength(T))
            return false;

        return checkStringPattern(S, T);
    }
	
	private static int getStringLength(String s) {
		
		int sum = 0;
		for(char c : s.toCharArray()) {
        	
        	try {
        		sum += Integer.parseInt(String.valueOf(c));
        	} catch (NumberFormatException e) {
        		sum++;
			}
        }
		
		return sum;
	}
	
	private static boolean checkStringPattern(String s, String t) {
		
		boolean result = true;
		
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		
		for(int i=0; i<sArray.length; i++) {
			
			boolean sNumeric = false; 
			boolean tNumeric = false; 
			
			try {
				//	check any one is a char type
        		Integer.parseInt(String.valueOf(sArray[i]));
        		sNumeric = true;
        	} catch (NumberFormatException e) {
        		
			}
			try {
				//	check any one is a char type
				Integer.parseInt(String.valueOf(tArray[i]));
				tNumeric = true;
			} catch (NumberFormatException e) {
				
			}
			
			if(!sNumeric && !tNumeric && !String.valueOf(sArray[i]).equals(String.valueOf(tArray[i])))
        		return false;
		}
		
		return result;
	}
}
