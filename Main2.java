import java.util.*;
public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++) {
        int count=0;
        for(int i=0;i<n;i++) {
            if(a[i]==j) {
                count++;
            }
        }
        if(count>0)
          
        System.out.print(j+" "+count);
        }
    }
}