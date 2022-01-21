package com.codechef;

import java.util.HashSet;

/**
 * 
 * Problem : A Problem on Sticks
 * 
 * Problem Link : https://www.codechef.com/problems/TREE2
 *
 */

public class Codechef_A_Problem_On_Sticks {

	public static void solve() {
		int n = 4;

		int[] input = { 1, 2, 3, 5 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {

			set.add(input[i]);
		}

		set.remove(0);

		System.out.println(set.size());
	}
	
	public static void main(String[] args) throws java.lang.Exception {

		solve();
	}

}
