import java.util.*;
public class Main {
 public static void main(String args[]) {
  Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int [] a = new int[n];
  for(int i=0;i<n;i++) {
  a[i]=sc.nextInt();
   }
   int k =sc.nextInt();
   for(int i=1;i<=k;i++) {
   int temp=a[n-1];
   for(int j=n-2;j>=0;j--) {
   a[j+1]=a[j];
   a[j]=temp;
   }
}
 for(int i=0;i<n;i++) {
 
  System.out.println(a[i]+ " ");
    }
    
  }

}
 