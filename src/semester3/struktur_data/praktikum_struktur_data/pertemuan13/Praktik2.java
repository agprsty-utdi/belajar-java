package semester3.struktur_data.praktikum_struktur_data.pertemuan13;

class simpul
{ 
    String elemen;
    simpul kiri;
    simpul kanan;
}

public class Praktik2 {
    public static simpul akar;
    
    public static void deklarasiPohon() { 
        akar = null;
    }

    public static simpul tambahSimpul(simpul Penunjuk, String ELEMEN) { 
        if (Penunjuk == null) { 
            simpul baru = new simpul();
            baru.elemen = ELEMEN;
            baru.kiri = null;
            baru.kanan = null;
            Penunjuk = baru;
            return(Penunjuk);
        } else { 
            if (ELEMEN.compareTo(Penunjuk.elemen) < 0 ) { 
                Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
                return(Penunjuk);
            } else { 
                Penunjuk.kanan= tambahSimpul(Penunjuk.kanan, ELEMEN);
                return(Penunjuk);
            }
        }
    }

    public static void preOrder(simpul Penunjuk){ 
        if(Penunjuk != null) { 
            System.out.print(Penunjuk.elemen + ",");
        preOrder(Penunjuk.kiri);
        preOrder(Penunjuk.kanan);
        }
    }

    public static void inOrder(simpul Penunjuk) { 
        if(Penunjuk != null) { 
            inOrder(Penunjuk.kiri);
            System.out.print(Penunjuk.elemen + ",");
            inOrder(Penunjuk.kanan);
        }
    }

    public static void postOrder(simpul Penunjuk) { 
        if(Penunjuk != null) { 
            postOrder(Penunjuk.kiri);
            postOrder(Penunjuk.kanan);
            System.out.print(Penunjuk.elemen + ",");
        }
    }

    public static void main(String[] args) {
        deklarasiPohon();
        akar = tambahSimpul(akar, "8");
        akar = tambahSimpul(akar, "5");
        akar = tambahSimpul(akar, "4");
        akar = tambahSimpul(akar, "9");
        akar = tambahSimpul(akar, "10");
        akar = tambahSimpul(akar, "15");
        akar = tambahSimpul(akar, "11");
        akar = tambahSimpul(akar, "2");
        akar = tambahSimpul(akar, "7");
        akar = tambahSimpul(akar, "1");
        akar = tambahSimpul(akar, "3");
        akar = tambahSimpul(akar, "12");
        akar = tambahSimpul(akar, "19");
        akar = tambahSimpul(akar, "16");
        akar = tambahSimpul(akar, "14");
        akar = tambahSimpul(akar, "6");
        System.out.println("Tugas:");
        System.out.println("");

        // Print with preOrder = print|kiri|kanan
        System.out.println("Perintah untuk mencetak pohon biner secara preOrder:");
        preOrder(akar);
        System.out.println("");

        // Print with inOrder = kiri|print|kanan
        System.out.println("Perintah untuk mencetak pohon biner secara inOrder:");
        inOrder(akar);
        System.out.println("");

        // Print with portOrder = kiri|kanan|print
        System.out.println("Perintah untuk mencetak pohon biner secara postOrder:");
        postOrder(akar);
        System.out.println("");
    }
}
