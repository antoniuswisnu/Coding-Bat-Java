package String1;

public class left2 {
    public static String left2(String str) {
        return str.substring(2) + str.substring(0,2);
    }

    public static void main(String[] args) {
        System.out.println(left2("Hello"));
    }
}
