import java.util.*;
public class Sun {
  public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int[] a = new int[n];
  for(int i=0;i<n;i++) {
  a[i]=sc.nextInt();
     }
    int count =0;
  int max=a[0];
  for(int i=1;i<n;i++) {
   if(max<a[i]) {
   max=a[i];
   if(a[i]>max);
   count++;
    }
   }
 System.out.print(count);
    }
   }
   
  
      
   
