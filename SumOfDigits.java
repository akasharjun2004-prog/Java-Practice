/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author HP
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=12345;
         int sum=0;
         
         while(a>0)
         {
             sum+=a%10;
             a=a/10;
         }
     
         System.out.println(sum);
    }
    
}
