
package primenumber;
/*
Problem: Classify Prime and Non-Prime Numbers from an Array

Write a Java program that takes an array of integers and separates them into 
prime and non-prime numbers. 

*/


public class PrimeNumber {

    public static void main(String[] args) {
        String PrimeNum =" ";
        String NonPrime =" ";
        int ar[]={1,3,2,5,6,7,8,10,121};
        for(int n:ar)
        {
            if(Prime(n)){PrimeNum+=n+" ";}
             else{
                NonPrime+=n+" ";
            }  
        }
        System.out.println("Prime Numbers :"+ PrimeNum);
        System.out.println("Non Prime Numbers :"+ NonPrime);
    }
    static boolean Prime(int n)
        {
            if(n<=1) return false;
            for (int i=2;i*i<=n;i++)
            {
                if(n%i==0)return false;
            }
            return true;
        }
}
 
