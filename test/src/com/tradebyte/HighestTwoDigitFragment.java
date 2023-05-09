package com.tradebyte;

public class HighestTwoDigitFragment {
	
	public static void main(String[] args) {
	
		System.out.println(solution("88"));
	}

	public static int solution(String S) {
        
		if(S.length() < 3)
			return Integer.parseInt(S);
		
		int max = 0;
		
		for(int i=0; i<S.length()-2; i++) {
			
			String twoDigit = S.substring(i, i+2);
			
			try {
				
				int num = Integer.parseInt(twoDigit);
				if(max < num)
					max = num;
				
			} catch (ArithmeticException e) {
				
			}
		}
		
		return max;
    }
}
