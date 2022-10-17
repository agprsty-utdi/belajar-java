package semester3.struktur_data.praktikum_struktur_data.pertemuan7;

class tipePointer { 
    int angka;
    String teks;
    tipePointer kanan;
}

public class Praktik2 {
    public static void main(String[] args) {
        tipePointer P = new tipePointer();
        P.angka = 100;
        P.teks = "Halo";
        tipePointer Q = new tipePointer();
        Q.angka = 200;
        Q.teks = "Akakom";
        System.out.println("Nilai P dan Q sebelum pointer dimanipulasi :");
        System.out.println("--------------------------------------------");
        System.out.println("Nilai P.angka adalah = " + P.angka);
        System.out.println("Nilai P.teks adalah = " + P.teks);
        System.out.println("Nilai Q.angka adalah = " + Q.angka);
        System.out.println("Nilai Q.teks adalah = " + Q.teks);
        tipePointer R;
        R = P;
        P = Q;
        Q = R;
        System.out.println("Nilai P dan Q setelah pointer dimanipulasi :");
        System.out.println("--------------------------------------------");
        System.out.println("Nilai P.angka adalah = " + P.angka);
        System.out.println("Nilai P.teks adalah = " + P.teks);
        System.out.println("Nilai Q.angka adalah = " + Q.angka);
        System.out.println("Nilai Q.teks adalah = " + Q.teks);
    }
}
