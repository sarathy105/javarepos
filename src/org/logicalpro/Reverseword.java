package org.logicalpro;

import java.util.Scanner;

public class Reverseword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String nextLine = sc.nextLine();
		char[] array = nextLine.toCharArray();
		String rev=" ";
		for(int i=array.length-1; i>=0;i--) {
			rev=rev+array[i];
			
		}System.out.println(rev);
	}

}
