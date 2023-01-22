package WarmUp2;

public class ArrayFront9 {

    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (i < 4){
                if (nums[i] == 9){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(a));
    }
}
