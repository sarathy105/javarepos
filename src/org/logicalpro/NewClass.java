package org.logicalpro;

public class NewClass {

	public static void main(String[] args) {
		String obj="the book is good";
		char[] character= obj.toCharArray();
		String rev="";
		for(int i=character.length-1;i>=0;i--) {
			rev=rev+character[i];
		}
		System.out.println(rev);
		
	}

}
