package WarmUp2;

public class DoubleX {
    static boolean doubleX(String str) {
        Boolean hasil = false;
        for (int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i+1) != 'x' ){
                hasil = false;
                break;
            } else if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x' ){
                hasil = true;
                break;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(doubleX("xaxxx"));
    }

}
