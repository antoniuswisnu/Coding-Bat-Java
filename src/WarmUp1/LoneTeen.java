package WarmUp1;

public class LoneTeen {
    public static boolean loneTeen(int a, int b) {
        if (13 <= a && a <= 19 && 13 <= b && b <= 19){
            return false;
        } else if (13 <= a && a <= 19 || 13 <= b && b <= 19){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
    }

}
