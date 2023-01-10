package WarmUp1;

public class BackAround {

    public static String backAround(String str) {
        String back;
        back = String.valueOf(str.charAt(str.length() - 1));

        return back + str + back;
    }

    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }
}
