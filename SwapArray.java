/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class SwapArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ar[]={1, 2, 3, 4, 5,6};
        
        for(int i=0;i<ar.length/2;i++)
        {
          int temp=ar[ar.length-1-i];
          ar[ar.length-1-i]=ar[i];
          ar[i]=temp;
        
        }
        System.out.println(Arrays.toString(ar));
    }
    
}
