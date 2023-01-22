package WarmUp2;

public class ArrayCount9 {
    public static int arrayCount9(int[] nums) {
        int hasil = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9){
                hasil += 1;
            }
        }
        return hasil;
    }

    public static void main(String[] args) {
        int[] a = {9, 2, 9};
        System.out.println(arrayCount9(a));
    }

}
