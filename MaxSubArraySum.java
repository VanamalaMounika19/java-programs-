import java.util.*;
public class MaxSubArraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int l=0;l<n;l++) {
        for(int j=l;j<n;j++) {
            int sum=0;
            for(int k=l;k<=j;k++) {
                
                System.out.print(a[k]+" ");
                sum=sum+a[k];
            }
            //System.out.println();
        
                System.out.println(sum);
                if(max<sum) {
                    max=sum;
                }
        }
        System.out.println(max);
            
       }     
        
    }
}