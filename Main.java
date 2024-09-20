/**** Chapter 1 ****/
/**** Linear Search Algorithm****/


// Linear Search -> Search an element in an array by traversing the array from the starting to the end, till the element is found like bruteforce
// Best Case Time Complexity -> O(1)
// Worst Case Time Complexity -> O(n)
// Best Case Space Complexity -> O(1)
// Worst Case Space Complexity -> O(1)



// Example of search in the array


/*
public class Main {
   static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] num = {23, 40, 2, 6, 65, 23, 90, 85};
        int target = 200;

        System.out.println(linearSearch(num, target));
        System.out.println(linearSearch2(num, target));
    }
} */



// Search in string


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Mayank";
        char target = 'a';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if  (str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if  (ch == target) {
                return true;
            }
        }

        return false;
    }
} */



// Binary Search -> Search an element in an array by dividing the array into two parts and then search the element in the two parts and then again divide the array into two parts and then search the element in the two parts and so on till the element is found
// Best Case Time Complexity -> O(1)
// Worst Case Time Complexity -> O(log n)
// Best Case Space Complexity -> O(1)
// Worst Case Space Complexity -> O(1)



// Example of binary search in a sorted array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(binarySearch(arr, 12));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // int mid = (start + end) / 2;     // Exceeds the limit of int in some cases
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        
        return -1;
    }
} */



// Order Agnostic Binary Search -> Search the element in the array without knowing the order of the array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.out.println(orderAgnosticBS(arr, 12));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean ifAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2;     // Exceeds the limit of int in some cases
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ifAsc) {
                if (target < arr[mid]) {
                end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }
} */



/***************************/
/**** Practice Question ****/



// Search in range


/*
public class Main {
    public static void main(String[] args) {
        int [] num = {5, 8, 23, 4, 1, 3, 44};

        System.out.println(linearSearch(num, 4, 1, 4));
    }

    static int linearSearch(int [] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
} */



// Find minimum number in the array


/*
public class Main {
    public static void main(String[] args) {
        int [] num = {5, 8, 23, 4, 1, 3, 44};

        System.out.println(minimum(num));
    }

    static int minimum(int [] arr) {
        int ex = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ex) {
                ex = arr[i];
            }
        }

        return ex;
    }
} */



// Search in 2D array & maximum number in 2D array


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13}
        };

        int target = 10;
        int[] ans = (search(arr, target));
        System.out.println(Arrays.toString(ans));
        System.out.println(maximum(arr));
    }

    static int[] search(int [][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int maximum(int [][] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int ans = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > ans) {
                    ans = arr[i][j];
                }
            }
        }

        return ans;
    }
} */



// Find the even numbers of digits in the array


/*
public class Main {
    public static void main(String[] args) {
        int [] nums = {5, 1, 42, 8, 33, 62};

        System.out.println(search(nums));
    }

    static int search(int [] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits2(num);

        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    static int digits2(int num) {
        return (int) Math.log10(num) + 1;
    }
} */



// Richest Customer Wealth


/*
public class Main {
    public static void main(String[] args) {
        int [][] accounts = {
                {1, 2, 3},      // 6
                {4, 5, 6},      // 15
                {7, 8, 9}       // 24
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int [][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (ans < sum) {
                ans = sum;
            }
        }

        return ans;
    }
} */



// Ceiling of a number in an array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.println(Ceiling(arr, 14));
    }

    static int Ceiling(int[] arr, int target) {     // Smallest number >= target
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                    return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        
        return start;
    }
} */



// Floor of a number in an array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.println(Floor(arr, 14));
    }

    static int Floor(int[] arr, int target) {       // Greatest number >= target
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                    return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        
        return end;
    }
} */



// Find smallest letter greator than target


/*
public class Main {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'f', 'j'};

        System.out.println(Find(arr, 'f'));
    }

    static char Find(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return arr[start % arr.length];
    }
} */



// Find first & last position of element in sorted array


/*
public class Main {
    public static void main(String[] args) {
        int [] arr = {5, 7, 7, 7, 8, 8, 10};

        int[] result = search(arr, 7);
        System.out.println(Arrays.toString(result));
    }

    static int[] search(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(arr, target, true);
        
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }
        return ans;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
} */



// Find element in infinite sorted array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        System.out.println(ans(arr, 100));
    }

    static int ans(int[] arr, int target) {     // Error in this function
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return position(arr, target, start, end);
    }

    static int position(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;               
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;  
    }
} */



// Peak index in a mountain array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 6, 4, 3, 2};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }   

        return start;
    }
} */



// Find element in mountain array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};

        System.out.println(search(arr, 3));
    }

    static int search(int[] arr, int target) {
        int peak = peak(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean ifAsc = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end) / 2;     // Exceeds the limit of int in some cases
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (ifAsc) {
                if (target < arr[mid]) {
                end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }
} */



// Search in rotated array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 7, 9, 1, 2, 4, 5};

        System.out.println(findPivot(arr));
        System.out.println(search(arr, 2));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        
        if (arr[pivot] == target) {
            return pivot;
        }

        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
} 



// Rotated binary search with duplicate array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 8, 7, 7, 7, 7};

        System.out.println(findPivot(arr));
        System.out.println(search(arr, 7));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < start && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
} */



// Find no of rotations in a sorted array


/*
public class Main {
    public static void main(String[] args) {  
        int[] arr = {0, 1, 2, 4};

        System.out.println(findPivot(arr));
        System.out.println(searchRotation(arr));
    }

    static int searchRotation(int[] arr) {
        int pivot = findPivot(arr);

        return pivot + 1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
} */



// Split array larget sum


/*
public class Main {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};

        System.out.println(splitArray(nums, 2));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pices = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pices++;
                } else {
                    sum += num;
                }
            }

            if (pices > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
} */



// Binary search in 2D array efficient way halfly sorted


/*
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(matrix, 6)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] {r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[]{-1, -1};
    }
} */



// Binary search in sorted 2D array


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {8, 9, 10}
        };

        System.out.println(Arrays.toString(search(matrix, 6)));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, target, 0, 0, cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    static int[] binarySearch(int[][] matrix,int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } 
            
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
} */
/***************************/



/**** Chapter 2 ****/

import java.util.Arrays;

/**** Sorting ****/


// Bubble Sort Algorithm / Sinking Sort / Exchange Sort -> Compare the adjacent elements and swap them if they are in wrong order
// Time Complexity -> Best Case -> O(n), Worst Case -> O(n^2)
// Space Complexity -> O(1)
// Its a stable algorithm


// Example of bubble sort


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {      // Run the steps n - 1 times
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
} */



// Selection Sort Algorithm -> Find the minimum element in the unsorted array and swap it with the element at the beginning or vice versa like find the largest element and put at the last index
// Time Complexity -> Best Case -> O(n^2), Worst Case -> O(n^2)
// Space Complexity -> O(1)
// Its not a stable algorithm


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9, 5};

        selectionSort(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getmaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];        
        arr[second] = temp;        
    }

    static int getmaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }

        return max;
    }
} */



// Insertion Sort Algorathim -> Sort by taking 2 elements and compare them and then swap them if they are in wrong order
// Time Complexity -> Best Case -> O(n), Worst Case -> O(n^2)
// Space Complexity -> O(1)
// Its a stable algorithm


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2 };

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} */



// Cycle Sort -> Sort the array by swapping the elements at their correct position using indices
// *When given no is from range 1 to n then use cyclic sort
// Time Complexity -> best case -> O(n), worst case -> O(n^2)
// Space Complexity -> O(1)
// Its not a stable algorithm


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 5, 2, 1, 4};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int fisrt, int second) {
        int temp = arr[fisrt];
        arr[fisrt] = arr[second];
        arr[second] = temp;
    }
} */



// Merge Sort -> Divide the array into two parts and then sort the two parts and then merge the two parts
// Time Complexity -> Best Case -> O(n log n), Worst Case -> O(n log n)
// Space Complexity -> O(n)
// Its a stable algorithm


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};  
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    // static int[] sort(int [] arr) {
    //     if (arr.length == 1) {
    //         return arr;
    //     }

    //     int mid = arr.length / 2;

    //     int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
    //     int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        
    //     return merge(left, right);
    // }

    // private static int[] merge(int[] left, int[]right) {
    //     int[] mix = new int[left.length + right.length];

    //     int i = 0, j = 0, k = 0;

    //     while (i < left.length && j < right.length) {
    //         if (left[i] < right[j]) {
    //             mix[k] = left[i];
    //             i++;
    //         } else {
    //             mix[k] = right[j];
    //             j++;
    //         }
    //         k++;
    //     }

    //     while (i < left.length) {
    //         mix[k] = left[i];
    //         i++;
    //         k++;
    //     }

    //     while (j < right.length) {
    //         mix[k] = right[j];
    //         j++;
    //         k++;
    //     }

    //     return mix;
    // }

    static void sort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        sort(arr, start, mid);
        sort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start, j = mid, k = 0;
        
        int [] mix = new int[end - start];
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
} */



// Quick Sort -> Select a pivot element and then place the pivot element at its correct position and then place all the elements smaller than the pivot element to the left of the pivot element and all the elements greater than the pivot element to the right of the pivot element
// Time Complexity -> Best Case -> O(n log n), Worst Case -> O(n^2)
// Space Complexity -> O(log n)
// Its not a stable algorithm


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {8, 3, 4, 12, 5, 6};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low, end = high, mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }

            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        sort(arr, low, end);
        sort(arr, start, high);
    }
} */



// Count Sort -> Count the no of elements less than the current element and then place the element at the correct position
// Time Complexity -> Best Case -> O(n + k), Worst Case -> O(n + k)
// Space Complexity -> O(n + k)
// Its a stable algorithm


/*
public class Main {
    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
        }

        int[] countArray = new int[max + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index++] = i;
                countArray[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 0};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
} */



// Radix Sort -> Sort the elements by comparing the digits of the elements
// Time Complexity -> Best Case -> O(nk), Worst Case -> O(nk)
// Space Complexity -> O(n + k)
// Its a stable algorithm


/*
public class Main {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i - 1];
        }

        System.out.println("Updated count array " + Arrays.toString(count));
        
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--; 
        }

        System.out.println("Output array " + Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {29 ,83, 471, 36, 91, 8};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
} */



/***************************/
/**** Practice Question ****/



// Find the missing number from the 0-n array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 0};

        System.out.println(cyclicSort(arr));
    }

    static int cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correct = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }

        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} */



