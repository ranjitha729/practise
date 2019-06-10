package guvi;

import java.util.Scanner;

public class reverseno {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		while(n !=0){
			int digit = n % 10;
            r= r* 10 + digit;
            n = n / 10;
		}
		System.out.println(r);
}
}
