package WarmUp2;

public class FrontTimes {

    public static String frontTimes(String str, int n) {
        String hasil = "";
        if (str.length() < 3){
            for (int i = 0 ; i < n; i++){
                hasil += str;
            }
        } else {
            for (int i = 0 ; i < n; i++){
                hasil += str.substring(0,3);
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
    }

}
