package com.zolando;

public class FrogJump {

	public static void main(String[] args) {
		System.out.println(solution(10, 85, 30));
	}
	
	public static int solution(int X, int Y, int D) {
        
		Float stepsFloat = (float)(Y-X)/D;
		int stepsInt = (Y-X)/D;
		
        return (stepsFloat > stepsInt) ? stepsInt+1 : stepsInt;
    }
}
