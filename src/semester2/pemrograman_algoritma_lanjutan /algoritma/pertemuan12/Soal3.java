package algoritma.pertemuan12;

public class Soal3 {
    // Recursive minimum function
    public static int min(int[] arr, int start, int end) {
        // If start index is greater than end index
        if (start >= end) {
            return arr[start];
        }
        // If start index is less than end index
        else {
            // If current element is less than the previous element
            if (arr[start] < arr[start + 1]) {
                return arr[start];
            }
            // If current element is greater than the previous element
            else {
                return min(arr, start + 1, end);
            }
        }
    }

    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Call the recursive minimum function
        int min = min(arr, 0, arr.length - 1);
        // Print list array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print the minimum element
        System.out.println("\nMinimum element is : " + min);
    }
}
