package guvi;

import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();int b=0;
	int a[] = new int[n];
	for(int i=0;i<n;i++){
		a[i] = sc.nextInt();
		if (a[i]==k){
			b = k;
			break;
		}
	}
	if(b!=0){
		System.out.println("yes");
}
	else{
		System.out.println("no");
	}
	}
}
