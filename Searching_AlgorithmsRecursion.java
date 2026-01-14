////import java.util.Scanner;
////import java.util.Arrays;
////
////public class Searching_AlgorithmsRecursion {
////    public static void main(String[] args) {
////
////        int arr[] = {1,2,3,4,5,6,7,8,9,10};
////        int l = 0;
////        int h = arr.length - 1;
////        int key = 8;
////
////        int result = binarySearch(arr, key, l, h);
////
////        if (result != -1) {
////            System.out.println("Item found at index: " + result);
////        } else {
////            System.out.println("Item not found");
////        }
////    }
////
////    public static int binarySearch(int arr[], int key, int l, int h) {
////
////        while (l <= h) {
////
////            int mid = (l + h) / 2;
////
////            if (key == arr[mid]) {
////                return mid;
////            }
////            else if (key < arr[mid]) {
////                h = mid - 1;
////            }
////            else {
////                l = mid + 1;
////            }
////        }
////        return -1;
////    }
////}//class LinearSearch {
////
////    public static int linearSearch(int[] arr, int target) {
////
////        for(int i = 0; i < arr.length; i++) {
////            if(arr[i] == target) {
////                return i;   // found
////            }
////        }
////        return -1;  // not found
////    }
////
////    public static void main(String[] args) {
////        int[] arr = {5, 12, 9, 21, 3};
////        int index = linearSearch(arr, 21);
////
////        System.out.println(index == -1 ? "Not Found" : "Found at index: " + index);
////    }
////}
////Binary search by Recursive method
////public class Searching_AlgorithmsRecursion {
////    public static void main(String[] args) {
////
////        int arr[] = {2, 4, 6, 8, 10, 12, 14};
////        int key = 10;
////
////        int result = binarySearch(arr, 0, arr.length - 1, key);
////
////        if (result != -1) {
////            System.out.println("Element found at index: " + result);
////        } else {
////            System.out.println("Element not found");
////        }
////    }
////
////    public static int binarySearch(int[] arr, int l, int h, int key) {
////
////        // Base case: element not found
////        if (l > h)
////            return -1;
////
////        int mid = (l + h) / 2;
////
////        // If element found
////        if (arr[mid] == key)
////            return mid;
////
////        // Search in left half
////        if (key < arr[mid])
////            return binarySearch(arr, l, mid - 1, key);
////            // Search in right half
////        else
////            return binarySearch(arr, mid + 1, h, key);
////    }
////}
////binary search bu iterative method
//public class Searching_AlgorithmsRecursion{
//    public static void main(String[] args) {
//        int no = factorial(5);
//        System.out.println("Factorial: "+ no);
//    }
//    public static int factorial(int n){
//        if (n == 5) {
//            return n*factorial(n-1);
//        }else{
//            return n-1;
//        }
//    }
//}
//public class Searching_AlgorithmsRecursion {
//
//    public static int sumArray(int[] arr, int index) {
//        if (index == arr.length) {
//            return 0;
//        }
//        return arr[index] + sumArray(arr, index + 1);
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 30};
//
//        int sum = sumArray(arr, 0);
//
//        System.out.println("Array: [10, 20, 30]");
//        System.out.println("Sum = " + sum);
//    }
//}
public class Searching_AlgorithmsRecursion  {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        int n = 7;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}

