package com.sudipta.hackerRank;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 * @author user
 *
 */
public class JumpingOfTheCloud {

	public static void main(String[] args) {
		int c[] = {0, 0, 0 ,0, 1, 0};
		 int noOfJump = 0;
	        int n = c.length, i=0;

	        while(true){
	            if((i+2)< n && c[i+2] == 0){
	                i = i+2;  
	            }else if((i+1) < n && c[i + 1] == 0){
	                i = i + 1;
	            }else{
	                break;
	            }
	            noOfJump++;
	        }

	}

}
