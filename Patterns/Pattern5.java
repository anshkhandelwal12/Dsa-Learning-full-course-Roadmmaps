1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

  
  package com.company;
public class Main8{
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; ++col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
