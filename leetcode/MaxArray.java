package Arrays;

public class MaxArray {
    public static void main(String[] args)
    {
        int[] arr = {3,1,14,2,6,10};
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }

        }
        System.out.println(max);

    }
}


//        for (int i = 0; i < arr.length - 1; i++)
//        {
//              if (arr[i] > max)
//        {
//max = arr[i];
//        }
//
//        }
//        System.out.println(max);
