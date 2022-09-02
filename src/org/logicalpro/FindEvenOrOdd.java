package org.logicalpro;

import java.util.Scanner;

public class FindEvenOrOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the number");
		int i= sc.nextInt();
		if(i%2==0) {
			System.out.println("It is a even number");
		}
		else {
			System.out.println("It is a odd number");
		}

}
}
