
package primenumber;


public class PalindromeNum {

    public static void main(String[] args) {
        String PalinNum =" ";
        String NonPalin =" ";
        int ar[]={101,200,111,131,150};
        
        for (int m :ar)
        {
            if(Palindrome(m))
            {
                PalinNum+=m+" ";
            }
            else{NonPalin+=m+" ";}
        
        }
        System.out.println("Palin Numbers are :"+PalinNum);
                System.out.println("Non Palin Numbers are :"+NonPalin);

        
        
    }
     static boolean Palindrome(int n)
     {
      int num=n;
      int reverse=0;
      
      while(num>0)
      {
          int digit=num%10;
          reverse=reverse*10+digit;
          num/=10;
      }
     if(n==reverse)return true;
     
     return false;
     }
}
