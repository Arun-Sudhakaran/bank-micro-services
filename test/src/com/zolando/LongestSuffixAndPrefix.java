package com.zolando;

public class LongestSuffixAndPrefix {

	public static void main(String[] args) {
		
		System.out.println(solution("abbabba"));
	}
	
	public static int solution(String S) {

		System.out.println(S.length()/2);
		
		if(!S.equals(new StringBuilder(S).reverse().toString()))	// not a palindrome
			return 0;
		
		return (S.length() % 2 == 0) ? (S.length()/2) : (S.length()/2) + 1;
    }
}
