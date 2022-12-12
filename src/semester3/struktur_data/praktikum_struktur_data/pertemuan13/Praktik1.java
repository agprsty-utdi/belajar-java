package semester3.struktur_data.praktikum_struktur_data.pertemuan13;

class simpul
{ 
    String elemen;
    simpul kiri;
    simpul kanan;
}

public class Praktik1 {
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
        akar = tambahSimpul(akar,"M");
        akar = tambahSimpul(akar,"P");
        akar = tambahSimpul(akar,"D");
        akar = tambahSimpul(akar,"A");
        akar = tambahSimpul(akar,"S");
        akar = tambahSimpul(akar,"K");
        akar = tambahSimpul(akar,"N");
        akar = tambahSimpul(akar,"G");
        akar = tambahSimpul(akar,"O");
        akar = tambahSimpul(akar,"L");
        akar = tambahSimpul(akar,"W");
        akar = tambahSimpul(akar,"F");
        akar = tambahSimpul(akar,"J");
        akar = tambahSimpul(akar,"T");
        akar = tambahSimpul(akar,"H");
        akar = tambahSimpul(akar,"U");
        System.out.println("Praktik:");
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
