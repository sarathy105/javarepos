package org.logicalpro;

public class CountofEvenandoddNumbers {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		//to get the count of even number 
		for(int i=0; i<50;i++) {
			// to get even count we have to use ==, else != for odd
			if(i%2!=0) {
				System.out.println(i);
				count++;
			}
				
		}
		System.out.println("count of even number:"+count);
	
		//to get the count of even number 
	for(int i=0; i<50;i++) {
		// to get even count we have to use ==, else != for odd
		if(i%2==0) {
			System.out.println(i);
			count1++;
		}
			
	}
	System.out.println("count of odd nuber :"+count1);
}
}
