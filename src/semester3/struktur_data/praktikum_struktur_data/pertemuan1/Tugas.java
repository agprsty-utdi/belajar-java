package semester3.struktur_data.praktikum_struktur_data.pertemuan1;
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data=0;
        String[] nama    = new String[255];
        String[] alamat  = new String[255];
        Integer[] umur   = new Integer[255];
        String[] jekel   = new String[255];
        Float[] ipk      = new Float[255];
        String[][] hobi  = new String[255][3];
         
        System.out.println("BIODATA MAHASISWA");
        System.out.println("+===============INPUT============================+");
        System.out.println("Masukkan banyak data = ");
        data = Integer.parseInt(input.next());
        for (int a=1;a<=data;a++){
            System.out.println("------Data ke-"+ a +"------");
            System.out.println("Masukan Nama = ");
            nama[a] = input.next();
            System.out.println("Masukan Alamat = ");
            alamat[a] = input.next();
            System.out.println("Masukan Umur = ");
            umur[a] = input.nextInt();
            System.out.println("Masukan Jenis Kelamin = ");
            jekel[a] = input.next();
            for (int h=0;h<3;h++){
                int datake = h + 1;
                System.out.println("Masukan Hobi "+datake+" = ");
                hobi[a][h] = input.next();
            }
            System.out.println("Masukan IPK = ");
            ipk[a] = input.nextFloat();
        }
         
        System.out.println("+==============OUTPUT========================+");
        for (int a=1; a<=data;a++){
            System.out.println("Data Mahasiswa ke- " + a);
            System.out.println("Nama    : "+ nama[a]);
            System.out.println("Alamat  : "+ alamat[a]);
            System.out.println("Umur    : "+ umur[a]);
            System.out.println("Kelamin : "+ jekel[a]);
            for (int b=0;b<3;b++){
                int datake = b + 1;
                System.out.println("Hobbi ke "+datake+" : "+ hobi[a][b]);
            }
            System.out.println("IPK     : "+ ipk[a]);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
        System.out.println("Banyak data : " + data);
    }
}
