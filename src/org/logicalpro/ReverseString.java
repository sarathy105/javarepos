package org.logicalpro;

public class ReverseString {

	public static void main(String[] args) {
		String name ="the book is good";
		String[] split = name.split("\\s");
		String str="";
		for(int i=0;i<split.length;i++) {
			String string = split[i];
			//System.out.println(string);
			String obj="";
			for(int j=string.length()-1;j>=0;j--) {
				obj=obj+string.charAt(j);
			}

			str=str+obj+" ";
		}

		System.out.println(str);
	}
}


