package com.sudipta.hackerRank;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 * @author user
 *
 */
public class PlusMinus {

	public static void main(String[] args) {
		double n = 6;
		int arr[] = {-4, 3, -9, 0, 4, 1};
		double positive =0;
		double nagetive = 0;
		double zero =0;
		for(int i =0; i< n; i++){
			if(arr[i] > 0)
				positive++;
			else if(arr[i] < 0)
				nagetive++;
			else
				zero++;
		}
		
		 double positiveFrac = positive / n;
	     double nagetiveFrac = nagetive / n;
	     double zeroFrac = zero / n;

	        System.out.println(positiveFrac);
	        System.out.println(nagetiveFrac);
	        System.out.println(zeroFrac);
	}

}