// Find all the missing number from the 1-n array


/*
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        
        System.out.println(cyclicSort(arr));
    }

    static List<Integer> cyclicSort(int[] arr) {
        int i = 0;
    
        while (i < arr.length) {
            int correct = arr[i] - 1;
    
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
    
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} */



// Find the duplicate numbers in array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};


        System.out.println(duplicateNumber(arr));
    }

    static int duplicateNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;

                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }    
} */



// Find all duplicates in an array


/*
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 3, 4, 1, 2};

        System.out.println(findDuplicate(arr));
    }

    static List<Integer> findDuplicate(int[] arr) {
        int i = 0;
        
        while (i < arr.length) {
            
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} */



// Set mismatch


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};

        int[] ans = findDuplicate(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findDuplicate(int[] arr) {
        int i = 0;
        
        while (i < arr.length) {
            
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index + 1};
            }
        }

        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} */



// Find first missing positive number


/*
public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 4, -1, 1};

        System.out.println(firstMissing(arr));
    }

    static int firstMissing(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        return arr.length + 1;
    }

    static void swap(int [] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} */
/***************************/



/**** Chapter 3 ****/
/**** String ****/



// String -> String is a sequence of characters
// String pool -> String pool is a memory area in java heap memory where all the string objects are stored
// String is immutable -> Once a string object is created it cannot be changed



/*
public class Main {
    public static void main(String[] args) {
        String name = "Mayank";     // String is a class in java, name is reference variable and Mayank is object
        String name2 = "Mayank";    // name and name2 both are pointing to the same object "Mayank" by using string pool to utilese the memory
        
        System.out.println(name);
        System.out.println(name2);

        name = "Mayank Varma";            // Now name is pointing to the new object "Mayank Varma" and name2 is still pointing to the old object "Mayank" cuz string is immutable the "Mayank" object is not changed instead new object has been created

        String a = "Mayank";
        String b = "Mayank";

        System.out.println(a == b);     // It will return true because both a and b are pointing to the same object "Mayank" in the string pool

        // Creating a different object of same value
        String c = new String("Mayank");
        String d = new String("Mayank");

        System.out.println(c == d);     // It will return false because c and d are pointing to the different objects "Mayank" in the heap memory
        System.out.println(c.equals(d));    // It will return true because equals method compares the values of the objects
    
        // System.out.println(name[0]);     // We can use string like this using indices
        System.out.println(name.charAt(0));     // We can use string like this using charAt method
    }
} */



// String Output


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(56);
        // Integer num = new Integer(56);      // Wrapper class
        // System.out.println(num.toString());
        System.out.println("Mayank");
        System.out.println(Arrays.toString(new int[] {1, 2, 3}));

        String name = null;
        System.out.println(name);
    }
} */



// Preety Printing


/*
public class Main {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted number is %.2f\n", a);     // %.2f -> 2 decimal places

        System.out.printf("Hello my name is %s and I am %s", "Mayank", "cool");
    }
} */



// Operators


/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println('a' + 'b');      // It will return 195 because it will add the ascii values of a and b
        System.out.println("a" + "b");      // It will return ab because it will concatenate the strings a and b
        System.out.println((char)('a' + 3));      // It will return d because it will add the ascii value of a and 3 and then convert it to char
        System.out.println("a" + 3);      // Here a3 cuz when a integer concatinates with an integer it converted to its wrapper class Integer that calls toString()

        System.out.println("Mayank" + new ArrayList<>());
        System.out.println("Mayank" + new Integer(56));

        // System.out.println(new Integer(56) + new ArrayList<>());        // The operator is define in java for only one object of premitive data type and for string two objects cannot be oprated
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
} */



// Performance of String


/*
public class Main {
    public static void main(String[] args) {
        String series = "";     // It will create a new object in the heap memory
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch;       // It will create a new object in the heap memory in every iteration
            // Time complexity -> O(n^2)
            // Now thats why here we use StringBuilder class to optimise the code
        }

        System.out.println(series);
    }
} */



// StringBuilder -> StringBuilder is a class in java which is used to create mutable string objects


/*
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);     // It will not create new object in the heap memory in every iteration
    
        }

        System.out.println(builder);
        System.out.println(builder.toString());     // Converts to string
    }
} */



// String Buffer -> StringBuffer is a class in java which is used to create mutable string objects and it is thread safe


/*
import java.lang.StringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();       // Constructor 1
        StringBuffer sb2 = new StringBuffer("Hello");       // Constructor 2
        StringBuffer sb3 = new StringBuffer(30);        // Constructor 3 -> Capacity default 16 now 30
        
        sb.append("Mayank");
        sb.insert(2, "YO");
        sb.replace(2, 4, "Hello");
        sb.delete(2, 7);
        sb2.reverse();

        String str = sb.toString();
        System.out.println(str);
        System.out.println(sb2);
        System.out.println(sb.capacity());
        System.out.println(sb3.capacity());
    }
} */



// Removing sSpaces, Split


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Hello   how r  u";
        System.out.println(str.replaceAll("\\s", ""));
        
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));
    }
} */



// Decimal Format


/*
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.1));
    }
} */



/***************************/
/**** Practice Question ****/



// Palindrome


/*
public class Main {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        if (str.length() == 0 || str == null) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
} */



// Generating random string


/*
import java.lang.StringBuffer;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(generate(20));
    }

    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);
        Random rand =  new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int) (rand.nextFloat() * 26);
            sb.append((char) randomChar);
        }

        return sb.toString();
    }
} */
/***************************/



// Printing a to z using char and ascii values


/*
public class Main {
    public static void main(String[] args) {
        String series = "";     
        for (int i = 0; i < 26; i++) {      // But its not optimised and consumes large space in every iteration
            char ch = (char) ('a' + i);
            series = series + ch;
        }

        System.out.println(series);
    }
} */



// Printing a to z using char and ascii values using string builder


/*
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();      // Optimised way

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            stringBuilder.append(ch);
        }

        System.out.println(stringBuilder);
    }
} */



// Check weather a string is palindrome or not


/*
public class Main {
    public static void main(String[] args) {
        String str = "abcdcba";

        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        str = str.toLowerCase();

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }

        return true;
    }
} */



// Star pattern 1


/*
public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
} */



// Star pattern 2


/*
public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */



// Star pattern 3


/*
public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            int spaces = n - c;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */



/**** Chapter 4 ****/
/**** Recursion ****/


// Recursion Example


/*
public class Main {
    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }
} */



// Find nth fibonacci number


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    static int fib(int n) {
        // if (n == 0) {
        //     return 0;
        // }
        // if (n == 1) {
        //     return 1;
        // }
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
} */



// Binary search using recursion


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(binarySearch(arr, 3, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
            
        return binarySearch(arr, target, mid + 1, end);
    }
} */



// simple concept


/*
public class Main {
    public static void main(String[] args) {
        concept(5);
    }

    static void concept(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        // concept(n--);        // Gives infinite error
        concept(--n);
    }
} */



// Recursion tree of subset

// Ex - "abc"
//                                            ("" / "abc")
                                            //           \\
                                        //                  \\
                                    //                          \\
                                //                                  \\
//                    ("a" / "bc")                                    ("" / "bc")
                    //           \\                                 //           \\
                  //               \\                            //                \\
//      ("ab" / "c")               ("a" / "c")           ("b" / "c")              ("" / "c")
      //           \\            //           \\       //           \\          //           \\
// ("abc" / "") ("ab" / "")  ("ac" / "") ("a" / "")  ("bc" / "") ("b" / "")  ("c" / "") ("" / "")



// Subsequence


/*
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "");
        System.out.println(subsetReturn(str, ""));
        subseqAscii(str, "");
    }

    static void subset(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        subset(str.substring(1), ans + ch);
        subset(str.substring(1), ans);
    }

    static ArrayList<String> subsetReturn(String str, String ans) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subsetReturn(str.substring(1), ans + ch);
        ArrayList<String> right = subsetReturn(str.substring(1), ans);
        
        left.addAll(right);
        return left;
    }

    static void subseqAscii(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        subseqAscii(str.substring(1), ans + ch);
        subseqAscii(str.substring(1), ans);
        subseqAscii(str.substring(1), ans + (ch + 0));
    }
} */



// Subset via iteration
// Time complexity -> O(n2^n)
// Space complexity -> O(n2^n)


/*


public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
} */



// Subset with repeated values via iteration


/*
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int size = outer.size();
            for (int j = start; j < size; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
} */



// Permutation of string


/*
public class Main {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
        System.out.println(permutationC(str, ""));
    }

    static void permutation(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            permutation(str.substring(1), first + ch + second);
        }
    }

    static int permutationC(String str, String ans) {
        if (str.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = str.charAt(0);

        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            count = count + permutationC(str.substring(1), first + ch + second);
        }

        return count;
    }
} */



/***************************/
/**** Practice Question Recursion ****/


// Simple recursion question print form 5 to 1 & from 1 to 5 by passing 5


/*
public class Main {
    public static void main(String[] args) {
        func(5);
        funcRev(5);
    }

    static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);
    }

    static void funcRev(int n) {
        if (n == 0) {
            return;
        }
        funcRev(n - 1);
        System.out.println(n);
    }
} */



// Factorial of a number


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
} */



// Sum of digits


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(sum(566));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }
} */



// product of digits


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(product(566));
    }

    static int product(int n) {
        if (n % 10  == n) {
            return n;
        }

        return (n % 10) * product(n / 10);
    }
} */



// Reverse a number


/*
public class Main {
    public static void main(String[] args) {
        reverse(566);
        System.out.println(sum);
        System.out.println(reverse2(5675));
    }

    static int sum = 0;

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + (n % 10);
        reverse(n / 10);
    }

    static int reverse2(int n) {
        // sometimes u need aditional variables in the argument
        // in that case, make another function
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
} */



// Check palindrome


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }

    static boolean palindrome(int n) {
        return n == reverse(n);
    }

    private static int reverse(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }
} */



// Count total zeros in the number


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(count(50204));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int cnt) {
        if (n == 0) {
            return cnt;
        }
        if ((n % 10) == 0) {
            return helper(n / 10, ++cnt);
        }
        return helper(n / 10, cnt);
    }
} */



// Number of steps to reduce a number to zero


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(47));
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, ++steps);
        }
        return helper(num - 1, ++steps);
    }
} */



