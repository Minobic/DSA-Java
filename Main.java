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
/**** String & StringBuilder ****/



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



/**** Chapter 8 ****/
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



// Segment tree implementation



// public class Main {
//     public static void main(String[] args) {

//     }
// }



// Heap -> It is a complete binary tree which satisfies the heap property
// Heap property -> 1) For max heap, the value of the parent node is greater than the value of the child node
//                  2) For min heap, the value of the parent node is less than the value of the child node
// In reality it is implemented using array
// For a node at index i = 1, left child = 2i, right child = 2i + 1, parent = i / 2
// Algorithm -> For max heap
// 1) Insertion -> Insert the element at the end of the heap and then heapify it
// 2) Deletion -> Replace the root node with the last node and then heapify it




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



// 



// public class Main {
//     public static void main(String[] args) {
        
//     }
// }