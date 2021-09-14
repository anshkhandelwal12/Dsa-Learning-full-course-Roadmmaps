// Pattern 1 Example 
     * 
    *  * 
   *  *  * 
  *  *  *  * 
 *  *  *  *  * 


package com.company;

public class Main8{
    public static void main(String[] args) {
          pattern1(5);
    }
    public static void pattern1(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                if(col <= n - row)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
