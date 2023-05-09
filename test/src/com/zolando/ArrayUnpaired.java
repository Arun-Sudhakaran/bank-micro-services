package com.zolando;

public class ArrayUnpaired {

	public static int solution(int[] A) {

		int unpaired = A[0];
		int count = 1;

		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A.length; j++) {

				if((i != j) && A[i] == A[j]) {
					count++;
				}
			}

			if(count%2 != 0) {
				unpaired = A[i];
			}
			count = 1;
		}

		return unpaired;
	}

	public static void main(String[] args) {

		System.out.println(solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
	}
}
