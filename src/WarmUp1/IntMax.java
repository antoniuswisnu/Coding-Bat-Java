package WarmUp1;

public class IntMax {
    public static int intMax(int a, int b, int c) {
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
    }
}
