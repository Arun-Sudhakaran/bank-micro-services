package com.zolando;

public class MissingNonNegative {
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {-1, -3, 1, 3, 6, 4, 1, 2}));
	}

	public static int solution(int[] A) {
        
        java.util.Arrays.sort(A);

        int expectedElement = 1;
        int currentElement = 1;
        for(int i=0; i<A.length; i++) {
        	
            if(A[i] > 0) {
            	
            	if((expectedElement == currentElement))
            		expectedElement++;
            	
            	else if(currentElement < A[i])
            		currentElement++;

            	else if(currentElement != A[i] && expectedElement != A[i])
            		return expectedElement;
            	
            }
        }

        return currentElement;
    }
}

/**
 *  e2, 1, c1 [true]
 *  e2, 1, c1 [true]
 *  e2, 2, c2 [true]
 *  e3, 3, c3 [true]
 *  e4, 4, c4 [true]
 *  e5, 6, c5 [false]
*/
