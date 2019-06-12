package guvi;

import java.util.Scanner;

public class concat {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String s = str1.replaceAll("\\s", ""); 
		System.out.println(s);
}
}
