package com.geeksForGeeks.practice;

public class KadaneAlgorithm {
	static int n= 4;
	static int arr[] ={-1, -2, -3, -4};

	public static void main(String[] args) {
		System.out.println(kadaneAlgo());

	}

	private static int kadaneAlgo() {
		int curMax = arr[0];
		int max = arr[0];
		for(int i=1; i< n; i++){
			curMax = Math.max(arr[i], curMax + arr[i]);
			max = Math.max(curMax, max);
		}
		
		return max;
	}
}
