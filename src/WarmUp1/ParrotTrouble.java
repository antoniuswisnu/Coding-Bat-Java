package WarmUp1;

public class ParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7 || talking && hour > 20){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 7));
    }

}
