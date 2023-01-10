package WarmUp1;

public class Front22 {

    public static String front22(String str) {


        if (str.length() < 2){
            return str;
        } else {
            String front;
            front = String.valueOf(str.substring(0,2));
            return front + str + front;
        }
    }

    public static void main(String[] args) {
        System.out.println(front22("a"));
    }
}
