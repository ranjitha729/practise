package guvi;

import java.util.Scanner;

public class hello {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		System.out.println(s);
		
}
}
