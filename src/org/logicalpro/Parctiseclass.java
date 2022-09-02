package org.logicalpro;

public class Parctiseclass {
	public static void main(String[] args) {
		/*int a=100;
		int b=20;*/
		/*int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);*/
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);*/
		String s= "abcdefghijklmnopq";
		//String stt=s;
	String rev="";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			rev=rev+charArray[i];
			
		}
		
		System.out.println(rev);
		/*String stt2=rev;
		if(stt==stt2) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}*/
}
	
}