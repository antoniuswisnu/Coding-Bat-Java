package WarmUp2;

public class NoTriples {
    public static boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length-2; i++){
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] a = {1, 1, 2, 2, 1};
        System.out.println(noTriples(a));
    }

}
