package com.kishan.year_2021.month_sept.date_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 		Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * 		For example, the square matrix  is shown below:
 *
 * 		1 2 3
 * 		4 5 6
 * 		9 8 9
 *
 *		1 + 5 + 9 = 15
 *		3 + 5 + 9 = 17
 *
 *		Diff : 15-17 = 2 (absolute)
 */
public class DiagonalDifference {

	static int difference(List<List<Integer>> arr){
		int col = arr.get(0).size()-1;
		int sum = 0;
		int j = 0;
		for(int i = 0; i < arr.size(); i++){
			sum += arr.get(j).get(j);
			sum -= arr.get(j).get(col-j);
			j++;
		}
		return Math.abs(sum);
	}
	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();

		arr.add(Arrays.asList(1,2,3));
		arr.add(Arrays.asList(4,5,6));
		arr.add(Arrays.asList(9,8,9));
		System.out.println("DiagonalDifference -> " + difference(arr));
	}
}
