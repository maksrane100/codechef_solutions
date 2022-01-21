package com.codechef;

/**
 * 
 * Problem : Chef and Frequencies
 * 
 * Problem Link : https://www.codechef.com/problems/CL16BC
 *
 */

public class Codechef_Chef_And_Frequencies {

	public void solve() {

		int n = 10;

		String s = "abbcccdddd";

		int[] arr = new int[26];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i) - 97]++;
		}

		StringBuffer sb = new StringBuffer();

		while (n-- > 0) {

			int max = 0;

			int index = 0;

			for (int i = 0; i < 26; i++) {

				if (max < arr[i]) {
					max = arr[i];
					index = i;
				}

			}

			arr[index]--;

			sb.append((char) (97 + index));
		}

		System.out.println(sb);

	}

	public static void main(String args[]) {
		Codechef_Chef_And_Frequencies obj = new Codechef_Chef_And_Frequencies();
		obj.solve();

	}

}
