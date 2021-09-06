package com.kishan.year_2021.month_sept.date_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipMatrix {
	public static int flippingMatrix(List<List<Integer>> matrix) {
		// Write your code here
		int col = matrix.get(0).size() / 2;

		int sr = 0;
		int er = matrix.size() - 1;
		while(sr < er){
			int n1 = matrix.get(sr).get(col);
			int n2 =  matrix.get(er).get(col);
			matrix.get(sr).set(col,n2);
			matrix.get(er).set(col, n1);
			sr++;
			er--;
		}
		int sc = 0;
		int ec = matrix.size() - 1;
		while(sc < ec){
			int n1 = matrix.get(0).get(sc);
			int n2 =  matrix.get(0).get(ec);
			matrix.get(0).set(sc,n2);
			matrix.get(0).set(ec, n1);
			sc++;
			ec--;
		}
		int sum = 0;
		for(int c = 0; c < matrix.get(0).size(); c++) {
			sum += matrix.get(0).get(c);
		}
		return sum;
	}
	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();

		List<Integer> a1 = new ArrayList<>();
		a1.add(112);a1.add(42);a1.add(83);a1.add(49);
		matrix.add(a1);

		List<Integer> a2 = new ArrayList<>();
		a2.add(56);a2.add(125);a2.add(56);a2.add(49);
		matrix.add(a2);

		List<Integer> a3 = new ArrayList<>();
		a3.add(15);a3.add(78);a3.add(101);a3.add(43);
		matrix.add(a3);

		List<Integer> a4 = new ArrayList<>();
		a4.add(62);a4.add(98);a4.add(114);a4.add(108);
		matrix.add(a4);

		System.out.println(flippingMatrix(matrix));
	}

}
