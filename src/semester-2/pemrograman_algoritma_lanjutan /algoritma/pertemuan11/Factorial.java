package algoritma.pertemuan11;

public class Factorial {
    public static void main(String[] args) {
        int result = mystery(5);
        System.out.println(result);
    }

    public static int mystery(int a) {
        if (a == 1) {
            System.out.println("faktorial = " + a);
            return 1;
        } else {
            System.out.println("faktorial = " + a);
            return a * mystery(a - 1);
        }
    }
}
