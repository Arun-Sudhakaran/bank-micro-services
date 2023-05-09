package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {
        
		System.out.println(areIsomorphic("badc", "baba"));
    }
	
	static boolean areIsomorphic(String s, String t) {
		
		if(s.length() != t.length())
			return false;
        
        else if(s.length() == 0 || t.length() == 0)
			return false;
		
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        for(int i=0; i<s.length(); i++) {
        	
        	if(map.containsKey(s.charAt(i))) {
        		
        		Character existing = map.get(s.charAt(i));
        		if(existing.charValue() != t.charAt(i))
        			return false;
        	}
        	else {
        		
        		map.put(s.charAt(i), t.charAt(i));
        	}
        }
        
        map.clear();
        
        for(int i=0; i<s.length(); i++) {
        	
        	if(map.containsKey(t.charAt(i))) {
        		
        		Character existing = map.get(t.charAt(i));
        		if(existing.charValue() != s.charAt(i))
        			return false;
        	}
        	else {
        		
        		map.put(t.charAt(i), s.charAt(i));
        	}
        }
        
        return true;
	}
}
