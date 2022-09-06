package praktikum.pertemuan11;

public class printArray {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        dataArray(data);
    }

    public static void dataArray(int[] data) {
        int i = 0;
        while (i<10){
            System.out.print(data[i]+" ");
            i++;
        }
        System.out.println("");
    }
}
