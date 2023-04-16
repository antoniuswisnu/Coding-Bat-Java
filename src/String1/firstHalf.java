package String1;

public class firstHalf {
    public static String firstHalf(String str) {
        String half = String.valueOf(str.length() / 2);
        return str.substring(0, Integer.parseInt(half));
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
    }

}
