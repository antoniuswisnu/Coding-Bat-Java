package String1;

public class makeOutWord {
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

}
