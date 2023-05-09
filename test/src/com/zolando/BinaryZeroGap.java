package com.zolando;

public class BinaryZeroGap {

	public static void main(String[] args) {

		System.out.println(solution(1041));
	}

	public static int solution(int N) {

		int maxSequence = 0;
        int currentSequence = 0;
        boolean foundOne = true;

        char[] ar = Integer.toBinaryString(N).toCharArray();

        for(int i=0; i<ar.length; i++) {

            if(foundOne && ar[i] == '0')
                currentSequence++;
            
            else if(foundOne && ar[i] == '1') {

                if(currentSequence > maxSequence)
                    maxSequence = currentSequence;
                
                foundOne = false;
                currentSequence = 0;
            }
            
            if(!foundOne && ar[i] == '1')
                foundOne = true;
        }
        
        return maxSequence;
	}
}
