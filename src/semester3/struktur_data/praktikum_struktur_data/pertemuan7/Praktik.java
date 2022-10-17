package semester3.struktur_data.praktikum_struktur_data.pertemuan7;

class tipePointer{ 
    int angka;
    String teks;
}

class belajarPointer{ 
    public static void main(String[] args){
        tipePointer P;
        P = null;
        if (P == null)
            System.out.println("Pointer P menunjuk ke Null");
        else
            System.out.println("Pointer P mengarah ke tempat lain");
    }
}