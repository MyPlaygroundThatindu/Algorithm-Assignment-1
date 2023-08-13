public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int[] copy = new int[5];

        for(int i=0; i<nums.length; i++){
            copy[i] = nums[nums.length-(i+1)];
        }

        nums = copy;

        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println("\b ");
    }
}
