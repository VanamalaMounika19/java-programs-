import java.util.*;
public class LeaderReverse {
   public static void leader(int [] a) {
     int n = a.length;
    int s = n-1;
    System.out.print(s);
    for(int i=n-2;i>=0;i--) {
     if(a[i]>s) {
       s=a[i];
     System.out.print(s);
    }
      //System.out.print(s);
   }
}
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++) {
        a[i] = sc.nextInt();
      }
         leader(a);
    }
}
   