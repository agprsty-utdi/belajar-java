package praktikum.pertemuan9;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    double ipk;

    public void setMhs(
        String nim, 
        String nama, 
        String prodi,
        double ipk
    ){
        this.nim=nim;
        this.nama=nama;
        this.prodi=prodi;
        this.ipk=ipk;
    }

    public void tampil()
    {
        System.out.println("Judul buku :"+nim);
        System.out.println("Harga buku : "+nama);
        System.out.println("Jumlah halaman : "+prodi);
        System.out.println("Jumlah IPK : "+ipk);
    }

    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setMhs("145410012"  ,"Nisa","Informatika", 3.5);
        mhs.tampil();
    }

}
