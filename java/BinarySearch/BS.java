package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 11, 13, 15, 18, 20 };
        int arr1[] = { 20, 18, 15, 13, 11, 5, 2 };
        // BinarySearch(arr, 18);
        // BinarySearchDec(arr1, 11);

        BinarySearchOrderAgnostic(arr, 15);
        BinarySearchOrderAgnostic(arr1, 5);
    }

    static void BinarySearch(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ans);
        }
    }

    static void BinarySearchDec(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + ans);
        }
    }

    // Order agnostic BinarySearch where we are not aware of the orfer of the
    // array whetther it is in increasing or decreasing order

    static void BinarySearchOrderAgnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
            BinarySearch(arr, target);
        } else {
            BinarySearchDec(arr, target);
        }
    }

}
