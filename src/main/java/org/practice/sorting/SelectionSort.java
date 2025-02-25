package org.practice.sorting;

public class SelectionSort {
	public static void sort(int arr[]){
		int n= arr.length;
		for(int i=0; i<n-1; i++){
			int mini = i;
			for(int j=i; j<n; j++){
				if(arr[j]<arr[mini]){
					mini=j;
				}
			}
//			arr[mini] = arr[mini]^arr[i];
//			arr[i] = arr[mini]^arr[i];
//			arr[mini] = arr[mini]^arr[i];

			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
//
//			arr[mini] = arr[mini]+arr[i];
//			arr[i] = arr[mini]-arr[i];
//			arr[mini] = arr[mini]-arr[i];
			System.out.println("PAss: "+i);
			for(int x:arr){
				System.out.print(x+" ");
			}

		System.out.println();

		}
	}
}
