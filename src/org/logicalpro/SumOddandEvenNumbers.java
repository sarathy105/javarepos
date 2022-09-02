package org.logicalpro;

public class SumOddandEvenNumbers {
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		//to get the sum of odd number 
		for(int i=0; i<50;i++) {
			// to get even count we have to use ==, else != for odd
			if(i%2!=0) {
				System.out.println(i);
				sum+=i;
			}
				
		}
		System.out.println("Sum of Odd number:"+sum);
	
		//to get the sum of even number 
	for(int i=0; i<50;i++) {
		// to get even count we have to use ==, else != for odd
		if(i%2==0) {
			System.out.println(i);
			sum1+=i;
		}
			
	}
	System.out.println("Sum of Even Numbers :"+sum1);
}

}


