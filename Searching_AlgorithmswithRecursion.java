//Binary search by Recursive method
//public class Searching_AlgorithmswithRecursion {
//    public static void main(String[] args) {
//
//        int arr[] = {2, 4, 6, 8, 10, 12, 14};
//        int key = 10;
//
//        int result = binarySearch(arr, 0, arr.length - 1, key);
//
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }
//
//    public static int binarySearch(int[] arr, int l, int h, int key) {
//
//        // Base case: element not found
//        if (l > h)
//            return -1;
//
//        int mid = (l + h) / 2;
//
//        // If element found
//        if (arr[mid] == key)
//            return mid;
//
//        // Search in left half
//        if (key < arr[mid])
//            return binarySearch(arr, l, mid - 1, key);
//            // Search in right half
//        else
//            return binarySearch(arr, mid + 1, h, key);
//    }
//}

//class LinearSearchRecursive {
//
//    // Recursive function
//    public static int linearSearchRec(int[] arr, int target, int index) {
//
//        // base case: index out of range
//        if(index == arr.length) {
//            return -1;   // not found
//        }
//
//        // check current element
//        if(arr[index] == target) {
//            return index;
//        }
//
//        // recursive call for next index
//        return linearSearchRec(arr, target, index + 1);
//    }
//
//    // Main function
//    public static void main(String[] args) {
//
//        int[] arr = {5, 12, 7, 25, 3};
//        int target = 25;
//
//        int result = linearSearchRec(arr, target, 0);
//
//        if(result == -1)
//            System.out.println("Element not found");
//        else
//            System.out.println("Found at index: " + result);
//    }
//}
class BinarySearchRecursive {

    public static int binarySearchRecursive(int[] arr, int low, int high, int target) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearchRecursive(arr, low, mid - 1, target);
        }

        return binarySearchRecursive(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = binarySearchRecursive(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
