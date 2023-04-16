package Array1;

public class has23 {
    public static boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(has23(a));
    }

}
