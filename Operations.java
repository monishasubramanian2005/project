package mypackage;
import java.util.Scanner;

public class Operations {

		int b;
		 void operations(int no,int[] arr) {
	  switch(no) {
	  case 1 : 
		  b=0;
		  for(int i=0;i<arr.length;i++) {
		  b +=arr[i];
		  }
		  System.out.println(+b);
		  break;
	  case 2 : 
		 b=arr[0];
		  for(int i=1;i<arr.length;i++) {
			  b-=arr[i];}
		  System.out.println(b);
		  break;
	  case 3 :
		 b=arr[0];
		 if(b==0 || b==1) {
			 System.out.println("error message");
		 }
		 else{
		  for(int i=1;i<arr.length;i++) {
			  b/=arr[i];}
		  
		  System.out.println(b);
		 }
		  break;
	  case 4 : 
		b=1;
		  for(int i=0;i<arr.length;i++) {
			  b*=arr[i];
		  }
		  System.out.println(b);
		  break;
	  case 5 : 
		 
		  for(int i=0;i<arr.length;i++) {
			  b%=arr[i];}
		  System.out.println(b);

		  break;

	  default:

		  System.out.println("Invalid");
	  }
	  }


	}
