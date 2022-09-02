package org.logicalpro;

public class specialChar {
	public static void main(String[] args) {
		
	
	String str ="a!@kj38ur&87%^";
	String replaceAll = str.replaceAll("[\\W\\d]", "");
	System.out.println(replaceAll);
	/*to print only numbers("\\D", "")
	 * to remove spl characters and print rest("\\W", "")
	to remove numbers and print rest("\\d", "")
	to print only word("[\\W\\d]", "")*/
}
}
