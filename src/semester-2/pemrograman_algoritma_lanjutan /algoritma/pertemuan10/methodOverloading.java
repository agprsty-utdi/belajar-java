package algoritma.pertemuan10;

public class methodOverloading {
    public double kuadrat(double b){
		System.out.println("Di method bertipe double");
		return (b * b);
	}

	public int kuadrat(int b){
		System.out.println("Di method bertipe integer");
		return (b * b);
	}

	public static void main(String args[]){
		methodOverloading obyek = new methodOverloading();
        System.out.println("Panggil method kuadrat dengan parameter 5.5");
        System.out.println(obyek.kuadrat(5.5));
        System.out.println("Panggil method kuadrat dengan parameter 5");
		System.out.println(obyek.kuadrat(5));
	}

}
