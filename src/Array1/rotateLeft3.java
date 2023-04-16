package Array1;

public class rotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {
        int[] hasil = {nums[1], nums[2], nums[0]};
        return hasil;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(rotateLeft3(a));
    }
}
