package org.practice.string;

public class PrintEvenChar {
	public static void printEvenChar(String str){
		for(int i=0; i<str.length(); i++){
			if(i%2==0){
				System.out.println(str.charAt(i));
			}
		}
	}



	public static void main(String[] args) {
		String text= "Prachi achi ladki";
		String arr[] = text.split(" ");


	}
}
