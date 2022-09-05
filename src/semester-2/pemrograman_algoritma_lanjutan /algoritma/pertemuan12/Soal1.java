package algoritma.pertemuan12;

public class Soal1 {
    // Function recursively with print array
    public static void printArray(int[] arr, int start, int end) {
        // If start index is greater than end index
        if (start > end) {
            return;
        }
        // If start index is less than end index
        else {
            // Print the current element
            System.out.print(arr[start] + " ");
            // Recursively call
            printArray(arr, start + 1, end);
        }
    }
    
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Call the recursive print array function
        printArray(arr, 0, arr.length - 1);
    }
}
