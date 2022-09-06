package praktikum.pertemuan8;

public class nilaiMaxMin {
    public static void main(String[] args) {
        int[] nilai = {90, 80};
        cari_max_min(nilai);
    }

    public static void cari_max_min(int[] nilai) {
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai Max : " + max);
        System.out.println("Nilai Min : " + min);
    }
}
