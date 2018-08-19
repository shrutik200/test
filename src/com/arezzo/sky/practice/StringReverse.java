package com.arezzo.sky.practice;

public class StringReverse {

	public static void main(String[] args) {

		int calculateLength = 0;

		String str = "Hello World";
		char[] a = str.toCharArray();

		for (int i = 0; a[i] != '\0'; ++i) {
			for (int j = i; j >= 0; j--) {
				System.out.println(a[j]);
			}
		}

		// System.out.println(calculateLength);

	}

}
