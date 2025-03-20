package org.practice.array_list;

import java.util.HashSet;

public class duplicates {
	public static boolean checkDuplicates(int[] arr){
		HashSet<Integer> set = new HashSet<>();
		for(int n:arr){
			set.add(n);
		}
		return set.size()<arr.length;
	}

}
