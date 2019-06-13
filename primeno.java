package guvi;

import java.util.Scanner;

public class sumof2 {
	public static void main(String[] args) {
		int i,n,count=0;
   	 Scanner sc = new Scanner (System.in);
   	  System.out.println("enter the number");
   	  n = sc.nextInt();
   	  for(i=2; i<n;i++) {
   		 if(n%i==0) {
   			 count++;
   		 break;
   		  }
   	  }
   		  if (count==0) {
   			  System.out.println("yes");
   		  }
   		  else {
   			  System.out.println("no");
   		  }
   	  }}
