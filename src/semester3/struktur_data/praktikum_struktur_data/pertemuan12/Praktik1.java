package semester3.struktur_data.praktikum_struktur_data.pertemuan12;
import java.util.LinkedList;

public class Praktik1 {
    static LinkedList daftarMhs = new LinkedList();
    
    public static void PercobaanLinkedList() {
        if (daftarMhs.isEmpty()==true) { 
            System.out.println("Linkedlist kosong");
        } else { 
            System.out.println("Linkedlist isi");
        }
    }

    public static void main(String args[]) {
        PercobaanLinkedList();
    }
}
