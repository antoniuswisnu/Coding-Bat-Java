package String1;

public class theEnd {
    public static String theEnd(String str, boolean front) {
        if (front == true){
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
    }

}
