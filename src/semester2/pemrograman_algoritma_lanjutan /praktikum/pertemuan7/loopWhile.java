package praktikum.pertemuan7;

public class loopWhile {
    public static void main(String[] args) {
        int i=1;
        while (i<=10) {
            if(i%2==0)
                System.out.println("Bilangan Genap adalah "+i);
            else
            {
                if(i%3!=0)
                    System.out.println("Bilangan Ganjil adalah "+i);
            }
            i++;
        }
    }
}
