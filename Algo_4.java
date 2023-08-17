import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for(int i=0; i<nums.length/2; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-(i+1)]; 
            nums[nums.length-(i+1)] = temp;   
        }

        // //Print the reverese array
        // for(int i=0; i<nums.length;i++){
        //     System.out.print(nums[i] + ",");
        // }
        // System.out.println("\b ");

        System.out.println(Arrays.toString(nums));
    }
}
