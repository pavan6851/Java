package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9, 11, 12, 17};
        int target = 12;
        int result = binarysearch(arr, target);
        System.out.println(result);
    }

    static int binarysearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
