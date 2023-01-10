package WarmUp1;

public class SumDouble {

    public static int sumDouble(int a, int b) {
        if (a == b){
            return (a+b) * 2;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumDouble(3, 2) );
    }
}
