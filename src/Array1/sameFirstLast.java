package Array1;

public class sameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length-1]){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(sameFirstLast(a));
    }

}
