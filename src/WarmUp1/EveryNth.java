package WarmUp1;

public class EveryNth {

    public static String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("Chocolates", 100));
    }
}
