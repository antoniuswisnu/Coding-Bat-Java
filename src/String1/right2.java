package String1;

public class right2 {
    public static String right2(String str) {
        if (str.length() < 2){
            return str;
        }
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }

    public static void main(String[] args) {
        System.out.println(right2("Hello"));
    }


}
