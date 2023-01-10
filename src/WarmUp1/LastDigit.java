package WarmUp1;

public class LastDigit {
    public static boolean lastDigit(int a, int b) {
        if (a >= 10 && b >= 10){
            boolean hasil = a % 10 == b % 10;
            return hasil;
        } else if (a <= 10 && b >= 10){
            boolean hasil = a == b % 10;
            return hasil;
        } else if (a >= 10 && b <= 10){
            boolean hasil = a % 10 == b ;
            return hasil;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(7, 17));
    }
}
