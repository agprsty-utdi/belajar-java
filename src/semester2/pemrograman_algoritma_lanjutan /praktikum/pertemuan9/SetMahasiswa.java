package praktikum.pertemuan9;

public class SetMahasiswa {
    String nim;
    String nama;
    Integer sks;
    double ipk;

    public void setMhs(
        String nim, 
        String nama, 
        Integer sks,
        double ipk
    ){
        this.nim=nim;
        this.nama=nama;
        this.sks=sks;
        this.ipk=ipk;
    }

    public void tampil()
    {
        System.out.println("NIM : "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("SKS : "+sks);
        System.out.println("IPK : "+ipk);
    }
}
