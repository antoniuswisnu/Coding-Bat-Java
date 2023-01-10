package WarmUp1;

public class PosNeg {

    public static boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b > 0 || b < 0 && a > 0 || a < 0 && b < 0 && negative){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String args[]){
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true) );
    }

}
