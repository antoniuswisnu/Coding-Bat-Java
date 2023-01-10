package WarmUp1;

public class EndUp {
    public static String endUp(String str) {
        if (str.length() < 3){
            return str.toUpperCase();
        } else {
            String end = str.substring(str.length() - 3, str.length()).toUpperCase();
            return str.substring(0, str.length() - 3) + end;
        }

    }

    public static void main(String[] args) {
        System.out.println(endUp("hi there"));
    }
}
