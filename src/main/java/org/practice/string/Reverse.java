package org.practice.string;

public  class Reverse {
	public static String reverseString(String str){
		StringBuilder res = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--){
			res.append(str.charAt(i));
		}
		return res.toString();
	}

}
