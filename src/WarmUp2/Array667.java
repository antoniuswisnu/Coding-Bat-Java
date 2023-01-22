package WarmUp2;

public class Array667 {
    public static int array667(int[] nums) {
        int hasil = 0;
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i] == 6 && nums[i+1] == 6 || nums[i] == 6 && nums[i+1] == 7){
                hasil++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        int[] a = {6,6,2};
        System.out.println(array667(a));
    }

}