// Check weather the array is sorted or not


/*
public class Main {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 0, 6};
        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int [] arr) {
        return helper(arr, 0);
    }

    private static boolean helper(int [] arr, int index) {
        if (arr.length - 1 == index) {
            return true;
        }
        return arr[index] < arr[index + 1] && helper(arr, ++index);
    }
} */



// Linear search with recursion


/*
public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 2, 1, 18, 9};
        System.out.println(linearSearch(arr, 0));
    }

    static boolean linearSearch(int [] arr, int target) {
        return helper(arr, target, 0);
    }

    private static boolean helper(int [] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || helper(arr, target, ++index);
    }
} */



// Linear search on multiple occurence



// import java.util.ArrayList;


/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] arr = {5, 3, 22, 1, 6, 3, 4, 3};
        search(arr, 3);
        System.out.println(arraylist);
    }

    static void search(int [] arr, int target) {
        helper(arr, target, 0);
    }

    static ArrayList<Integer> arraylist = new ArrayList<>();

    private static void helper(int [] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (target == arr[index]) {
            arraylist.add(index);
        }
        helper(arr, target, ++index);
    }
} */



// Return an ArrayList


/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] arr = {5 , 6 , 8 , 3 , 6 , 8};
        System.out.println(search(arr, 6));
    }

    static ArrayList<Integer> search(int [] arr, int target) {
        return helper(arr, target, 0, new ArrayList<>());
    }

    private static ArrayList<Integer> helper(int [] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        return helper(arr, target, ++index, list);
    }
} */



// Return list without passing the argument


/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int [] arr = {5, 4, 2, 4, 6, 4};
        System.out.println(search(arr, 4, 0));
    }

    static ArrayList<Integer> search(int [] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == index) {
            return list;
        }
        if (target == arr[index]) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = search(arr, target, ++index);
        
        list.addAll(ansFromBelow);
        return list;
    } 
} */



// Roteted binary search using recursion


/*
public class Main {
    public static void main(String[] args) {
        int [] arr =  {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 2));    
    }

    static int search(int [] arr, int target) {
        return helper(arr, target, 0, arr.length - 1);
    }

    private static int helper(int [] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        
        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return helper(arr, target, start, mid - 1);
            } else {
                return helper(arr, target, mid + 1, end);
            }
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return helper(arr, target, mid + 1, end);
            } else {
                return helper(arr, target, start, mid - 1);
            }
        }
    }
} */



// Print star patterns using recursion


/*
public class Main {
    public static void main(String[] args) {
        pattern(5, 0);
        pattern2(5, 0);
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            System.out.print("*");
            pattern(row, ++col);
        } else {
            System.out.println();
            pattern(--row, 0);
        }
    }

    static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            pattern2(row, ++col);
            System.out.print("*");
        } else {
            pattern2(--row, 0);
            System.out.println();
        }
    }
} */



// Bubble sort using recursion


/*
public class Main {
    public static void main(String[] args) {
        int [] arr = {9, 4, 8, 0, 1, 3};
        sort(arr);
    }

    static void sort(int [] arr) {
        helper(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
    private static void helper(int [] arr, int n, int m) {
        if (n == 0) {
            return;
        }

        if (m < n) {
            if (arr[m] > arr[m + 1]) {
                int temp = arr[m];
                arr[m] = arr[m + 1];
                arr[m + 1] = temp;
            }

            helper(arr, n, ++m);
        } else {
            helper(arr, --n, 0);
        }
    }
} */



// Selection sort using recursion


/*
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {6, 2, 9, 3, 10, 7, 12};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int [] arr, int i) {
        if (i == arr.length - 1) {
            return;
        }
        int last = arr.length - i - 1;
        int maxIndex = maxI(arr, 0, last);
        if (arr[maxIndex] < arr[last]) {
            sort(arr, ++i);            
        } else {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
            sort(arr, maxIndex);
        }
    }

    private static int maxI(int [] arr, int start, int end) {
        int max = 0;

        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
} */



// Skip all a character from the string



/*
public class Main {
    public static void main(String[] args) {
        String str = "baccad";
        skipA(str, "");
        System.out.println(skipA2(str));
    }

    static void skipA(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            skipA(str.substring(1), ans);
        } else {
            skipA(str.substring(1), ans + ch);
        }
    }

    static String skipA2(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == 'a') {
            return skipA2(str.substring(1));
        } else {
            return ch + skipA2(str.substring(1));
        }
    }
} */



// Skip apple from the string


/*
public class Main {
    public static void main(String[] args) {
        String str = "Hey i have an apple";
        System.out.println(skipApple(str));
    }

    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }
} */



// Skip app from the string if its not equals to apple


/*
public class Main {
    public static void main(String[] args) {
        String str = "Hey i have an app which has apple";
        System.out.println(skipAppNotApple(str));
    }

    static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
} */



// Letter combination of a phone number


/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str = "12";
        letterCombination(str, "");
        System.out.println(letterCombinationRA(str, ""));
        System.out.println(letterCombinationRC(str, ""));
    }

    public static void letterCombination(String unProcessed, String processed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        int digit = unProcessed.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)(i + 'a');
            letterCombination(unProcessed.substring(1), processed + ch);
        }
    }

    public static ArrayList<String> letterCombinationRA(String unProcessed, String processed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unProcessed.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)(i + 'a');
            ans.addAll(letterCombinationRA(unProcessed.substring(1), processed + ch));
        }
        return ans;
    }

    public static int letterCombinationRC(String unProcessed, String processed) {
        if (unProcessed.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = unProcessed.charAt(0) - '0';

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char)(i + 'a');
            count = count + letterCombinationRC(unProcessed.substring(1), processed + ch);
        }

        return count;
    }
} */



// Dice combination


/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(dice(4, ""));
    }

    public static ArrayList<String> dice(int target, String processed) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice(target - i, processed + i));
        }

        return ans;
    }
} */



// Maze problem


/*
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(mazeC(3, 3));
        mazePath("", 3, 3);
        System.out.println(mazePathDiagnoal("", 3, 3));

        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        System.out.println(mazeWithObstacle("", maze, 0, 0));

        int[][] board = {
            {1, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 0, 1, 1},
            {1, 1, 1, 1}
        };
        System.out.println(mazeWithObstacle01("", board, 0, 0));
        System.out.println(mazeWithObstacle01AllDirection("", board, 0, 0));

        int[][] path = new int[board.length][board[0].length];
        mazePrintPath("", board, 0, 0, path, 1);
    }

    public static int mazeC(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = mazeC(row - 1, col);
        int right = mazeC(row, col - 1);

        return left + right;
    }

    public static void mazePath(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            mazePath(p + 'D', row - 1, col);
        }
        if (col > 1) {
            mazePath(p + 'R', row, col - 1);
        }
    }

    public static ArrayList<String> mazePathDiagnoal(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1) {
            list.addAll(mazePathDiagnoal(p + 'D', row - 1, col - 1));
        }

        if (row > 1) {
            list.addAll(mazePathDiagnoal(p + 'V', row - 1, col));
        }
        if (col > 1) {
            list.addAll(mazePathDiagnoal(p + 'R', row, col - 1));
        }

        return list;
    }

    public static ArrayList<String> mazeWithObstacle(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (!maze[row][col]) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        if (row < maze.length - 1 && col < maze[0].length - 1) {
            list.addAll(mazeWithObstacle(p + 'D', maze, row + 1, col + 1));
        }

        if (row < maze.length - 1) {
            list.addAll(mazeWithObstacle(p + 'V', maze, row + 1, col));
        }
        if (col < maze[0].length - 1) {
            list.addAll(mazeWithObstacle(p + 'R', maze, row, col + 1));
        }

        return list;
    }

    public static ArrayList<String> mazeWithObstacle01(String p, int[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if (maze[row][col] == 0) {
            return new ArrayList<>();
        }

        ArrayList<String> list = new ArrayList<>();

        if (row < maze.length - 1) {
            list.addAll(mazeWithObstacle01(p + 'V', maze, row + 1, col));
        }
        if (col < maze[0].length - 1) {
            list.addAll(mazeWithObstacle01(p + 'R', maze, row, col + 1));
        }

        return list;
    }

    // Here backtracking is used - bracktracking thought [process is make a change and then revert the change
    public static ArrayList<String> mazeWithObstacle01AllDirection(String p, int[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        if (maze[row][col] == 0) {
            return new ArrayList<>();
        }

        maze[row][col] = 0;

        ArrayList<String> list = new ArrayList<>();
        
        if (row < maze.length - 1) {
            list.addAll(mazeWithObstacle01AllDirection(p + 'D', maze, row + 1, col));
        }
        if (col < maze[0].length - 1) {
            list.addAll(mazeWithObstacle01AllDirection(p + 'R', maze, row, col + 1));
        }
        if (row > 0) {
            list.addAll(mazeWithObstacle01AllDirection(p + 'U', maze, row - 1, col));
        }
        if (col > 0) {
            list.addAll(mazeWithObstacle01AllDirection(p + 'L', maze, row, col - 1));
        }

        maze[row][col] = 1;
        return list;
    }

    public static void mazePrintPath(String p, int[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        
        if (maze[row][col] == 0) {
            return;
        }

        maze[row][col] = 0;
        path[row][col] = step;
        
        if (row < maze.length - 1) {
            mazePrintPath(p + 'D', maze, row + 1, col, path, step + 1);
        }
        if (col < maze[0].length - 1) {
            mazePrintPath(p + 'R', maze, row, col + 1, path, step + 1);
        }
        if (row > 0) {
            mazePrintPath(p + 'U', maze, row - 1, col, path, step + 1);
        }
        if (col > 0) {
            mazePrintPath(p + 'L', maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = 1;
        path[row][col] = 0;
    }
} */



// N Queens Problem
// Time complexity -> O(n!)


/*
public class Main {
    public static void main(String[] args) {
        int n = 1;
        int[][] board = new int[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(int[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                count += queens(board, row + 1);
                board[row][col] = 0;
            }
        }
        return count;
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        // Check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i] == 1) {
                return false;
            }
        }

        // Diagonal Right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int element : row) {
                if (element == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
} */



// N Knights problem

/*
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        knight(board, 0, 0, n);
    }

    static void knight(int[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length - 1 && col == board.length - 1) {
            return;
        }

        if (col == board.length) {
            knight(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = 1;
            knight(board, row, col + 1, knights - 1);
            board[row][col] = 0;
        }

        knight(board, row, col + 1, knights);
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1] == 1) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2] == 1) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1] == 1) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2] == 1) {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(int[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int element : row) {
                if (element == 1) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
} */
 


