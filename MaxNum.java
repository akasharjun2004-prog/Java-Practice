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
public class MaxNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ar[]={3, 7, 2, 9, 5};
        int max=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println("Max number is :"+max);
    }
    
}
