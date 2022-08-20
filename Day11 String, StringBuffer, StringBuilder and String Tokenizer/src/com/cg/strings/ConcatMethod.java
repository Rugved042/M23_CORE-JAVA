package com.cg.strings;

import java.util.Scanner;

public class ConcatMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = s.nextLine();
		System.out.println(10+20+" Rugved "+" Kaluram "+" Naik "+10+20);
		System.out.println(str.concat(str1));
		s.close();
	}
}
