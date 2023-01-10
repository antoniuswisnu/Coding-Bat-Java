package WarmUp1;

public class DelDel {

    public static String delDel(String str) {
        if(str.length() < 4){
            return str;
        } else if (str.substring(1,4).equals("del")){
            return str.replace("del","");
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adelHello"));
    }
}
