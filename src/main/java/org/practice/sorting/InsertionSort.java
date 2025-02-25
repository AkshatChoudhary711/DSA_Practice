package org.practice.sorting;

public class InsertionSort {
	public static void sort(int arr[]){
		for(int i=1; i< arr.length; i++){
			if(arr[i]<arr[i-1]){
				int j=i;
				while(j>0 && arr[j]<arr[j-1]){
					arr[j] = arr[j]^arr[j-1];
					arr[j-1] = arr[j]^arr[j-1];
					arr[j] = arr[j]^arr[j-1];
					j--;
				}

			}
			System.out.println("Pass: "+i);
			for(int k =0; k<arr.length; k++){
				if(k==i)System.out.print("v");
				else System.out.print("  ");
			}
			System.out.println();
			for(int n:arr){
				System.out.print(n+" ");
			}
			System.out.println();

		}
	}
}
