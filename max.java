import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            if(a[i]>max){
                max = a[i];
            }
            max = max;
             }
             
        
       
        System.out.println(max);
    }
}
