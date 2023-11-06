package practice;

import java.util.Arrays;


public class SecondHighest {
	public static void main(String[] args) {
		int num [] = { 400, 100, 250, 350, 500, 300 };
		int size = num.length;
		Arrays.sort(num);
		int result = num[size - 2];

		System.out.println("Second Highest is : " + result);
	}

}
