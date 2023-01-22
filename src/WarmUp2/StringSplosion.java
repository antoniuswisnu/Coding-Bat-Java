package WarmUp2;

public class StringSplosion {

    public static String stringSplosion(String str) {
        String hasil = "";
        for (int i = 1; i < str.length()+1; i++){
            hasil += str.substring(0,i);
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
    }
}
