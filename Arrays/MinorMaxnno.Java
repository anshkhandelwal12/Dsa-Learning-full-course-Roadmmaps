import java.util.Scanner;

public class MinNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {34,5,6,7,345,67};

        System.out.println(min(arr));
        System.out.println(max(arr));
    }


    static int max(int[] arr)
    {
        int ans = arr[0];

        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
   static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < ans)
            {
                ans = arr[i];
            }
        }
        return ans;
    }

}
