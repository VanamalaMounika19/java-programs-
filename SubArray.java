import java.util.*;
public class SubArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++) {
            for(int k=0;k<=j;k++) {
                System.out.print(a[k]+ " ");
            }
            System.out.println();
        }
    }
}