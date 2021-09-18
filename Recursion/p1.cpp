public class Main4{
    public static void main(String[] args) {
          int arr[] = {1,2,3,4,5,6};
          int target = 5;
        System.out.println(InsertSearch(arr , target ,  0  , arr.length-1));
    }

    public static int InsertSearch(int[] arr , int target , int s , int e)
    {
//        And s > e then we get that numbers that are s > e and then s is greater than  return-1
        if(s > e)
        {
            return -1;
        }
       int m = s + (e - s) / 2;
//        Recurrence relation in python numbers and codes and learning and
       if(arr[m] == target)
       {
           return m;
       }

       if(target < m)
       {
           return InsertSearch(arr , target , 0 , m-1);
       }
       return InsertSearch(arr, target , m+1 , e);
    }
}
