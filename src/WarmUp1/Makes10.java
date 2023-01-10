package WarmUp1;

public class Makes10 {
    public static boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(makes10(9, 10) );
    }
}
