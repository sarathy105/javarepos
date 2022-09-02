package org.logicalpro;

public class SwapTheNumber {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		/*a=b+a;
		b=a-b;
		a=a-b;*/
		
		int c=b;
		b=a;
		a=c;
		

		System.out.println(a);
		System.out.println(b);
	}

}
