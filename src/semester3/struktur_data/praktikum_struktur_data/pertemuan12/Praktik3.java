package semester3.struktur_data.praktikum_struktur_data.pertemuan12;
import java.util.LinkedList;

public class Praktik3 {
    static LinkedList daftarMhs = new LinkedList();
    
    public static void PercobaanLinkedList() {
        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");
        daftarMhs.add("Cucuk");
        daftarMhs.add("Dion");
        daftarMhs.add("Ending");
        daftarMhs.add("Fifin");
        daftarMhs.add("Gesit");
        daftarMhs.add("Heru");
        daftarMhs.add("Irma");
        daftarMhs.add("Janti");
        System.out.println(daftarMhs.get(0));
        System.out.println(daftarMhs.get(1));
        System.out.println(daftarMhs.get(2));
        System.out.println(daftarMhs.get(3));
        System.out.println(daftarMhs.get(4));
        System.out.println(daftarMhs.get(5));
        System.out.println(daftarMhs.get(6));
        System.out.println(daftarMhs.get(7));
        System.out.println(daftarMhs.get(8));
        System.out.println(daftarMhs.get(9));
        System.out.println("");
    }

    public static void main(String args[]) {
        PercobaanLinkedList();
    }
}
