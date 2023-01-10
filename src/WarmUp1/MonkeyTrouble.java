package WarmUp1;

public class MonkeyTrouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
    }

}
