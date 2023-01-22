package WarmUp2;

public class CountXX {
    static int countXX(String str) {
        int hasil = 0;
        for(int i=0; i<str.length(); i++){
            if (i == str.length()-1){
                break;
            } else if (str.substring(i, i+2).equals("xx")){
                hasil += 1;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(countXX("xxxx"));
    }


}
