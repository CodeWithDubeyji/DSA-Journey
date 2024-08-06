public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,1,2,4,5,7,9,45,56,56};// must be sorted
        int ans = RecursiveBS(arr, 0, arr.length-1, 7);
        System.out.println(ans);
    }
    static int RecursiveBS (int[] arr, int start, int end, int target) {

        if (start <= end) {

            int mid = start + (end - start) / 2;
    
            if (arr[mid] == target) {
                return mid;
            }
    
            if (target < arr[mid]) {
                return RecursiveBS(arr, start, mid - 1, target);
            }
                return RecursiveBS(arr, mid + 1, end, target);
        }

        return -1;
    }
}
