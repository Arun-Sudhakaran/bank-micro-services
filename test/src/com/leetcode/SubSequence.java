package com.leetcode;

public class SubSequence {

	public static void main(String[] args) {

		System.out.println(isSubsequence("aaaaaa", "bbaaaa"));
	}

	public static boolean isSubsequence(String s, String t) {

		//  a subsequence cannot be larger than the original
		if(t.length() < s.length())
			return false;
		
        if(s.length() == 0)
            return true;

		int index = -1;
		int count = 0;

		//  iterate the given subsequence
		for(int i=0; i<s.length(); i++) {

			char searchChar = s.charAt(i);

			for(int j=(index>-1 ? index+1 : i); j<t.length(); j++) {

				//  check against the original for match
				if(searchChar == t.charAt(j)) {

					//	update with the new index
					index = j;

					//	increment the count of matches, the same needs to match later with the given subsequence length
					count++;
					
					//	no need to search again
					break;
				}
			}
		}

		return ((index > -1) && (count == s.length()));
	}
}
