package String1;

public class extraEnd {
    public static String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
    }

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }
}
