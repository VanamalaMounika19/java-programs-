public class FrequencyCase4{
    public static void main(String args[]) {
        int[] a={3,2,1,2,2,1,3,1,5,5,4,1};
        int n = a.length;
        int[] freq = new int [10];
        for(int i=0;i<n;i++) {
            freq[a[i]]++;
        }
        int count=0;
        for(int i=0;i<freq.length;i++) {
            if(freq[i]>0) {
                count++;
            }
        }
        while(count-->0) {
           // for(int i=0;i<freq.length;i++) {
            int maxindex=0;
            for(int i=0;i<freq.length;i++) {
            if(freq[maxindex]<=freq[i]) 
                maxindex=i;
            }
            System.out.print(maxindex+""+freq[maxindex]);
            freq[maxindex]=0;
             
        }
            
        
    }
}