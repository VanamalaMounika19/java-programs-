public class Quick {
    public static void quicksort(int[] res,int low,int high) {
        if(low<high) {
            int idx=partition(res,low,high);
            quicksort(res,low,idx-1);
            quicksort(res,idx+1,high);
        }
    }
    public static int partition(int[] res,int low,int high) {
    int pivot=res[low];
    int i = low;
    int j=high;
    while(i<j) {
        while(i<high && res[i]<=pivot) {
      //  while(res[i]<=pivot) {
            i++;
        }
        while(res[j]>pivot) {
            j--;
        }
        if(i<j) {
            int temp=res[i];
            res[i]=res[j];
            res[j]=temp;
        
        }
    }
    int temp=res[low];
    res[low]=res[j];
    res[j]=temp;
    return j;
    
        
    }
    public static void main(String args[]) {
        int a[]={50,20,25,40,18,60};
        int n = a.length;
        quicksort(a,0,n-1);
    
    for(int i=0;i<n;i++) {
        System.out.print(a[i]+" ");
     }
    }
}