// Sudoku Solver
// Time complexity -> O(9^n^2)


/*
public class Main {
    public static void main(String[] args) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (sudokuSolver(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }
    }

    static boolean sudokuSolver(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            if (emptyLeft == false) {
                break;
            }
        }

        if (emptyLeft == true) {
            return true;    // Sudoku is solved
        }

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (sudokuSolver(board)) {
                    return true;    // Found the answer
                } else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check for rows
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check for columns
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int start = row - (row % sqrt);
        int end = col - (col % sqrt);

        for (int r = start; r < start + sqrt; r++) {
            for (int c = end; c < end + sqrt; c++) {
                if (board[r][c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
} */
/***************************/



/**** Chapter 5 ****/
/**** Time & Space Comlexity ****/


// Time Complexity -> It is the amount of time taken by an algorithm to run as a function of the length of the input

// Big O -> It is used to measure the time complexity of an algorithm

// Steps to derive time complexity of any algorithm
// 1) Always look for the worst case complexity
// 2) Always look at complexity fot long / infinite data
// 3) Ignore constants
// 4) Always ignore less dominating terms

// Big Omega -> It is used to measure the best case complexity of an algorithm

// Theta -> It is used to measure the average case complexity of an algorithm

// Big O Notation-> For upper bound which is f(n) / g(n) < infinity
// Big Omega Notation-> Lower bound which is f(n) / g(n) > 0
// Theta Notation-> Both upper and lower bound which is 0 < f(n) / g(n) < infinity

// Little o -> It is used to measure the upper bound of an algorithm but it is not tight bound
// Little omega -> It is used to measure the lower bound of an algorithm but it is not tight bound



// Auxilary Space -> Extra space or temporary space used by an algorithm
// Space Complexity -> It is the amount of space taken by an algorithm to run as a function of the length of the input (Total space used by an algorithm including auxilary space)

// Form of recurrences
// Divide and conquer -> T(n) = a1T(b1x + f1(n)) + a2T(b2x + f2(n)) + ... + akT(bkx + fk(n)) + g(n)

// Akra Bazzi formula (1996) -> It is used to solve the recurrences of divide and conquer algorithms
// Formula -> T(n) = theta(x^p + x^p Integration from 1 to x of g(u) / u^(p+1) du)
// p = (i=1 till k) ai bi^p = 1
// Note -> If p < power of (g(x)) then ans = g(x)

// Linear Recurrence -> f(x) = a1f(x - 1) + a2f(x - 2) + ... + akf(x - n)
// f(x) = (i=1 till k) ai f(x - i)
// Steps to solve
// 1) Put f(x) = alpha^n for some constant alpha
// 2) Solve the equation to find alpha(roots of the equation)
// 3) f(x) = c1 alpha1^n + c2 alpha2^n is a solution for the recurrence
// 4) Fact -> no of roots = no of ans we have already
// 5) Put the no of ans we have already in the equation and find the value of c1, c2, c3, ...
// 6) Put the value of c1 in the equation and find the value of c2
// 7) Put the values of c1 and c2 in the equation and find the main equation



// Example of linear recurrence


/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fiboFormula(i));
        }
    }

    static int fiboFormula(int n) {     // Use long cuz int will exceed the limit
        return (int) Math.pow(((1 + Math.sqrt(5)) / 2), n) /* - Math.pow(((1 - Math.sqrt(5)) / 2), n)) * /;      // Removing less dominating terms
    }
} */



// If roots are equal ->
// In general case if alpha is repeated r times
// then alpha^n, nalpha^n, n^2alpha^n, ... , n^(r - 1)alpha^n are the solutions to the recurrence
// Hence we can take two roots as
// first itself and second will be nalpha^n
// first = c1 (alpha^n) + (c2 nalpha^n)
// This all is homogeneous equation

// Non - homogeneous equation -> f(n) = a1f(x - 1) + a2f(x - 2) + ... + akf(x - n) + g(x) here only the g(x) is extra
// Steps to solve ->
// 1) Replace g(n) = 0 and solve normally like homogeneous equation
// 3) Now take the g(n) on one side and find particular solution
// 4) Now guess valued of f(n) something similar to g(n) like if g(n) = x^2 then guess something like n^2 if g(n) = 3^n then guess something like c3^n
// 5) Now put the value of f(n) in the equation and get the value of c
// 6) Now get the perticular solution by putting the value of c in the gussed value of f(n)
// 7) Now add the homogeneous solution and particular solution together to get the final solution by putting the ans already provided in the equation

// How to guess the value of f(n) ->
// 1) If g(n) is exponential then guess of same type like g(n) = 2^n + 3^n then guess f(n) = a2^n + b3^n
// 2) If g(n) is polynomial then guess of same degree like g(n) = x^2 - 1 then guess f(n) = ax^2 + bx + c
// 3) If g(n) is combination of polynomial and exponential then guess of same type like g(n) = 2^n + n then guess f(n) = a2^n + (bn + c)
// 4) If the guess fails like f(n) = a2^n fails then try f(n) = (an + b)2^n if it also fails increase the degrees like f(n) = (an^2 + bn + c)2^n
// 5) If f(n) has extra terms like b or c afetr the solution then discard them and use only a in particular solution



/**** Chapter 6 ****/
/**** Bitwise Operator & Number System ****/



// Bitwise Operator -> It is used to perform bit by bit operation on the operands
// AND -> & -> Both have to be true to get true
// +---------------+
// | a | b | a & b |
// +---------------+
// | 0 | 0 |   0   |
// | 0 | 1 |   0   |
// | 1 | 0 |   0   |
// | 1 | 1 |   1   |
// +---------------+
// Observation -> When you & 1 with any number, digits remains the same

// OR -> || -> One of them have to be true to get true
// +---------------+
// | a | b | a OR b|
// +---------------+
// | 0 | 0 |   0   |
// | 0 | 1 |   1   |
// | 1 | 0 |   1   |
// | 1 | 1 |   1   |
// +---------------+
// Observation -> When you or 0 with any number, digits remains the same

// XOR -> ^ -> if and only if one of them is true then only we get true
// +---------------+
// | a | b | a ^ b |
// +---------------+
// | 0 | 0 |   0   |
// | 0 | 1 |   1   |
// | 1 | 0 |   1   | 
// | 1 | 1 |   0   |
// +---------------+
// Observation -> a ^ 1 = (complement of (~))a, a ^ 0 = a and a ^ a = 0

// Complement -> ~
// a = 10110 so complement of a will be ~a = 01001

// Left Shift -> << -> It shifts the bits to the left by the given number of times and fills the empty spaces with 0
// Like (10)base10 = (1010)base2
// 10 << 1 -> 1010 = 10100
// 1*2^4 + 0*2^3 + 1*2^2 + 0*2^1 + 0*2^0 = 20
// +-------------------+                 +------------------+
// | Hence a << 1 = 2a | so general part | a << b = a * 2^b |
// +-------------------+                 +------------------+

// Right Shift -> >> -> It shifts the bits to the right by the given number of times
// Like (10)base10 = (1010)base2
// 10 >> 1 -> 1010 = 101
//               +----------------+
// General point | a >> b = a/2^b |
//               +----------------+


// Number System ->
// 1) Decimal -> 0, 1, 2, ... , 9 base 10
// 2) Binary -> 0 & 1 base 2 
// 3) Octal -> 0, 1, 2, 3, ... , 7 base 8
// 4) Hexadecimal -> 0, 1, 2, ... , 9 & a, b, c, d, e, f base 16


// Conversion ->
// Two points by which we can convert any number to any number system ->
// 1) Decimal to base b -> Keep dividing by base, take remainders and write in opposite
// Example -> Convert (17)base10 to base 2
// 2 | 17
// 2 | 8 - 1
// 2 | 4 - 0
// 2 | 2 - 0
//   | 1 - 0        (10001)base2 = (17)base10

// Example -> Convert (17)base10 to base 8
// 8 | 17
//   | 2 - 1        (21)base8 = (17)base10

// 2) Base b to decimal -> Multiply & add the power of base with digits
// Example -> Convert (10001)base2 to base 10
// 1*2^4 + 0*2^3 + 0*2^2 + 0*2^1 + 1*2^0
// 16 + 0 + 0 + 0 + 1 = (17)base10

// Example -> Convert (21)base8 to base10
// 2*8^1 + 1*8^0
// 16 + 1 = 17



// Find wether the number is odd or even


/*
public class Main {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    } 

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
} */



// Find unique element in the array


/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};

        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
} */



// Find ith bit of a number


/*
public class Main {
    public static void main(String[] args) {
        int a = 182;
        
        System.out.println(getBit(a, 5));
    }

    static int getBit(int n, int i) {
        return (n & (1 << (i - 1))) == 0 ? 0 : 1;
    }
} */



// Set the ith bit of a number means set it to 1


/*
public class Main {
    public static void main(String[] args) {
        int a = 86;
        
        setBit(a, 4);
    }

    static void setBit(int n, int i) {
        System.out.println(n | (1 << (i - 1)));
    }
} */



// Reset the ith bit of a number means set it to 0


/*
public class Main {
    public static void main(String[] args) {
        int n = 80;     // 1010000

        resetBit(n, 5);
    }

    static void resetBit(int n, int i) {
        System.out.println(n & ~(1 << (i - 1)));     // 64 = 1000000
    }
} */



// Find Range of any DataType using formula ->
// +-------------------------------------+
// | Range = -2^(n - 1) to 2^(n - 1) - 1 |
// +-------------------------------------+



// Find the position of the right most set bit



// public class Main {
//     public static void main(String[] args) {
//         int n = 180;

//         System.out.println(getBit(n));
//     }

//     static int getBit(int n) {
//         int ans = 0;

        

//         return ans;
//     }
// }



// All numbers are appearing 3 times in array only 1 number appear once find that number



// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};

//         // System.out.println(3 % 3);
//         // System.out.println(3 % 3);
//         // System.out.println(7 % 3);
//         // System.out.println(4 % 3);
//         System.out.println(getOnceNmber(arr));
//     }

//     static int getOnceNmber(int[] arr) {
//         int ans = 0;

//         for (int i : arr) {
//             int[] arr2;
//             arr2[i] = arr[i];
//         }
        
