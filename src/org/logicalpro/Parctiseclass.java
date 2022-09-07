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
		int a=200;
		int b=100;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);

		
	String str = "MBN^%^75tfMNB&6567hg";
	int capcount=0;
	int smallcount=0;
	int number=0;
	int specialchar=0;
	
	for (int i=0;i<str.length();i++) {
		char charAt = str.charAt(i);
		
		if(charAt>='a' &&  charAt<='z') {
			smallcount++;
		}else if(charAt>='A' &&  charAt<='B') {
				capcount++;
		} else if(charAt>='0' &&  charAt<='9') {
					number++;
		} else {
			specialchar++;
		}
	}
		System.out.println("capcount :"+capcount);
		System.out.println("small count :"+smallcount);
		System.out.println("number :"+number);
		System.out.println("specialchar:"+specialchar);
		
			
		}		
		
	}

	
