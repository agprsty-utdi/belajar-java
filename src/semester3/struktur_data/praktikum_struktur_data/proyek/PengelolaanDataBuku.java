package semester3.struktur_data.praktikum_struktur_data.proyek;
import java.util.Scanner;

class FormatDataBuku
{ 
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    float harga;
}

public class PengelolaanDataBuku 
{
    // public static int N=0;

    //--------------------------------------------------
    //--- Fungsi untuk Menampilkan Data ---
    //--------------------------------------------------
    public static void tampilkanData(FormatDataBuku dataBuku[])
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("No. JUDUL\t PENGARANG\t PENERBIT\t HARGA");
        System.out.println("-------------------------------------------------------");
        for (int i=0; i<999; i++)
        { 
            // if (dataBuku[i].judul != null) {
                System.out.print(i +".");
                System.out.print(dataBuku[i].judul + "\t");
                System.out.print(dataBuku[i].pengarang + "\t");
                System.out.print(dataBuku[i].penerbit + "\t");
                System.out.print(dataBuku[i].harga + "\t");
                System.out.println();
            // };
        }
        System.out.println("-------------------------------------------------------");
        main(null);
    }

    //--------------------------------------------------
    //--- Fungsi untuk Menambahkan Data ---
    //--------------------------------------------------
    public static void ngentriData(FormatDataBuku dataBuku[]) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Mau input berapa data? ");
        int totalData = masukan.nextInt();

        if (totalData >= 1) {
            for (int i=0; i<totalData; i++) {
                System.out.print("Silakan masukkan judul : ");
                dataBuku[i].judul = masukan.next();
                System.out.print("Silakan masukkan pengarang : ");
                dataBuku[i].pengarang = masukan.next();
                System.out.print("Silakan masukkan penerbit : ");
                dataBuku[i].penerbit = masukan.next();
                System.out.print("Silakan masukkan tahun terbit : ");
                dataBuku[i].tahun = masukan.nextInt();
                System.out.print("Silakan masukkan harga buku : ");
                dataBuku[i].harga = masukan.nextFloat();
            }
            // tampilkanData(dataBuku);
            main(null);
        }
    }

    // Exit program
    public static void exit(String msg) {
        String messages = msg == null ? "Bye!":msg;
        System.out.println(messages);
        System.exit(0);
    }

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Selamat datang dalam proyek pengelolaan data buku");
        System.out.println("Silahkan pilih menu :");
        System.out.println("1. Menambah Data \n2. Menampilkan data \n3. Mencari data \n4. Mengedit data \n5. Menghapus data \n6. Mengurutkan Data \n7. Keluar");
        System.out.print("Pilihan menu (1-7) : ");

        // bagian deklarasi record berbasis LARIK
        FormatDataBuku dataBuku[] = new FormatDataBuku[10];
        for (int i=0; i<=8; i++)
        dataBuku[i] = new FormatDataBuku();

        int inputMenu = masukan.nextInt();
        switch(inputMenu) {
            case 1:
                ngentriData(dataBuku); 
                break;
            case 2:
                tampilkanData(dataBuku);
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                exit(null);
                break;
            default:
                System.out.println("Opps.. Inputan tidak diketahui");
        }
    }
}
