package mypackage;

import java.util.Scanner;

public class Calculator {

	  public static void main(String args[]) {

		Operations o = new Operations();

		   Scanner s =new Scanner(System.in);

		   System.out.println("1. Addition ");

		   System.out.println("2. Subtraction ");

		   System.out.println("3. Division ");

		   System.out.println("4. Multiplication ");

		   System.out.println("5. Modules ");

		   System.out.println();

		   System.out.print("Enter operation number: ");
	        int operationNumber = s.nextInt();
	        
	        // Clear the buffer
	        s.nextLine(); 

	        System.out.print("Do you want to change the operation number? (Yes/No): ");
	        String changeOperation = s.nextLine();
	        
	        if (changeOperation.equalsIgnoreCase("Yes")) {
	            System.out.print("Enter new operation number: ");
	            operationNumber = s.nextInt();
	            s.nextLine(); // Clear the buffer
	        }
		   
		   System.out.println("Give no of input" );
		   int input =s.nextInt();
		   s.nextLine();
		   System.out.print("Do you want to change the input number? (Yes/No): ");
	        String changeInput = s.nextLine();
	        int[] arr;
	        
	        if (changeInput.equalsIgnoreCase("Yes")) {
	            System.out.print("Enter the new number of inputs: ");
	            int newInputCount = s.nextInt();
	            arr = new int[newInputCount];
	            for (int i = 0; i < newInputCount; i++) {
	                System.out.print("Enter value for arr " + (i + 1) + ": ");
	                arr[i] = s.nextInt();
	            }
	        } else {
	            arr = new int[input];
	            for (int i = 0; i < input; i++) {
	                System.out.print("Enter value for arr " + (i + 1) + ": ");
	                arr[i] = s.nextInt();
	            }
	        }

	        o.operations(operationNumber, arr);
		   
		 
		  
		   
		   }
	}


