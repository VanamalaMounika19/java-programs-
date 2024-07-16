import java.util.*;
public class MergeSort1 {
    public static void mergeSort(int[] res,int low,int high) {
        if(low<high) {
         mid =(low+high)/2;
        mergeSort(res,low,mid);
        mergeSort(res,mid+1,high);
        merge(res,low,mid,high);
        }
    }
     public static void merge(int[]res,int low,int high,int mid) {
        //int mid = (low+high)/2;
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] a = new int[n1];
        int[] b = new int[n2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1) {
            a[i]=res[k];
            i++;
            k++;
            
        }
        while(j<n2) {
            a[j]=res[k];
            j++;
            k++;
        }
          i=0;
         j=0;
        k= 0;//first 0
        while(i<n1 && j<n2) {
            if(a[i]<b[j]) {
                res[k]=a[i];
                i++;
            }
            else {
                res[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<n1) {
             res[k] = a[i];
            i++;
            k++;
        }
        while(j<n2) {
             res[k] = b[j];
            j++;
            k++;
    }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        //int n2=sc.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<n1;i++) {
            a[i]=sc.nextInt();
        }
        mergeSort(a,0,n1-1);
       
        for(int m=0;m<n1;m++) {
            System.out.print(a[m]+ " ");
        }
        
    }
}