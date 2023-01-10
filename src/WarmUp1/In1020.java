package WarmUp1;

public class In1020 {
    public static boolean in1020(int a, int b) {
        if (10 <= a && a <= 20 || 10 <= b && b <= 20){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
    }
}
