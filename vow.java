package guvi;

import java.util.Scanner;

public class vowel {
	 public static void main(String args[]){
		  Scanner sc = new Scanner (System.in);
		  int n = sc.nextInt();
		  String s = sc.next();
		  String r = "";
		  String p = "";
		  for(int i=0;i<s.length();i++){
			  char ch = s.charAt(i);
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				  r = r + ch;
          else
				  p  = p + ch;
			  
		  }
		  StringBuffer str = new StringBuffer(p);
			str.reverse();
			System.out.println(str);
	 }
}
