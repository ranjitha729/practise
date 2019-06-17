package guvi;

import java.util.Scanner;

public class reverse1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        String s = String.valueOf(n);
        String s1 = s.substring(0,1);
        char c = s.charAt(s.length()-1);
        int k = Integer.parseInt(s1+c);
        int sum=0,r=0;
        while(k !=0){
        	r = k % 10;
              k = k / 10;
              sum = sum + r;
        }
		System.out.println(sum);
}
}
