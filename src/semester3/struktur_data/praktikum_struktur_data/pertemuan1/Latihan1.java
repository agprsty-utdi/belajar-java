package semester3.struktur_data.praktikum_struktur_data.pertemuan1;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        String password;
        Scanner in = new Scanner(System.in);

        System.out.print("Silakan masukkan password anda : ");
        password = in.next();

        try {
            if (password.equalsIgnoreCase("AKAKOM")) {
                System.out.println("password anda benar");
            } else {
                System.out.println("password anda salah");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
