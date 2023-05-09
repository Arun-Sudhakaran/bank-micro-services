package com.tradebyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LowercaseUniqueOccurance {

	public static void main(String[] args) {
		
		System.out.println(solution("aaaabbbb"));	//ccaaffddecee
	}
	
	public static int solution(String S) {
        
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for(int i=0; i<S.length(); i++) {
			
			if(countMap.containsKey(S.charAt(i)))
				countMap.put(S.charAt(i), ((Integer)countMap.get(S.charAt(i))+1));
			else
				countMap.put(S.charAt(i), 1);
		}
		
		if(countMap.size() == 1)
			return 0;

		List<Integer> values = new ArrayList<Integer>();
		
		for(Character key : countMap.keySet()) {
			values.add(countMap.get(key));
		}
		
		int reduction = 0;
		int current = 0;
		List<Integer> existing = new ArrayList<Integer>();
		
		Collections.sort(values);
		
		for(Integer value : values) {
			
			if(current == value) {
				
				boolean indexFound = false;
				for(int i=1; i<=value-1; i++) {
					if(!existing.contains(i)) {
						
						indexFound = true;
						reduction += i;
						existing.add(i);
						break;
					}
				}
				if(!indexFound)
					reduction += value;
			}
			else {
				current = value;
				existing.add(value);
			}
		}

		return reduction;
    }
	
//	Integer [] charCounts = new Integer[26];
//    Arrays.fill(charCounts, 0);
//
//    for (int i = 0; i <S.length() ; i++) {
//        int index = S.charAt(i)-'a';
//        int count = charCounts[index];
//        charCounts[index] = count + 1;
//    }
//
//    //create list of counts
//    ArrayList<Integer> list = new ArrayList<>();
//
//    for (int i = 0; i<charCounts.length ; i++) {
//        if(charCounts[i]>0)
//            list.add(charCounts[i]);
//    }
//
//    //cort the array list in descending order
//    Collections.sort(list, Collections.reverseOrder());
//
//    Integer[] counts = list.toArray(new Integer[list.size()]);
//
//    int deletions=0;
//    //iterate from left to right and if count is same then reduce
//    for (int i = 0; i <counts.length-1 ; i++) {
//        for (int j = i+1; j <counts.length ; j++) {
//            if (counts[i]>0 && counts[i]==counts[j]){
//                int count = counts[j];
//                counts[j] = count - 1;
//                deletions++;
//            }else
//                break;
//        }
//    }
//    
//    return deletions;
}
