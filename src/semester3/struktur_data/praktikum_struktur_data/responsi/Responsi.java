package semester3.struktur_data.praktikum_struktur_data.responsi;
import java.util.*;

public class Responsi {
    public static int hitungSubtotal(int jumlah, int harga)
    {
        return jumlah*harga;
    }

    public static void ngentriDataSubtotal(Object data[][])
    {
        LinkedList Subtotal = new LinkedList();
        System.out.println();
        System.out.println("Menmbahkan subtotal:");
        System.out.println("NamaBarang\t Jumlah\t HargaEceran\t SubTotal");
        for (int i=0;i<data.length;i++){
            Subtotal.add(hitungSubtotal((int) data[i][1], (int) data[i][2]));
            System.out.print(data[i][0]+" \t"+data[i][1]+" \t"+data[i][2]+" \t"+Subtotal.get(i));
            System.out.println();
        }

        System.out.println();
        System.out.println();

        System.out.println("Menampilkan data yang subTotalnya Rp.15.000,- keatas:");
        System.out.println("NamaBarang\t Jumlah\t HargaEceran\t SubTotal");
        for (int i=0;i<data.length;i++){
            if ((int) Subtotal.get(i) > 15000) {
                System.out.println(data[i][0]+" \t"+data[i][1]+" \t"+data[i][2]+" \t"+Subtotal.get(i));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Deklarasi Data
        Object[][]data = {
            {"Amplop Folio Coklat", 3, 1000},
            {"Ballpoint 4 warna", 3, 2500},
            {"Ballpoint Faster C-600", 4, 2500},
            {"Batu baterai - A2- Alkaline", 7, 10600},
            {"Binder Clip – 107", 1, 2500},
            {"Buku Tulis isi 42 Big Boss", 3, 3000},
            {"CD-R Blank – BenQ", 7, 2000}, 
            {"Cutter Besar L-500", 1, 115000}, 
            {"Cutter Kecil K-200", 3, 37000}
        };
        
        ngentriDataSubtotal(data);
    }
}
