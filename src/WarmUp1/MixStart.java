package WarmUp1;

public class MixStart {
    public static boolean mixStart(String str) {
        if (str.length() < 3){
            return false;
        } else if (str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }

}
