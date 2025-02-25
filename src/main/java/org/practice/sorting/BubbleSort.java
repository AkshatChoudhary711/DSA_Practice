package org.practice.sorting;

public class BubbleSort {
	public static void sort(int arr[]){
		for(int i=arr.length-2; i>=0; i-- ){
			for(int j=0; j<= i; j++){
				if(arr[j]>arr[j+1]){
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
			System.out.println("Pass: "+ (arr.length-i-1));
			for(int n=0; n<arr.length;n++){
				if(n == i+1) System.out.print("| "+arr[n]+" ");
				else System.out.print(arr[n]+" ");
			}
			System.out.println();
		}
	}

}
