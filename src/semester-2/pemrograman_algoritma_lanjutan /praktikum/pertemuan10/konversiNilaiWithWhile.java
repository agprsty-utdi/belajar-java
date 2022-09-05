package praktikum.pertemuan10;
import java.util.Scanner;
public class konversiNilaiWithWhile {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double[] data = new double[10];
            char [] keluar = new char[10];
            int i=0;
            while (i<10){
                System.out.print("data ke-"+(i+1)+":");
                data[i] = scan.nextDouble();
                i++; 
            }
      System.out.println("=====================");
      System.out.println("|   Hasil Konversi  |");
      System.out.println("=====================");
      keluar = konversiNilaii(data);
            //tampil hasil
            int p = 0;
            while (p<10){
                System.out.println(data[p]+"  "+keluar[p]);
                p++;
            }
        }
    }

    public static char[] konversiNilaii(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;
        while (i<n) {
            if ((x[i] > 80) && (x[i] <= 100)) {
                hasil[i] = 'A';
            } else if ((x[i] > 60) && (x[i] <= 80)) {
                hasil[i] = 'B';
            } else if ((x[i] > 40) && (x[i] <= 60)) {
                hasil[i] = 'C';
            } else if ((x[i] > 20) && (x[i] <= 40)) {
                hasil[i] = 'D';
            } else if (x[i] <= 20) {
                hasil[i] = 'E';
            }
            i++;
        }
        return hasil;
    }
}
