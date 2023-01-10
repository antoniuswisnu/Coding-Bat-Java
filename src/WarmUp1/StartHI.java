package WarmUp1;

public class StartHI {
    public static boolean startHi(String str) {
        if(str.length() < 2){
            return false;
        } else if (str.substring(0,2).equals("hi")){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println(startHi("h"));
    }
}
