package semester3.struktur_data.praktikum_struktur_data.pertemuan1;
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Object data[] = new Object[5];
        String nama, alamat, jekel, hobi[] = new String[3];
        int umur;
        float ipk;
        Scanner in = new Scanner(System.in);

        int i = 0;
        while (i <= 5) {
            System.out.print("Silakan masukkan nama anda : ");
            nama = in.next();
            System.out.print("Silakan masukkan alamat anda : ");
            alamat = in.next();
            System.out.print("Silakan masukkan umur anda : ");
            umur = in.nextInt();
            System.out.print("Silakan masukkan jenis kelamin anda : ");
            jekel = in.next();
            
            int h = 0;
            while (h <= 3) {
                System.out.print("Silakan masukkan hobi anda : ");
                hobi[h] = in.next();
            }

            System.out.print("Silakan masukkan IPK anda : ");
            ipk = in.nextFloat();
            i++;
        }
    }
}
