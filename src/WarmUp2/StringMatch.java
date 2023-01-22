package WarmUp2;

public class StringMatch {
    public static int stringMatch(String a, String b) {
        int hasil = 0;
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len-1; i++){
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))){
                hasil++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        int[] a = {9, 2, 9};
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }
}
