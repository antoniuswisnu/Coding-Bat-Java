package WarmUp1;

public class FrontThree {

    public static String front3(String str) {
        return str.substring(0,3).repeat(3);

//        String front;
//
//        if (str.length() >= 3) {
//            front = str.substring(0, 3);
//        }
//        else {
//            front = str;
//        }
//
//        return front + front + front;
    }

    public static void main(String[] args) {
        System.out.println(front3("Java"));
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }
}
