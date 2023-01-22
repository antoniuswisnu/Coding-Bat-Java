package WarmUp2;

public class StringTimes {

    public static String stringTimes(String str, int n) {
        String hasil = "";
        for(int i=0; i<n; i++){
            hasil += str;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
    }
}
