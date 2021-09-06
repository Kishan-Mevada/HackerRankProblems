package com.kishan.year_2021.month_sept.date_6;

import java.util.Arrays;
import java.util.List;

/**
 * 	The frequency array is [0,3,1,1] . These values can be used to create the sorted array as well: sorted = [1,2,0,1] .
 */
public class CountingSort {

	static List<Integer> sort(List<Integer> arr){
		Integer[] freq = new Integer[100];
		Arrays.fill(freq,0);
		for(int num : arr){
			freq[num]++;
		}
		return  Arrays.asList(freq);
	}
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(0,3,1,1);
		System.out.println(sort(arr));
	}
}
