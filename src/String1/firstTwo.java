package String1;

public class firstTwo {
    public static String firstTwo(String str) {
        if (str.length() < 2){
            return str;
        } else {
            return str.substring(0,3);
        }

    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }

}
