package guvi;

import java.util.Scanner;

public class reverse1 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String binaryString =String.valueOf(n);
        System.out.println(Integer.parseInt(binaryString,2));
}
}
