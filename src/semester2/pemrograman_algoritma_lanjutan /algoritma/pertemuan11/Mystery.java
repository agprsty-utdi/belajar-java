package algoritma.pertemuan11;

public class Mystery {
    public static void main(String[] args) {
        int result = mystery(2, 5);
        System.out.println(result);
    }

    public static int mystery(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return b + mystery(a, b - 1);
        }
    }
}