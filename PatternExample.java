import java.util.*;
   class PatternExample{
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<=n;i++) {
         for(int j=1;j<=n;j++) 
           {
              
              if(i>=j)
             System.out.print(i+"");
           else 
             System.out.print(" "+" ");             
            }
           System.out.println();
 
        }
            for(int i=n;i>=1;i--) {
         for(int j=1;j<=n;j++) 
           {
              
              if(i>=j)
             System.out.print(i+"");
           else 
             System.out.print(" "+" ");             
            }
           System.out.println();

          }
    }
}
