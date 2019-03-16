package com.sudipta.hackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 * @author user
 *
 */
public class SparseArrays {
	
	public static void main(String[] args) {
		String[] strings = {"aba","baba",
				"aba",
				"xzxb"};
		String[] queries = {"aba",
				"xzxb",
				"ab"};
		
		getArrays(strings, queries);
	}

	private static int[] getArrays(String[] strings, String[] queries) {
		Map<String, Integer>  map = new HashMap<String, Integer>();
		for(int i =0 ; i< queries.length; i++){
			map.put(queries[i], 0);
			for(int j =0 ; j< strings.length; j++){
				if(queries[i].equals(strings[j])){
					int m = map.get(queries[i]);
					map.put(queries[i], m+1);
				}
			}
		}
		
		int arr[] = new int[queries.length];
		int i =0 ;
		for(String str: queries){
			arr[i] = map.get(str);
			i++;
		}
		
		return arr;
	}

}
