package guvi;

import java.util.Scanner;

public class sumof2 {
	public static void main(String[] args) {
		int n1,n2,n3=0;
	Scanner	sc = new Scanner(System.in);		
	n1 = sc.nextInt();
	n2 = sc.nextInt();
	n3 = n1 - n2;
	if(n3 % 2 ==0){
		System.out.println("even");
	}
	else{
		System.out.println("odd");
	}
}
}
