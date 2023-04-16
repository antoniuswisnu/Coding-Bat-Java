package String1;

public class comboString {
    public static String comboString(String a, String b) {
        String hasil = "";
        if (a.length() < b.length()){
            String pendek = a;
            String panjang = b;
            hasil = pendek + panjang + pendek;
        } else {
            String pendek = b;
            String panjang = a;
            hasil = pendek + panjang + pendek;
        }
        return hasil;

    }

    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
    }
}
