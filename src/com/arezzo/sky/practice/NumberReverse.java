package com.arezzo.sky.practice;

/**
 * @author Priytanshu
 *
 */

public class NumberReverse {

	static int num = 123321;
	static int remainder;
	static int reverse = 0;
	static int temp;

	public static void main(String[] args) {
		
		//System.out.println(numberRevers(num));
		temp = num;
		System.out.println(numberPalnidrome(temp));
		
	}

	/**
	 * @param num
	 * @return
	 */
	public static int numberRevers(int num) {
		
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		return reverse;
	}

	public static String numberPalnidrome(int num) {
		System.out.println(num);
		String msg;
		if (num == numberRevers(num))
			msg = "Palindrome";
		else
			msg = "Non-Palindrome";
		return msg;
	}
}
