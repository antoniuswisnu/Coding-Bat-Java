package WarmUp2;

public class StringX {
    public static String stringX(String str) {
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (i == 0 && str.charAt(0) == 'x') {
                hasil.append(str.charAt(i));
            } else if (i == str.length()-1 && str.charAt(str.length()-1) == 'x'){
                hasil.append(str.charAt(i));
            }else if (str.charAt(i) == 'x'){
                continue;
            }  else {
                hasil.append(str.charAt(i));
            }
        }
        return hasil.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix") );
    }

}
