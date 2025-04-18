package org.practice.sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {10, 15, 5,6,23,3,0, -6};
		System.out.println("Before:");
		for(int n:arr){
			System.out.print(n+", ");
		}
		System.out.println();

		for(int i=0; i<arr.length; i++){
			for(int j=0; j < arr.length-1-i; j++ ){
				if(arr[j]<=arr[j+1]){
					continue;
				}else{
					int temp = arr[j];
					arr[j] =  arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("After:");
		for(int n:arr){
			System.out.print(n+", ");
		}
	}

}
