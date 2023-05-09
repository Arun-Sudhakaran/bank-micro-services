package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		
		try (BufferedReader inFile = new BufferedReader(new FileReader("animals.txt"));) {
			
		    String line;
		    int cnt = 0;
		    Animal[] animalArray = new Animal[10];
		    
		    while ((line = inFile.readLine()) != null) {
		    	
		    	String animalsInLine[] = line.split(" ");
		    	animalArray[cnt++] = new Animal(animalsInLine[0], animalsInLine[1], animalsInLine[2]);
		    }
		    
		    System.out.println(java.util.Arrays.toString(animalArray));
		} catch (IOException e) {
			System.out.println("Error while file handling : " + e.getMessage());
		}
	}
}

class Animal {
	
	private String animal1; 
	private String animal2; 
	private String animal3;
	public Animal(String animal1, String animal2, String animal3) {
		super();
		this.animal1 = animal1;
		this.animal2 = animal2;
		this.animal3 = animal3;
	}
	@Override
	public String toString() {
		return "Animal [animal1=" + animal1 + ", animal2=" + animal2 + ", animal3=" + animal3 + "]";
	}
}
