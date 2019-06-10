package guvi;

import java.util.Scanner;

public class sumoftwo {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int a[] = new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
		a[i] = sc.nextInt();
	}
	for(int i=0;i<n;i++){
		sum = sum +a[i];
			if(a[i]==k){
			break;
		}
	}
	System.out.println(sum);;
}
}
