package org.javatest;

public class Day4Question {
	
	public static void main(String[] args) {
		 for (int i = 1; i <= 10; i++) {
		      if (i == 5) {
		        break;
		      }
		      System.out.println(i);

		    }
		 System.out.println("<<<<<<question 4>>>>>>");
		 for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(j);
		      }

		 }
		 System.out.println("<<<question 5>>>");
		 for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= 3; j++) {
		        System.out.println(i);
		      }
		 }
		 System.out.println("<<<<Question 6>>>>");
		 for (int i = 1; i <= 3; i++) {
		      for (int j = 1; j <= i; j++) {
		        System.out.println(j);
		      }

		    }
		 System.out.println("<<<question 7>>>");
		 for (int i = 1; i <= 3; i++) {
		      for (int j = i + 1; j <= 3; j++) {
		        System.out.println(j);
		      }

		    }
		

	}
}



