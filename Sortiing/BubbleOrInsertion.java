import java.util.Arrays;

public class Main2{
    public static void main(String[] args) {
        int[] arr = {5 , 3 , 4 , 1 , 2};
        Bubble(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
       
    }

   static void Bubble(int[] arr) {
        for(int i = 0 ;  i < arr.length ; i++)
        {
            boolean swapped  = false;

            for(int j = 1 ; j <arr.length-i ; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
    }


    static void selection(int[] arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            int end = arr.length-i-1;
            int max = MaxIndex(arr , 0 , end);

            swap(arr , max , end);
        }
    }

    private static int MaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start  ; i<=end ; i++)
        {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[] , int start , int end)
    {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}

