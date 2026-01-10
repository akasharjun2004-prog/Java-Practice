/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

import java.util.HashSet;

public class TwoPointer {

    static boolean Find(int target,int[]ar)
    {
    HashSet<Integer> set = new HashSet<>();
    for(int num : ar) {
    if(set.contains(target - num)) {
        return true;
          }
         set.add(num);
        }
    
    return false;
    }
    public static void main(String[] args) {
        int ar[]={1, 2, 4, 5, 7,8};
        int target=20;
       int left=0;
        int right=ar.length-1;
       boolean found=false;
       while(left<right)
       {
           int sum=ar[left]+ar[right];
           if(sum==target)
           {
               found=true;
               break;
           }
           else if(sum>target)
           {
               right--;
           }
           else
           {
               left++;
           }

       }

        System.out.println(TwoPointer.Find(target, ar));
    System.out.println(found);
    }
    
 
}
