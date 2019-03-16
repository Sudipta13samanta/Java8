package com.sudipta.hackerRank;

public class ArrayManipulation {

	public static void main(String[] args) {
		int n = 5;
		
		int queries[][] = {{1,2,100},{2,5,100},{3,4,100}};
		int m = queries.length;
		long arr[] = new long[n];
		
		for(int i=0; i < n; i++){
			arr[i] = 0;
		}
		
		for(int i=0; i < m; i++){
			int row[] = queries[i];
			
			for(int j=row[0]-1; j < row[1]; j++){
				arr[j] += row[2];
			}
		}
		long max=0;
		for(int i=0; i < n; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
	}

}
