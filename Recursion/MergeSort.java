
// TIME COMPLEXITY ---> O(nlogn)
// SPACE COMPLEXITYN ---> O(N)


import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements: ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        int[] arr = {-1,5,3,4,0};
        int n = arr.length;
        merge(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    static void merge(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        merge(arr, start, mid);
        merge(arr, mid, end);

        mergeSort(arr, start, mid, end);
    }
    static void mergeSort(int[] arr, int s, int m, int e) {

        int[] mix = new int[e - s];
        int i = s, j = m, k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }       
}


// import java.util.Arrays;
// import java.util.Scanner;

// public class MergeSort {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter the number of elements: ");
//         // int n = sc.nextInt();
//         int arr[] = {-2,3,-5};
//         // System.out.println("Enter the elements: ");
//         // for (int i = 0; i < n; i++) {
//         //     arr[i] = sc.nextInt();
//         // }
//         int[] ans = merge(arr);
//         System.out.println(Arrays.toString(ans));
//     }
//     static int[] merge(int[] arr) {
//         if (arr.length == 1) {
//             return arr;
//         }

//         int mid = arr.length / 2;

//         int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
//         int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

//         return MergeSort(left, right);
//     }
//     static int[] MergeSort(int[] first, int[] second) {

//         int[] mix = new int[first.length + second.length];
//         int i = 0, j = 0, k = 0;

//         while (i < first.length && j < second.length) {
//             if (first[i] < second[j]) {
//                 mix[k] = first[i];
//                 i++;
//             }
//             else {
//                 mix[k] = second[j];
//                 j++;
//             }
//             k++;
//         }

//         while (j < second.length) {
//             mix[k] = second[j];
//             j++;
//             k++;
//         }

//         while (i < first.length) {
//             mix[k] = first[i];
//             i++;
//             k++;
//         }
//         return mix;
//     }       
// }