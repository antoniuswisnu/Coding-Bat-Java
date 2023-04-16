package Array1;

public class commonEnd {
    public static boolean commonEnd(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1 && a[0] == b[0] || a[a.length-1] == b[b.length-1] ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {7,3};
        System.out.println(commonEnd(a,b));
    }

}
