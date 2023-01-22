package WarmUp2;

public class StringBits {
    public static String stringBits(String str) {
        String hasil = "";
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                hasil += str.charAt(i);
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
    }

}
