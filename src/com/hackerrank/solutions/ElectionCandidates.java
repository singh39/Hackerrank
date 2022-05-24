package com.hackerrank.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectionCandidates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = { { 8, 27, 39, 589, 23 }, { 23, 27, 589, 12, 45 }, { 939, 32, 27, 12, 78 },
				{ 23, 349, 27, 21, 32 } };

		System.out.println(getCandidates(arr));

	}

	private static List<Integer> getCandidates(int arr[][]) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (map.containsKey(arr[i][j])) {
					map.put(arr[i][j], map.get(arr[i][j]) + 1);
				} else {
					map.put(arr[i][j], 1);
				}
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 3) {
				result.add(entry.getKey());
			}

		}
		
		return result;

	}

}
