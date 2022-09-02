package org.javatest;

import java.util.Scanner;

public class JavaProjectTest {
	public static void main(String[] args) {
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.of. row to be printed");
		int nextInt = sc.nextInt();*/
		for(int i=1; i<=5;i++) {
			for(int j=5; j>=i; j--) {
			System.out.print(" ");	
		}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		
}
}