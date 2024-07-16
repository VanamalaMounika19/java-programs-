import java.util.*;

   public class RecExample{   
       public static int linearSearchRec(int[] arr,int idx,int key) {
           if(arr[idx]==key)
           return idx;
           else
           return linearSearchRec(arr,idx+1,key);
       }
       
   public static int linearSearch(int[] arr, int key){ 
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int key = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
      System.out.print(linearSearchRec(arr,0,key));
    
      
    }
}