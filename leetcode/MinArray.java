package Arrays;

import java.util.Arrays;

public class MinArray {
    public static void main(String[] args)
    {
        int[] arr = {3,1,14,2,6,10};
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
