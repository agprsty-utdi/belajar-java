package praktikum.pertemuan9;

public class JavaStringsMethod {
    public static void main(String[] args) {
        // menggunakan is empty
        String stringkosong = "";

        if (stringkosong.isEmpty()) {
            System.out.println("String is empty");
        }

        // menggunakan length
        String string = "Hello World";
        System.out.println("Length of string is: " + string.length());

        // menggunakan charAt
        System.out.println("First character of string is: " + string.charAt(0));

        // menggunakan substring
        System.out.println("Substring of string is: " + string.substring(0, 5));

        // menggunakan toUpperCase
        System.out.println("String in upper case is: " + string.toUpperCase());
    }
}
