package com.zolando;

public class SmallestInNonEmptyArray {
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {1, 2}));
	}

	static int solution(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
