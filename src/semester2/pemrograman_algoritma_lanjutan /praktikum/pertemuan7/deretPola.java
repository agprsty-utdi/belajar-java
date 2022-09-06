package praktikum.pertemuan7;

public class deretPola {
    public static void main(String[] args) {
        int ulang = 4;
        int jSuku=0;
        int tSuku=0;
        for(int suku=1;suku<=ulang;suku++){
            jSuku++;
            tSuku+=suku;
            System.out.print(suku+",");
            if (jSuku==2){
                System.out.print(tSuku+",");
                jSuku=0;
                tSuku=0;
            }
        }
        System.out.println();
    }
}
