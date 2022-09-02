package org.javatest;

import java.util.Scanner;

public class VoteEligible {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String next = sc.next();
		
		System.out.println("Enter you age");
		int nextInt = sc.nextInt();
		if(nextInt<18) {
			System.out.println("Your are not elegible to vote");
		}else {
		System.out.println("Your eligible to vote");
	}
	}

}
