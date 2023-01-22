package WarmUp2;

public class StringYak {
    public static String stringYak(String str) {
        String hasil = "";
        for (int i = 0; i < str.length(); i++){
            if (i+2<str.length() && str.charAt(i) == 'y' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'k' ){
                i = i + 2;
            } else {
                hasil += str.charAt(i);
            }

        }
        return hasil;
    }
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
    }
}
