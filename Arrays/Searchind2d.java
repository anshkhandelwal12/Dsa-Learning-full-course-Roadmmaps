import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.Scanner;

public class Seachin2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] ans = search(arr , target);
        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MAX_VALUE);

    }

// writtens the maxelemts that are comming in the side and numbers that arereapting
    static int max(int[][] arr)
    {
        int max = Integer.MAX_VALUE;
        for (int [] ints: arr )
        {
            for (int elements: ints)
            {
                if (elements > max)
                {
                    max = elements;
                }
            }
        }
        return max;
    }
  
//   Finding and Searching the elements in the 2d array elements
  
   static int[] search(int[][] arr, int target) {
        int max_no = Integer.MIN_VALUE;
        for (int row = 0 ; row < arr.length ; row++)
        {
            for (int col = 0 ; col < arr[row].length ; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[] {row , col};
                }
            }

        }
        return new int[] {-1,-1};
    }
}
