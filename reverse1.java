package guvi;

import java.util.Scanner;

public class reverse1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String [] s = str1.split("\\s"); 
		for(String i : s){
			StringBuffer s1 = new StringBuffer(i);
			s1.reverse();
			System.out.print(s1+" ");
		}
		
}
}
