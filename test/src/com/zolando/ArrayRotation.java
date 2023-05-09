package com.zolando;

public class ArrayRotation {

	public static void main(String[] args) {
		
		System.out.println(java.util.Arrays.toString(solution(new int[] {3, 8, 9, 7, 6}, 3)));
	}
	
	public static int[] solution(int[] A, int K) {
		
		for(int count=1; count<=K; count++) {
			for(int i=A.length-1; i>0; i--) {
				
				int temp = A[i];
				A[i] = A[i-1];
				A[i-1] = temp;
			}
		}
        
		return A;
    }
}
