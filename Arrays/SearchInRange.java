import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {12,434,56,7,8,9};
        int target = 56;
        System.out.println(SearchinRange(arr , target , 1  ,4));
    }

    static int  SearchinRange(int[] arr, int target , int start ,int end) {
        if (arr.length == 0)
        {
            return 0;
        }
        for (int i = start ; i <= end ; i++)
        {
            int element = arr[i];
            if(element == target)
            {
                return i;
            }
        }
        return -1;
    }

}
