package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int val=0;
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					val = a[i];
					System.out.println(val);
                    break;
				}
				
				}
			}
		if(val ==0){
			System.out.println("unique");
		}
		}
		
		
		}
		
	