//         return ans;
//     }
// }



// Find the nth magic number



//     5^3 5^2 5^1
// 1 =  0   0   1
// 2 =  0   1   0
// 3 =  0   1   1
// 4 =  0   1   1
// :            : 
// :            :
// n =  -   -   -

/*
public class Main {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;

            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    } 
} */



// Formula to get the numbers of binary number in a number ->
// No. of digits in base b of no. of n = int(logbb n) + 1



// Number of binary digits in a number


/*
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int base = 2;
        int ans = (int) (Math.log(n) / Math.log(base)) + 1;     // Time complexity is log(n)

        System.out.println(ans);
    }
} */



// Pascals Triangle
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1



// What is the sum of nth row of pascal's triangle


/*
public class Main {
    public static void main(String[] args) {
        int row = 6;
        int ans = 0;

        ans = 1 << (row - 1);

        System.out.println(ans);
    }
} */



// Power of 2 -> If there is only one 1 in the binary representation of a number then it is power of 2
// Like 100000 (Power of 2), 100010(not th power of 2)


// Find if the number is power of 2 or not


/*
public class Main {
    public static void main(String[] args) {
        int n = 32;
        // int count = 0;
        
        // while (n > 0) {
        //     if ((n & 1) == 1) {
        //         count++;
        //     }
        //     n = n >> 1;
        // }

        if ((n & (n - 1)) == 0) {
            System.out.println("It's power of 2");
        } else {
            System.out.println("it's not");
        }
    }
} */



// Calculate a^b
/*
 * Continue from here
*/



/**** Chapter 7 ****/
/**** Object Oriented Programming - Advance ****/



// Calling constructor from another constructor


/*
class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    public A() {
        this ("Mayank");    // Internaly it is new A("Mayank")
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.name);
    }
} */



// Wrapper Class


/*
public class Main {
    public static void main(String[] args) {
        int a = 10;
        Integer A = 10;     // It's now an object of Integer class
        
        // A.compareTo();      // So many function
    }
} */



// Garbage Collection


/*
class A {
    String name;

    public A(String name) {
        this.name = name;
    }

    public A() {
        this ("Mayank");    // Internaly it is new A("Mayank")
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj;

        for (int i = 0; i < 1000000; i++) {
            new A();
        }
    }
} */



// Static Variable


/*
class Human {
    int age;
    String name;
    static long population;     // Static variable does not care about object they can be called directely

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        Human.population += 1;
    }
}

class StaticBlock {     // Will only run once, when the first obj is created
    static int a = 4;
    static int b;

    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
}

public class Main {
    static class Test {     // Inner class
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;        // Returns name instead of random values
        }
    }
    public static void main(String[] args) {        // main function called directly without making an object of it
        Human mayank = new Human(20, "Mayank");
        Human amit = new Human(23, "Amit");

        System.out.println(Human.population);
        // greet();     // Non static method cannot be used in static methods they needs an object to use normally

        StaticBlock obj = new StaticBlock();

        Test a = new Test("Mayank");
        Test b = new Test("Tushar");
    
        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }

    void greet() {
        System.out.println("Hello!");
    }
} */



// Singleton Class -> You can creat only one object


/*
class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {     // Check if and instance created or not if not create one if it is created return the old one
            instance = new Singleton();
        }

        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();       // All three reference variable pointing to one object
    }
} */



// Inbuilt Packages
     


//          |----> lang -> Essential stuff of Java & Language specific stuff
//          |----> io -> It contains all input output classes
// Java ----|----> util -> Utility classes like data structures stuff & Collection framework
//          |----> applet -> Used to cread applet   
//          |----> awt -> For making GUI & stuff
//          |----> net -> For networking things



// Object Class


/*
class Example {     // By debault object class is imported to all class
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {     // Compares to objects
        return super.equals(obj);
    }

    @Override
    public int hashCode() {     // It gives a number representaion of an object
        return super.hashCode();
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj instanceof Object);      // Check if the obj is instance of object class
        System.out.println(obj.getClass().getName());     // Gives the class name and more functions like this
    }
} */



// Custom ArrayList


/*
import java.util.Arrays;

class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;       // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        
        for (int i = 0; i < data.length; i++) {     // copy the current items in the new array
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        
        System.out.println(list);
    }
} */



// Custom ArrayList using Generics


/*
import java.util.Arrays;

class CustomGenArrayList<T> {
// class CustomArrayList<T extends Number> {        // Only allow to use numbers like float, int
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {      // Here u can only pass number type

    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        
        System.out.println(list3);
        
    }
} */



// Comaring Objects



/*
import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compareto method");
        int diff = (int)(this.marks - o.marks);

        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }
}

public class Main {
    public static void main(String[] args) {
        Student Mayank = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.52f);
        Student arpit = new Student(2, 95.52f);
        Student karan = new Student(13, 77.52f);
        Student sachin = new Student(9, 96.52f);

        Student[] list = {Mayank, rahul, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));

        // if (Mayank.compareTo(rahul) < 0) {
        //     System.out.println(Mayank.compareTo(rahul));
        //     System.out.println("Rahul has more marks");
        // }
    }
} */



// Lambda Function


/*
import java.util.ArrayList;
import java.util.function.Consumer;

interface Operation {
    int operation(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        // arr.forEach((item) -> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        Main myCalculator = new Main();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, prod));
        System.out.println(myCalculator.operate(5, 3, sub));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
} */



// Object Cloning


/*
import java.util.Arrays;

class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     // this is shallow copy
    //     return super.clone();
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // return super.clone();        // Shallow copy

        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];        // Deep Copy
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Mayank = new Human(34, "Mayank Kushwaha");
        // Human twin = new Human(Mayank);

        Human twin = (Human)Mayank.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(Mayank.arr));
    }
} */



// Vectors


/*
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();      // Similar to linkedlist but as multiple threds can work on linkedlist at the same time but in vectors only one thread can work at a time if second wants to work it will be in waiting

        vector.add(54);
        vector.add(12);
        vector.add(3);
        vector.add(6);

        System.out.println(vector);
    }
} */



// Enums (Enumeration) -> Enum is like a group of variable that we can't change


/*
interface A {
    public void hello();
}

public class Main {
    enum Week implements A{     // We cannot extend anything in enum and it cannot be a super class either but we can implement interfaces
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;     // This are enum constants everyone here is public, static, final since they are final u cannot create child enums
        
        Week() {        // This is not public or protected cuz we dont want to create new objects cuz this is not the enum concept, internally it's like public static final Week Monday = new Week();
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello!");
        }

        // public void display();      // Abstracts are not allowed
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Tuesday;
        System.out.println(Week.valueOf("Monday"));

        // for (Week day : Week.values()) {
        //     System.out.println(day);
        // }

        System.out.println(week);

        System.out.println(week.ordinal());     // It basicaly returns index
        week.hello();
    }
} */



/**** Chapter 8 ****/
/**** Linked List ****/



// LinkedList - Singly


/*
class LL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(24);
        list.insertFirst(41);
        list.insert(4, 2);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(9);
        list.insertLast(14);

        list.display();
        
        System.out.println(list.deleteFirst());
        System.out.println(list.delete(4));
        System.out.println(list.deleteLast());

        list.display();
    }
} */



// Linked List - Doubly


/*
class DLL {
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            return -1;
        }

        int val = head.val;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int deleteLast() {
        if (head == null) {
            return -1;
        }

        if (head.next == null) {
            int value = head.val;
            head = null;
            return value;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        int value = last.val;
        last.prev.next = null;
        return value;
    }

    public int delete(int index) {
        if (index < 0 || head == null) {
            return -1;
        }
        if (head == null) {
            return deleteFirst();
        }

        Node indexNode = get(index);
        if (indexNode == null) {
            return -1;
        }
        int value = indexNode.val;
        if (indexNode.next != null) {
            indexNode.next.prev = indexNode.prev;
        }
        if (indexNode.prev != null) {
            indexNode.prev.next = indexNode.next;
        }
        
        return value;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        if (index < 0 || head == null) {
            return null;
        }
        Node node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }
}

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(24);
        list.insertFirst(41);
        list.insert(24, 4);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(9);
        list.insertLast(14);

        list.display();
        
        System.out.println(list.deleteFirst());
        System.out.println(list.delete(5));
        System.out.println(list.deleteLast());

        list.display();
    }
} */



// Linked List - Circular


/*
class CLL {
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
		    node = node.next;
		}
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }
}

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(24);
        list.insert(41);
        list.insert(4);
        list.insert(1);
        list.insert(2);
        list.insert(9);
        list.insert(14);

        list.display();
        
        list.delete(4);

        list.display();
    }
} */



/***************************/
/**** Practice Question ****/



// Insert using recursion


/*
class LL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(24);
        list.insertFirst(41);
        list.insert(4, 2);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(9);
        list.insertLast(14);
        list.insertRec(50, 3);

        list.display();
        
        System.out.println(list.deleteFirst());
        System.out.println(list.delete(4));
        System.out.println(list.deleteLast());

        list.display();
    }
} */



// Remove duplicates


/*
class LL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void duplicates() {
        Node node = head;
    
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(1);
        list.insertFirst(1);
        list.insert(2, 2);
        list.insertLast(3);
        list.insertLast(9);
        list.insertLast(9);
        list.insertLast(14);

        list.display();

        list.duplicates();

        list.display();
    }
} */


// Merging to sorted lists


/*
class LL {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static LL merge(LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
    
        LL ans = new LL();
    
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
    
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
    
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
    
        return ans;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class Main {
    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertFirst(3);
        first.insertFirst(2);
        first.insertFirst(1);
        first.insertLast(4);
        second.insertLast(2);
        second.insertLast(3);
        second.insertLast(4);
        second.insertLast(6);

        first.display();
        second.display();

        LL list = LL.merge(first, second);

        list.display();
    }
} */



