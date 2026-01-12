
package primenumber;

public class FindMaxOfSubarray {

    public static void main(String[] args) {
        int ar[]={2, 1, 5, 1, 3, 2};
        
        
        int k=3;
        int sum=0;
        for(int i=0;i<k;k++)
        {
            sum+=ar[i];
        }
        int MaxSum=sum;
        
        for(int i=k;i<k;i++)
        {
            sum=sum-ar[i-k]+ar[i];
            MaxSum=Math.max(MaxSum, sum);
        }
        System.out.println(MaxSum);
    }
    
}
