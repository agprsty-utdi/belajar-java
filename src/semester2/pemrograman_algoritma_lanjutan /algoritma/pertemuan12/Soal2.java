package algoritma.pertemuan12;

public class Soal2 {
    public static void reverse(char[] arr, int start, int end) {
        int temp;
  
        //If start index is greater than end index
        if(start >= end)
          return;
  
        //Logic to swap values
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = (char) temp;
  
        //Recursively call
        reverse(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        // initialize the string
        // Convert the string to upper case and store it in a char array
        // Size of char array is equal to length of string
        String name = "Prasetyo";
        char[] arr = name.toUpperCase().toCharArray();
        int size = arr.length;
  
        // List all the elements in the array
        System.out.print("Array before reverse : ");
        for(int i = 0; i < size; i++) {
           System.out.print(arr[i]);
        }

        // Reverse the array
        reverse(arr, 0, size-1);
         
        // List all with the reversed elements
        System.out.print("\nArray after reverse : ");
        for(int i = 0; i < size; i++) {
           System.out.print(arr[i]);
        }
        System.out.println();
    }
}
