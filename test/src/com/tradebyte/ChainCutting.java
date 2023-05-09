package com.tradebyte;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ChainCutting {
	
	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {5,2,4,6,3,7}));
	}

	public static int solution(int[] A) {
        
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=1; i<A.length-2; i++) {
			
			for(int j=i+2; j<A.length; j++) {
				
				set.add(A[i] + A[j]);
			}
		}
		
		return new ArrayList<Integer>(set).get(0);
    }
}
