package com.kishan.year_2021.month_sept.date_6;

/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 *  input [1,2,3,4,3,2,1]
 *  output 4
 */
public class LonelyInteger {

	static int lonely(int[] nums){
		int result = 0;
		for(int num : nums){
			result ^= num;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,2,1};
		System.out.println("Lonely integer -> " + lonely(nums));
	}
}
