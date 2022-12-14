package semester3.struktur_data.praktikum_struktur_data.pertemuan2;

import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel; //jenis kelamin
    String hobi[] = new String[3];
    float ipk;
} 

public class Praktik2 {
    public static int N=10;
    public static void ngentriData(formatBiodata biodataMahasiswa[])
    {
        //bagian entri data ke dalam struktur larik ----------------
        Scanner masukan = new Scanner(System.in);
        int bacaTombol=0;

        for (int i=0; i<=N-1; i++){ 
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            
            try
            { 
                bacaTombol = System.in.read();
            }
            catch(java.io.IOException e){}

            biodataMahasiswa[i].jekel = (char)bacaTombol;
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("hobi ke-1 : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("hobi ke-2 : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
        }
    }

    //--------------------------------------------------
    //--- Fungsi untuk menampilkan data ---
    //--------------------------------------------------
    public static void tampilkanData(formatBiodata biodataMahasiswa[])
    {
    //bagian menampilkan isi struktur Larik --------------------------
        System.out.println("---------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
        System.out.println("---------------------------------------------");
        for (int i=0; i<=N-1; i++){ 
            System.out.print (biodataMahasiswa[i].nama + " ");
            System.out.print (biodataMahasiswa[i].alamat + " ");
            System.out.print (biodataMahasiswa[i].umur + " ");
            System.out.print (biodataMahasiswa[i].jekel + " ");
            System.out.print (biodataMahasiswa[i].hobi[0] + " ");
            System.out.print (biodataMahasiswa[i].hobi[1] + " ");
            System.out.print (biodataMahasiswa[i].hobi[2] + " ");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("---------------------------------------------");
    }

    //--------------------------------------------------
    //--- Program Utama ---
    //--------------------------------------------------
    public static void main(String[] args)
    { 
        //bagian deklarasi record berbasis LARIK -----------------------
        formatBiodata biodataMahasiswa[] = new formatBiodata[10];
        biodataMahasiswa[0] = new formatBiodata();
        biodataMahasiswa[1] = new formatBiodata();
        biodataMahasiswa[2] = new formatBiodata();
        biodataMahasiswa[3] = new formatBiodata();
        biodataMahasiswa[4] = new formatBiodata();
        biodataMahasiswa[5] = new formatBiodata();
        biodataMahasiswa[6] = new formatBiodata();
        biodataMahasiswa[7] = new formatBiodata();
        biodataMahasiswa[8] = new formatBiodata();
        biodataMahasiswa[9] = new formatBiodata();
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}
