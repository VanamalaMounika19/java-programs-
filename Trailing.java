import java.util.*;
public class Trailing {
 public static int trailingZeros(int n) {
     int res =0;
    int powOf5=5;
    if(n>=powOf5) {
    res=res+(n/powOf5);
  powOf5=powOf5*5;
       }
 return res;
    }
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
   System.out.print(trailingZeros(n));
      }
    }
