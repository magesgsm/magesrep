package org.sample;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter value:");
		int num = s.nextInt();
		int org = num;
		int ams = 0;

		while (org != 0) {	
			int r = org % 10;
			ams = ams + (r * r * r);
			org = org / 10;
		}
		System.out.println(ams);
		if (num == ams) {
			System.out.println("number is amstrong number");
		}

		else {
			System.out.println("not amstrong number");
			System.out.println("not amstrong number1");
			System.out.println("not amstrong number2");
			
		}

	}
}