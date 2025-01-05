package BinarySearch;

public class BS_FloorCeil {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 4, 4, 4, 6, 17, 20 };
        // BinarySearch(arr, 4, true);
        int ans = BinarySearchFloor(arr, 1);
        System.out.println("Ans iz:" + ans);

        int ans1 = BinarySearchCeil(arr, 1);
        System.out.println("Ans is:" + ans);

    }

    static int BinarySearchFloor(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                ans = arr[mid];
            } else {
                end = mid - 1;
            }
        }

        return ans;
        
    }

    static int BinarySearchCeil(int arr[], int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = arr[mid];
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
                
            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }

        return ans;
    }

}

// Floor: find the largest element less than or equal to the target
// Ceil: find the smallest element greater than or equal to the target
