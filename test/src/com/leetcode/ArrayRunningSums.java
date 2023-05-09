package com.leetcode;

public class ArrayRunningSums {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		int[] output = new int[nums.length];
		
		for(int i=0; i < nums.length; i++) {

            for(int j=0; j <= i; j++) {
            	output[i] += nums[j];
                System.out.println("Number: " + nums[j] + " Sum: " + output[i]);
            }
            
            System.out.println("=====================");
            System.out.println();
        }
		
		System.out.println(java.util.Arrays.toString(output));
	}
}
