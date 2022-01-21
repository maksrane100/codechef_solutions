package com.codechef;

/**
 * 
 * Problem : AS EASY AS ABC
 * 
 * Problem Link : https://www.codechef.com/problems/EASYABC
 *
 */

public class Codechef_As_Easy_As_ABC {

	public void solve() {

		String s = "aba";

		int first_a = -1, first_b = -1, first_c = -1;
		
		int last_a = -1, last_b = -1, last_c = -1;

		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				first_a = i;
				break;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'b') {
				first_b = i;
				break;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'c') {
				first_c = i;
				break;
			}
		}

		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) == 'a') {
				last_a = i;
				break;
			}
		}

		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) == 'b') {
				last_b = i;
				break;
			}
		}

		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) == 'c') {
				last_c = i;
				break;
			}
		}

		if (first_a > -1) {
			if (first_b > -1) {
				int diff = Math.abs(first_a - last_b);
				if (diff > max) {
					max = diff;
				}
			}
			if (first_c > -1) {
				int diff = Math.abs(first_a - last_c);
				if (diff > max) {
					max = diff;
				}
			}
		}

		if (first_b > -1) {
			if (first_a > -1) {
				int diff = Math.abs(first_b - last_a);
				if (diff > max) {
					max = diff;
				}
			}
			if (first_c > -1) {
				int diff = Math.abs(first_b - last_c);
				if (diff > max) {
					max = diff;
				}
			}
		}

		if (first_c > -1) {
			if (first_b > -1) {
				int diff = Math.abs(first_c - last_b);
				if (diff > max) {
					max = diff;
				}
			}
			if (first_a > -1) {
				int diff = Math.abs(first_c - last_a);
				if (diff > max) {
					max = diff;
				}
			}
		}

		System.out.println(max);
	}

	public static void main(String args[]) {
		Codechef_As_Easy_As_ABC obj = new Codechef_As_Easy_As_ABC();
		obj.solve();

	}

}
