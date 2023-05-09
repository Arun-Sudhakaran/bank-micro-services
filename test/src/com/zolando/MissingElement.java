package com.zolando;

public class MissingElement {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {3}));
	}
	
	public static int solution(int[] A) {
		
		if(A.length == 0)
			return 1;
		
        java.util.Arrays.sort(A);
        
        int missingElement = A.length+1;

        for(int i=0; i<A.length; i++) {

            if(A[i] != i+1) {
                missingElement = i+1;
                break;
            }
        }

        return missingElement;
    }
}
