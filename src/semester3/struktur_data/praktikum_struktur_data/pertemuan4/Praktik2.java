package semester3.struktur_data.praktikum_struktur_data.pertemuan4;

import java.util.Scanner;

class formatBiodata { 
    //bagian deklarasi struktur record
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class Praktik2 {
    public static int N=3;
    //--------------------------------------------------
    //--- Fungsi untuk mengentri data ke dalam Larik ---
    //--------------------------------------------------
    public static void ngentriData(formatBiodata biodataMahasiswa[])
    {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol=0;
        
        for (int i=0; i<=N-1; i++)
        {
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
        }
    }

    //------------------------------------------------------
    //--- Fungsi untuk Mencari Data Secara Binary Search ---
    //------------------------------------------------------
    public static void mencariDataBiner(formatBiodata biodataMahasiswa[])
    { 
        String kataKunci;
        int lokasi=-1;
        boolean statusKetemu=false;
        
        //bagian memasukkan kata kunci ------------------------------------------
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan kata kunci pencarian : ");
        kataKunci = masukan.next();
        
        //bagian mencari data satu persatu urut dari larik terdepan
        int atas,bawah,tengah;
        atas = 0;
        bawah = N-1;
        tengah = (atas + bawah) / 2;
        while ((statusKetemu == false) && (bawah-atas!=1))
        { 
            System.out.println(biodataMahasiswa[tengah].nama+" <---> "+kataKunci );
            //jika kataKunci < biodataMahasiswa[tengah].nama)
            if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) < 0){ 
                bawah = tengah;
                tengah = (atas + bawah) / 2;
            }
            //jika kataKunci > biodataMahasiswa[tengah].nama)
            else if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) > 0){ 
                atas = tengah;
                tengah = (atas + bawah) / 2;
            }
            else{ 
                statusKetemu = true;
                lokasi = tengah;
            }
        }

        if (statusKetemu == true){ 
            System.out.println("Data yang anda cari KETEMU di larik ke :"+ lokasi);
        }
        else{ 
            System.out.println("maap, nama yang anda cari tidak ditemukan ");
        }
    }

    //--------------------------------------------------
    //--- Fungsi untuk Menampilkan Data ---
    //--------------------------------------------------
    public static void tampilkanData(formatBiodata biodataMahasiswa[])
    {
        //bagian menampilkan isi struktur Larik -------
        System.out.println("-------------------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
        System.out.println("-------------------------------------------------------");
        for (int i=0; i<=N-1; i++)
        { 
            System.out.print (i +".");
            System.out.print (biodataMahasiswa[i].nama + "\t");
            System.out.print (biodataMahasiswa[i].alamat + "\t");
            System.out.print (biodataMahasiswa[i].umur + "\t");
            System.out.print (biodataMahasiswa[i].jekel + "\t");
            System.out.print (biodataMahasiswa[i].hobi[0] + "\t");
            System.out.print (biodataMahasiswa[i].hobi[1] + "\t");
            System.out.print (biodataMahasiswa[i].hobi[2] + "\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-------------------------------------------------------");
    }

    //--------------------------------------------------
    //--- Program Utama ---
    //--------------------------------------------------
    public static void main(String[] args)
    { 
        //bagian deklarasi record berbasis LARIK
        formatBiodata biodataMahasiswa[] = new formatBiodata[4];
        biodataMahasiswa[0] = new formatBiodata();
        biodataMahasiswa[1] = new formatBiodata();
        biodataMahasiswa[2] = new formatBiodata();
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
        mencariDataBiner(biodataMahasiswa); //Lakukan pemanggilan fungsi untuk mencari data secara Biner 
    }
}
