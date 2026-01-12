
package primenumber;

public class Fibannocci {

    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a+" ");
        int c=a+b;
        a=b;
        b=c;
        }
    }
    
}