// Check wether cycle is present or not & also find length of cycle & also find it is starting from
// Time Complexity -> O(n)

 
/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public boolean hasCycle() {
        return helper(head);
    }

    public boolean helper(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast =  fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public int lengthOfCycle() {
        return helper2(head);
    }

    public int helper2(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast =  fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                int length = 0;
                do {
                    slow = slow.next;
                    length++;
                    if (slow == fast) {
                        return length;
                    }
                } while (fast != slow);
            }
        }

        return -1;
    }

    public int cycleStart() {
        return helper3(head);
    }

    public int helper3(Node head) {
        int length = 0;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast =  fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                length = helper2(slow);     // Get length of cycle
                break;
            }
        }

        if (length == 0) {
            return -1;
        }

        Node f = head;
        Node s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        while (f != s) {      // Keep moving forward & they will meet at cycle start  
            f = f.next;
            s = s.next;
        }

        return s.value;
    }
    
    public void cycle() {      // Makes a cycle for demo
        Node node = tail;
        node.next = head.next.next;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(1);
        
        list.display();
        System.out.println(list.hasCycle());

        list.cycle();       // Creates a cycle
        System.out.println(list.hasCycle());
        System.out.println(list.lengthOfCycle());
        System.out.println(list.cycleStart());
    }
} */



// Happy Number ->
// Input: n = 19
// Output: true
// Explanation:
// 1^2 + 9^2 = 82
// 8^2 + 2^2 = 68
// 6^2 + 8^2 = 100
// 1^2 + 0^2 + 0^2 = 1


/*
public class Main {
    public static void main(String[] args) {
        System.out.println(isHappy(12));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    private static int findSquare(int num) {
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem;
            num /= 10;
        }

        return ans;
    }
} */



// Find middle of linked list


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public int middleNode() {
        return helper(head);
    }

    private int helper(Node node) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.value;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        
        list.display();
        System.out.println(list.middleNode());
    }
} */



// Sort two linked list using Merege Sort


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node sort() {
        head = helper(head);
        return head;
    }

    public Node helper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node left = helper(head);
        Node right = helper(mid);

        return merge(left, right);
    }

    private Node merge(Node first, Node second) {
        Node dummyHead = new Node(0);
        Node tail = dummyHead;

        while (first != null && second != null) {
            if (first.value < second.value) {
                tail.next = first;
                first = first.next;
                tail = tail.next;
            } else {
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }

        tail.next = (first != null) ? first : second;
        return dummyHead.next;
    }

    private Node getMiddle(Node head) {
        Node midPrev = null;

        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        Node mid = midPrev.next;
        midPrev.next = null;

        return mid;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        
        list.display();
        list.sort();
        list.display();
    }
} */



// Sort two linked list using Quick Sort


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        
        if (col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value) {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, 0);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        
        list.display();
        list.bubbleSort();
        list.display();
    }
} */



// Reversing a linked list


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverse() {
        reverse(head);
    }

    private void reverse(Node node) {
        if (tail == node) {
            head = tail;
            return;
        }

        reverse(node.next);
        
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverseIteration() {
        reverseIteration(head);
    }

    private void reverseIteration(Node present) {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        
        list.display();
        // list.reverse();
        // list.display();
        list.reverseIteration();
        list.display();
    }
} */



// Reverse a part of linked list


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseBetween(int left, int right) {
        head = reverseBetween(head, left, right);
    }

    private Node reverseBetween(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        Node current = head;
        Node prev = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;            
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;

        Node next = current.next;
        
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(4);
        
        list.display();
        list.reverseBetween(2, 5);
        list.display();
    }
} */



