import java.util.*;
//case2
public class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++) {
         if(a[j]==-1) 
          continue;
       
        int count=1;
        for(int i=j+1;i<n;i++) {
            if(a[j]==a[i]) {
                count++;
               a[i]=-1;
            }
        }
        if(count>0)
          
        System.out.print(a[j]+" "+count);
        }
    }
}