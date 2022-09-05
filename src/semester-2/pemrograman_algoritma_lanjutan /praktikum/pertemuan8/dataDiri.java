package praktikum.pertemuan8;

public class dataDiri {
    public static void main(String[] args) {
        dataMhs(
            "145410012", 
            "Nisa", 
            "Perempuan", 
            21,
            "Pogung"
        );
    }

    public static void dataMhs(
        String nim, 
        String nama, 
        String gender, 
        int umur,
        String alamat
    ) {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Umur : " + umur);
        System.out.println("Alamat : " + alamat);
    }
}
