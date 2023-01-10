package WarmUp1;

public class StartOz {
    public static String startOz(String str) {
        if (str.length() < 3){
            return str;
        }
        else if (str.substring(0,2).equals("oz")) {
            return "oz";
        } else if (str.charAt(0) == 'o'){
            return "o";
        } else if (str.charAt(1) == 'z') {
            return "z";
        }
        return "";
    }

    // not perfect

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
    }
}
