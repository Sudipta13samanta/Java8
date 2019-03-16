package com.sudipta.hackerRank;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?utm_campaign=
 * challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 * 
 * @author Sudipta
 *
 */
public class CountingValleys {

	public static void main(String s[]) {
		int valleyNum = 0;
		int level = 0;
		String str = "UDDDUDUU";
		for (char step : str.toCharArray()) {
			if (level == -1 && step == 'U') {
				valleyNum++;
			}

			if (step == 'U') {
				level++;
			} else {
				level--;
			}
		}

		System.out.println(valleyNum);
	}
}
