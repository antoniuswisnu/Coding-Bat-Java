package WarmUp1;

public class HasTeen {

    public static boolean hasTeen(int a, int b, int c) {
        if (13 <= a && a <= 19 || 13 <= b && b <= 19 || 13 <= c && c <= 19){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
    }
}
