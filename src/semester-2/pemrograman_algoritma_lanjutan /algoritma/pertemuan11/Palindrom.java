package algoritma.pertemuan11;

public class Palindrom {
    public static void main(String[] args) {
        String kalimat = "katak";
        boolean result = palindrom(kalimat);
        System.out.println(kalimat);
        System.out.println(result);
    }

    public static boolean palindrom(String kalimat) {
        if (kalimat.length() == 1) {
            return true;
        } else {
            if (kalimat.charAt(0) == kalimat.charAt(kalimat.length() - 1)) {
                return palindrom(kalimat.substring(1, kalimat.length() - 1));
            } else {
                return false;
            }
        }
    }
}