// Check palindrome


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private Node middle(Node node) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node reverseIteration(Node head) {
        if (head == null) {
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public boolean checkPaindrome() {        
        Node mid = middle(head);
        Node newHead = reverseIteration(mid);
        Node temp = newHead;

        while (head != null && newHead != null) {
            if (head.value != newHead.value) {
                return false;
            }

            head = head.next;
            newHead = newHead.next;
        }

        reverseIteration(temp);

        return true;        
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(32);
        // list.insertLast(3);
        list.insertLast(22);
        list.insertLast(1);
        
        list.display();
        System.out.println(list.checkPaindrome());
    }
} */



// Re - order list


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private Node middle(Node node) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node reverseIteration(Node head) {
        if (head == null) {
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public void reorder() {
        if (head == null || head.next == null) {
            return;
        }

        Node midlle = middle(head);
        Node headSecond = reverseIteration(midlle);
        Node headFirst = head;

        while (headFirst != null && headSecond != null) {
            Node temp1 = headFirst.next;
            headFirst.next = headSecond;            
            headFirst = temp1;

            Node temp2 = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp2;
        }

        if (headFirst != null) {
            headFirst.next = null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertLast(4);
        list.insertLast(2);
        list.insertLast(32);
        list.insertLast(3);
        list.insertLast(22);
        // list.insertLast(1);
        
        list.display();
        list.reorder();
        list.display();
    }
} */



// Reverse nodes in k group & also alternate k group


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseKNodes(int k) {
        head = reverseKNodes(head, k);
    }

    private Node reverseKNodes(Node head, int k) {
        Node current = head;
        Node prev = null;

        while (true) {
            Node last = prev;
            Node newEnd = current;
    
            Node next = current.next;
            
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
    
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
    
            newEnd.next = current;

            if (current == null) {
                break;
            }

            prev = newEnd;
        }
        return head;
    }

    public void reverseKNodesAlternate(int k) {
        head = reverseKNodesAlternate(head, k);
    }

    private Node reverseKNodesAlternate(Node head, int k) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            Node last = prev;
            Node newEnd = current;
    
            Node next = current.next;
            
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
    
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
    
            newEnd.next = current;

            for (int i = 0; current != null && i < k; i++) {        // Skip k nodes
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(4);
        
        list.display();
        // list.reverseKNodes(3);
        list.reverseKNodesAlternate(2);
        list.display();
    }
} */



// Rotate list to the right by k places
// Time complexity -> O(n)


/*
class LL {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void rotateRight(int k) {
        head = rotateRight(head, k);
    }

    private Node rotateRight(Node head, int k) {
        if (k <= 0 || head == null || head.next == null) {
            return head;
        }

        Node last = head;
        int length = 1;

        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;

        Node newLast = head;

        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(1);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(4);
        
        list.display();
        list.rotateRight(3);
        list.display();
    }
}*/
/***************************/



/**** Chapter 9 ****/
/**** Stacks and Queues ****/



// Stack -> It is a linear data structure which follows a particular order in which the operations are performed it is LIFO(Last In First Out) data structure
// Operations -> push, pop, peek, isEmpty, isFull



// Using Pre defined Stack 


/*
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(34);
        stack.push(4);
        stack.push(3);
        stack.push(354);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());     // Exception underflow
    }
} */



// Queue -> It is a linear data structure which follows a particular order in which the operations are performed it is FIFO(First In First Out) data structure
// Operations -> enqueue, dequeue, peek, isEmpty, isFull



// Using Pre defined Queue


/*
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
} */



// Deque (Deck) -> It is a linear data structure which follows a particular order in which the operations are performed
// Operations -> addFirst, addLast, removeFirst, removeLast, peekFirst, peekLast, isEmpty, isFull



// Using Pre defined Deque


/*
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(3);
        deque.addLast(6);
        deque.addFirst(8);
        deque.add(9);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.remove());
    }
} */



// Custom Stack


/*
class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow / Full");
            return false;
        }
        top++;
        data[top] = item;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannont pop from an empty stack / underflow");
        }
        int removed = data[top];
        top--;
        return removed;
        // return data[top--];      // Can use this for simplification
    }
    public int peak() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannont peak from an empty stack / underflow");
        }
        return data[top];
    }

    public boolean isFull() {
        return top == data.length - 1;      // Top is at last index
    }
    public boolean isEmpty() {             // Top is at -1
        return top == -1;
    }
}

class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();        // It will call CustomStack()
    }
    public DynamicStack(int size) {
        super(size);    // It will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack(5);

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);     // Stack overflow

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());       // Stack underflow
    }
} */



// Custom Queue


/*
class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }
    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i-1] = data[1];
        }

        end--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(5);
        queue.insert(6);
        queue.insert(44);
        queue.insert(56);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
} */



// Custom Queue main for college


/*
class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int front = -1;
    int rear = -1;

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    
    public boolean isFull() {
        return rear == data.length - 1;
    }
    public boolean isEmpty() {
        return rear == -1;
    }

    public void enQueue(int item) {
        if (front == -1 && rear == -1) {
            front++;
            rear++;
            data[rear] = item;
        } else {
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                rear++;
                data[rear] = item;
            }
        }
    }
    public void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        int element = data[front];
        front++;
        System.out.println("Deleted: " + element);
    }
    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}

public class Main {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(40);
        queue.enQueue(4);       // Queue will be full

        queue.display();

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.display();

        queue.deQueue();
        queue.deQueue();            // Queue will be empty

        queue.display();
    }
} */



// Circular Queue


/*
class CircularQueue {
    int[] data;
    private static final int DEFAULT_SIZE = 10;
    int front = 0;
    int rear = 0;
    int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }
    
    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean push(int item) {
        if (isFull()) {
            return false;
        }
        data[rear++] = item;
        rear = rear % data.length;
        size++;
        return true;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != rear);
        System.out.println("END");
    }
}

class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            rear = data.length;
            data = temp;
        }

        return super.push(item);
    }
}

public class Main {
    public static void main(String[] args) {
        // CircularQueue queue = new CircularQueue(5);
        DynamicQueue queue = new DynamicQueue(5);

        queue.push(6);
        queue.push(65);
        queue.push(4);
        queue.push(5);
        queue.push(9);
        queue.push(44);

        queue.display();

        System.out.println(queue.pop());

        queue.display();

        queue.push(20);

        queue.display();
    }
} */



/***************************/
/**** Practice Question ****/



// Implement queue using stacks (insert efficient)


/*
import java.util.Stack;

class QueueUsingStack {
    private Stack<Integer> first, second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>(); 
    }

    public void enqueue(int item) {
        first.push(item);
    }
    public int dequeue() throws Exception{
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peak = second.peek();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return peak;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(45);

        try {
            System.out.println(queue.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }

        queue.enqueue(6);

        try {
            System.out.println(queue.dequeue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} */



// Implement queue using stacks (remove efficient)


/*
import java.util.Stack;

class QueueUsingStack {
    private Stack<Integer> first, second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>(); 
    }

    public void enqueue(int item) throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()){
            first.push(second.pop());
        }        
    }
    public int dequeue(){
        return second.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(45);

        System.out.println(queue.peek());
        
        queue.enqueue(6);
        
        System.out.println(queue.dequeue());
    }
} */



// Game of two stacks


/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int twoStacks(int allowedSum, int[] a, int[] b) {
        return twoStacks(allowedSum, a, b, 0, 0) - 1;
    }

    private static int twoStacks(int allowedSum, int[] a, int[] b, int sum, int count) {
        if (sum > allowedSum) {
            return count;
        }
        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = twoStacks(allowedSum, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = twoStacks(allowedSum, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        for (int i = 0; i < time; i++) {
            int sizeF = sc.nextInt();
            int sizeS = sc.nextInt();
            int allowedSum = sc.nextInt();
            int[] a = new int[sizeF];
            int[] b = new int[sizeS];

            for (int j = 0; j < sizeF; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < sizeS; j++) {
                b[j] = sc.nextInt();
            }

            System.out.println(twoStacks(allowedSum, a, b));
        }
    }
} */



// Largest area in histogram        // Did't uderstand perfectly


/*
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};

        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        
        while (!stack.isEmpty()) {
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
        int area;
        int popped = stack.pop();

        if (stack.isEmpty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stack.peek());
        }

        return Math.max(max, area);
    }
} */



// Valid parentheses


/*
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "{[()]}";

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
} */



// Minimum add to make parentheses valid


/*
public class Main {
    public static void main(String[] args) {
        String s = "{{}{{{}";

        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '}') {
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.size();
    }
} */



// Minimum insertion to balance parantheses string


/*
public class Main {
    public static void main(String[] args) {
        String s = "{}}";

        System.out.println(minAddToMakeValid(s));
    }

    public static int minAddToMakeValid(String s) {
        // Unsolved
    }
} */
/***************************/



// Tic Tac Toe Game


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        
        while (!gameOver) {
            int row = 0, col = 0;
            printBoard(board);
            System.out.print("Player " + player + " enter: ");
            int input = sc.nextInt();
            
            switch (input) {
                case 1 -> {row = 0; col = 0;}
                case 2 -> {row = 0; col = 1;}
                case 3 -> {row = 0; col = 2;}
                case 4 -> {row = 1; col = 0;}
                case 5 -> {row = 1; col = 1;}
                case 6 -> {row = 1; col = 2;}
                case 7 -> {row = 2; col = 0;}
                case 8 -> {row = 2; col = 1;}
                case 9 -> {row = 2; col = 2;}
            }

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("player " + player + " has won");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Try again");
            }
        }
        printBoard(board);
    }

    public static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {      // For row
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        for (int col = 0; col < board[0].length; col++) {      // For col
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        System.out.println("+---+---+---+");
        for (int row = 0; row < board.length; row++) {
            System.out.print("| ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
            System.out.println("+---+---+---+");
        }
    }
} */



/**** Chapter 10 ****/
/**** Trees ****/



// Tree -> It is a non linear data structure which is represented by nodes connected by edges
// Time complexity ->
// Creating -> O(1)
// Inserting and deleting -> O(h)

// Size -> Number of nodes in a tree
// Height -> Max number of edges in the longest path from root to leaf node
// Level -> Subtraction of height of root node - height of node and root height is 0
// Ancestor & Descendant -> If there is a path from root to node then root is ancestor and node is descendant
// Degree -> Number of children of a node, it's 0, 1 or 2 in binary tree
// structure ->
//     /\  -> Root
//     \/ 
//     /\   
//    /  \  -> Edges
//   /    \
//  /\    /\  -> Parent
//  \/    \/
//        /\
//       /  \
//      /    \
//     /\    /\  -> Children
//     \/    \/  -> Leaf Node
//      ^     ^
//       \    |
//        \   |
//         \  |
//       siblings


// Types of binary tree ->
// 1) Complete binary tree -> All levels are completely filled except the last level and last level is filled from left to right
// 2) Full / Strict binary tree -> Every node has either 0 or 2 children
// 3) Perfect binary tree -> All levels are completely filled
// 4) Height balanced binary tree -> Average height O(logn)
// 5) Skewed binary tree -> Either left or right subtree is empty every node has only one child
// 6) Ordered binary tree -> Every node has some property like all the nodes in the left subtree are less than the root node and all the nodes in the right subtree are greater than the root node


// Properties of binary tree ->
// 1) Total nodes in a perfect binary tree = 2^(h + 1) - 1
// 2) Total no of leaf nodes in a perfect binary tree = 2^h
// 3) Total no of internal nodes in a perfect binary tree = 2^(h + 1) - 1 - 2^h = 2^h - 1
// 4) N = no. of leaf nodes then there is logN + 1 levels at least in a binary tree
// 5) If we have N nodes then log(N + 1) is the minmum levels in a binary tree
// 6) If we have N leaf nodes then N - 1 internal nodes in strict binary tree
// +-----------------------------------------------+
// | No. of leaf nodes = no. of internal nodes + 1 |
// +-----------------------------------------------+
// 7) No. of leaf nodes = 1 + no. of internal nodes with 2 children(not includiong root node)


// Implementation ->
// 1) Linked representation
// 2) Sequential representation using array



// Linked representation


/*
import java.util.Scanner;

class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;
        
        public Node(int value) {
            this.value = value;
        }        
    }

    private Node root;

    public void populate(Scanner sc) {
        System.out.print("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root, "");
    }
    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        // tree.display();
        tree.prettyDisplay();
    }
} */



// Binary Search Tree


/*
class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
        
        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        // int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        tree.populate(nums);
        // tree.populateSorted(nums2);      // For sorted array

        tree.display();
        System.out.println();
        tree.prettyDisplay();
    }
} */



// Traversal Methods
//     10
//    /  \
//   20  12
//  / \
// 15 13
// 1) Preorder -> Root -> Left -> Right     // Used for evaluating of math expression or copying serialisation from string / Array
// Preorder -> 10 20 15 13 12
// 2) Inorder -> Left -> Root -> Right      // Gives a sorted traversal
// Inorder -> 15 20 13 10 12
// 3) Postorder -> Left -> Right -> Root    // Used for deleting binary tree or when calculation is done from bottom up calculation
// Postorder -> 15 13 20 12 10



// Example of preorder, inorder and postorder


/*
class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;
        
        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() + ": ");
    }

    public void preOrder() {
        preOrder(root);
    }
    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
}

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5, 2, 7, 1, 4, 6, 9, 8, 3, 10};
        tree.populate(nums);

        tree.display();
        tree.preOrder();
        System.out.println();
        tree.inOrder();
        System.out.println();
        tree.postOrder();
    }
} */



// Balanced tree -> For every node in the tree, the diff. in height of left and right subtree is <= 1 (-1, 0, 1)
// When the tree is unbalanced then we have to use self balancing binary tree like AVL tree, Red Black tree, etc.
// AVL Tree (Adelson - Velski & landis) -> It is a self balancing binary search tree
// Algorithm ->
// 1) Insert normally node n
// 2) Start form node n & find the node that makes the tree unbalanced, bottom up approach
// 3) Using one of the 4 rules; rotate
// 4 Rules ->
// case 1 -> left left
//        p                                       c
//      /  \                                    /  \
//     c   t4                                  g    p
//    / \          -> Right rotation ->      /  \  / \
//   g  t3                                 t1  t2 t3 t4
//  / \
// t1 t2
// case 2 -> left right
//        p                                       p                                       c
//      /  \                                    /  \                                    /  \
//     c   t4                                  g   t4                                  g    p
//    / \          -> Left rotation ->        / \          -> Right rotation ->      /  \  / \
//   t1  g                                   c  t3                                 t1  t2 t3 t4
//      / \                                 / \
//     t2 t3                               t1 t2
// case 3 -> right right
//        p                                       c
//      /  \                                    /  \
//     t1   c                                  p    g
//         / \          -> Left rotation ->   / \  / \
//        t2  g                             t1 t2 t3 t4
//           / \
//          t3 t4
// case 4 -> right left
//        p                                       p                                       c
//      /  \                                    /  \                                    /  \
//     t1   c                                  t1   g                                  p    g
//         / \          -> Right rotation ->       / \        -> Left rotation ->    /  \  / \
//        g  t4                                  t2   c                            t1  t2 t3 t4
//       / \                                         / \
//      t2 t3                                       t3 t4
// Time complexity -> O(log(n) + 1) -> O(logn)


/*
class AVL {
    private static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height() {
        return height(root);
    }
    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }
        
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {                       // Left heavy
            if (height(node.left.left) - height(node.right.right) > 0) {        // Left left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {         // Left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {                      // Right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {        // Right Right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {         // Right left case
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }

        return node;
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }
    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public boolean balanced() {
        return balanced(root);
    }
    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, 0);
    }
    public void display(Node node, int level) {
        if (node == null) {
            return;
        }

        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.value);
        } else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();

        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }

        tree.display();
        System.out.println(tree.height());
    }
} */



// Segment tree -> When performing queries on a range
// Definition -> It is a binary tree which has interval info & operation performed
// Time Complexity -> O(logn) both for query and update
// Space Complexity -> O(n)
// Cases for preforming queries & updates ->
// 1) If the range is completely inside the query range
// 2) If the range is completely outside the query range
// 3) If the range is overalapping inside the query range



// Segment tree implementation


/*
class SegmentTree {
    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    public Node constructTree(int[] arr, int start, int end) {       // Time complexity O(n) to construct tree
        if (start == end) {     // We are at leaf node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = start + (end - start) / 2;

        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                node.data  = update(node.left, index, value) + update(node.right, index, value);
                return node.data;
            }
        }

        return node.data;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left Child => ";
        }

        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if (node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right Child";
        }

        System.out.println(str + "\n");

        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 8, 4, -1, 6, 7};

        SegmentTree tree = new SegmentTree(arr);
        tree.display();
        System.out.println(tree.query(2, 4));
        tree.update(2, 99);
        tree.display();
    }
} */



// Heap -> It is a complete binary tree which satisfies the heap property
// Heap property -> 1) For max heap, the value of the parent node is greater than the value of the child node
//                  2) For min heap, the value of the parent node is less than the value of the child node
// In reality it is implemented using array
// For a node at index i = 1, left child = 2i, right child = 2i + 1, parent = i / 2
// Algorithm -> For max heap
// 1) Insertion -> Insert the element at the end of the heap and then heapify it
// 2) Deletion -> Replace the root node with the last node and then heapify it
// Time Complexity -> O(logn)
// Space Complexity -> O(n)




// Heap implementation - Min Heap


/*
import java.util.ArrayList;

class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index  * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);

        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Removing from an empty heap");
        }

        T temp  = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }

        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }
        return data;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();
        heap.insert(5);
        heap.insert(9);
        heap.insert(6);
        heap.insert(8);
        heap.insert(2);
        ArrayList<Integer> list = heap.heapSort();
        System.out.println(list);
    }
} */



// Heap implementation - Max Heap


/*
import java.util.Arrays;

class Heap {
    private int[] heap;
    private int size = 0;

    public Heap(int size) {
        heap = new int[size];
    }

    private void swap(int first, int second) {
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index  * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public void insert(int value) throws Exception {
        if (size >= heap.length) {
            throw new Exception("Heap overflow");
        }

        heap[size] = value;
        upHeap(size);
        size++;
    }

    private void upHeap(int index) {
        if (index == 0) {
            return;
        }

        int p = parent(index);
        if (heap[index] > heap[p]) {
            swap(index, p);
            upHeap(p);
        }
    }

    public int remove() throws Exception {
        if (size == 0) {
            throw new Exception("Removing from empty heap");
        }

        int temp = heap[0];
        int last = heap[size - 1];
        if (size != 0) {
            heap[0] = last;
            size--;
            downHeap(0);
        }

        return temp;
    }

    private void downHeap(int index) {
        int largest = index;
        int left = left(index);
        int right = right(index);

        if (left < size && heap[largest] < heap[left]) {
            largest = left;
        }

        if (right < size && heap[largest] < heap[right]) {
            largest = right;
        }

        if (largest != index) {
            swap(largest, index);
            downHeap(largest);
        }
    }

    public int[] heapSort() throws Exception {
        int[] arr = new int[size];
        int aSize = size;
        for (int i = 0; i < aSize; i++) {
            arr[i] = remove();
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Heap heap = new Heap(6);
        heap.insert(6);
        heap.insert(9);
        heap.insert(21);
        heap.insert(4);
        heap.insert(7);
        
        System.out.println(Arrays.toString(heap.heapSort()));
    }
} */



/***************************/
/**** Practice Question ****/



// 



// public class Main {
//     public static void main(String[] args) {
        
//     }
// }
/***************************/



/**** Chapter 11 ****/
/**** HashMaps & HashTable****/



// Hash Table -> It is a data structure which stores data in an associative manner
// It uses a hash function to compute an index into an array of buckets or slots from which the desired value can be found
// Time complexity -> O(1) for search, insert and delete
// Space complexity -> O(n)

// Size of table -> m = Theta(n)
//                 / \
//                /   \
//    Slow <- Small  Big ->  Wasteful
// Idea -> Start small & then grow means initial small then double the size when n == m
// When we double the table, cost to insert n items -> O(n)
// Inserting 1 item -> O(1) -> Amortized constant time
// If n = m / 2 then shrink by m / 2 -> O(n) per operation
// If n = m / 4 then we half the size -> O(1) -> Amortized constant time

// HashCode -> It is a unique integer key value assigned to an object in Java
// Hashing -> It is a technique to convert a range of key values into a range of indexes of an array

// Collision -> When two keys have the same hash code
// Ways to resolve collision ->
// 1) Chaining -> It is a technique in which each bucket is independent of the others and has some sort of list of entries with the same index
//             Problem -> If when so many elements in the same linked list time complexity will increase so we do an assumption
//             Solution -> Simple Uniform Hashing -> n = no. of keys in table
//                                                   m = size of table
//                                                   load factor = alpha = n / m = expected key per slot
//                                                   Time complexity = O(1 + alpha)
//                                                   if alpha = O(1) => m = Omega(n) => Time complexity = O(1)
// When to use -> Less sensitive to hash functions
// 2) Open addressing -> It is a technique in which all the elements are stored in the hash table itself, it is done by probing/searching for the next empty slot
// Probing Strategies ->
// (i) Linear probing -> h(k, i) = (h(k) + i) % m where h(k) is the hash function, i is the probe number, but it has clustering problem
// (ii) Double hashing -> h(k, i) = (h1(k) + i * h2(k)) % m where h1(k) is the primary hash function, h2(k) is the secondary hash function, m is the size of the table
// Uniform Hashing Assumption -> Each key is equally likely to have any of the m! permutations as its hash value
// Cost of next operation -> 1 / (1 - alpha) where alpha = n / m (load factor)
// When to use -> Better cache performance, pointers not needed

// Hash Function ->
// 1) Division method -> h(k) = k % m where m is the size of the table/array or any prime number
// 2) Multiplication method -> h(k) = [(ak) % 2^m] >> (w - r) where a is a odd random number, w is no. of bits in k, m = 2^r, 2^(w-1) < a < 2^w
// 3) Universal hashing -> h(k) = [(ak + b) % p] % m where a & b are random numbers, p is a large prime number




// Hash Code Function Example


/*
public class Main {
    public static void main(String[] args) {
        String name = "Mayank";
        Integer a = 6475;
        int code = name.hashCode();
        int code2 = a.hashCode();
        
        System.out.println(code);
        System.out.println(code2);
    }
} */



// Hash Maps


/*
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        hashMap.put("Mayank", 89);
        hashMap.put("Aadit", 99);
        hashMap.put("Shivansh", 94);

        System.out.println(hashMap.get("Mayank"));
        System.out.println(hashMap.getOrDefault("Kunal", 78));      // If does not exit give default value
        System.out.println(hashMap.containsKey("Aadit"));
    }
} */



// Hash Set     // Set of non duplicate values


/*
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(56);
        hashSet.add(76);
        hashSet.add(6);
        hashSet.add(27);
        hashSet.add(56);
        hashSet.add(83);

        System.out.println(hashSet);
    }
} */



// Tree Map     // Stores data in sorted order


/*
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> hashMap = new TreeMap<>();
        
        hashMap.put("Mayank", 89);
        hashMap.put("Aadit", 99);
        hashMap.put("Shivansh", 94);

        System.out.println(hashMap.get("Mayank"));
        System.out.println(hashMap.getOrDefault("Kunal", 78));      // If does not exit give default value
        System.out.println(hashMap.containsKey("Aadit"));
    }
} */



// Custom Hash Map 


/*
class HashMap {
    private Entity[] entities;

    public HashMap() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);        // Overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        hashMap.put("Mango", "King of fruits");
        hashMap.put("Apple", "Sweet red fruits");
        hashMap.put("Litchi", "Juciy fruit");

        System.out.println(hashMap.get("Apple"));
    }
} */



// Custom Hash Map using Linked List


/*
import java.util.ArrayList;
import java.util.LinkedList;

class HashMap<K, V> {
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    public HashMap() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value) {
        int hash = Math.abs(key.hashCode() % list.size());
        
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if ((float) (size) / list.size() > lf) {
            reHash();            
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash() {
        System.out.println("We are now rehashing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();
        
        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        for (LinkedList<Entity> entries : old) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                return entity.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);
        Entity target = null;

        for (Entity entity : entities) {
            if (entity.key.equals(key)) {
                target = entity;
                break;
            }
        }
        
        entities.remove(target);
        size--;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("{");
        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                builder.append(entity.key);
                builder.append(" = ");
                builder.append(entity.value);
                builder.append(", ");
            }
        }
        builder.append("}");

        return builder.toString();
    }

    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Mango", "King of fruits");
        hashMap.put("Apple", "Sweet red fruits");
        hashMap.put("Litchi", "Juciy fruit");

        System.out.println(hashMap.get("Apple"));
        System.out.println(hashMap);
    }
} */



// Karp Rabin Algorithm     // Used to search ssebset in string

// Strng a = mayank
// String b = hello i'm mayankraj
// Time complexity -> O(length(a) + (length(b) * cost of hash fumction))


/*
class KarpRabin {
    private final int PRIME = 101;

    private double calulateHash(String str) {
        double hash = 0;

        for (int i = 0; i < str.length(); i++) {
            hash = hash + str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private double updateHash(double prevHash, char oldChar, char newChar, int patternLength) {
        double newHash = (prevHash - oldChar) / PRIME;
        newHash = newHash + newChar * Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        double patternHash = calulateHash(pattern);
        double textHash = calulateHash(text.substring(0, patternLength));

        for (int i = 0; i <= text.length() - patternLength; i++) {
            if (textHash == patternHash) {
                if (text.substring(i, i + patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            if (i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        KarpRabin algo = new KarpRabin();

        String a = "mayank";
        String b = "hello i'm mayankraj";

        algo.search(b, a);
    }
} */



/***************************/
/**** Practice Question ****/



// Count sort using hash map


/*
import java.util.HashMap;

public class Main {
    public static void countSortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5 ,8, 7 ,6, 2, 1};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }
} */
/***************************/



/**** Chapter 12 ****/
/**** File Handling ****/



// Streams in Java ->
// 1) Byte Stream -> It is used to perform input and output operation on bytes or binary data
//                -> Input Stream
//                -> Output Stream

// 2) Character stream -> It is used to perform input and output for unicode
//                     -> Reader
//                     -> Writer



// Example of Byte Stream


/*
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some letters: ");
            int letters = isr.read();

            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }

            // isr.close();     // It will autamatically close the stream
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */



// Reading from a file


/*
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("note.txt")) {
            int letters = fr.read();        // Read return ascii value

            while (fr.ready()) {
                // System.out.println(letters);
                System.out.println((char) letters);
                letters = fr.read();
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */



// Buffer Reader


/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {       // Here byte to char then reading char stream by this buffer reader is a character stream which is connected to keyboard
            System.out.println("You typed: " + br.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("note.txt"))) {       // Here byte to char then reading char stream by this buffer reader is a character stream which is connected to keyboard
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */



// Output Stream Writer


/*
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OutputStream os = System.out;
        // os.write(😊);       // Range is exceeded
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello world");
            osw.write(97);
            osw.write('A');
            osw.write('\n');
            char[] arr = "Hello world".toCharArray();
            osw.write(arr);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */



// Writing to a file


/*
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fr = new FileWriter("note.txt", true)) {        // True if u want to append the file
            fr.write("Hello world");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */



// Buffered Writer


/*
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt", true))) {
            bw.write("Hello world");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */



// Working with File


/*
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("new-file.txt");
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileWriter fw = new FileWriter("new-file.txt")) {
            fw.write("Hello, I'm Mayankraj");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))) {
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File file = new File("random.txt");
            file.createNewFile();
            if (file.delete()) {
                System.out.println(file.getName() + " deleted");   
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
} */