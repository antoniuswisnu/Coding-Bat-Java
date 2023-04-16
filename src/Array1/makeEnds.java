package Array1;

public class makeEnds {
    public static int[] makeEnds(int[] nums) {
        int[] hasil = {nums[0], nums[nums.length-1]};
        return hasil;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(makeEnds(a));
    }

}
