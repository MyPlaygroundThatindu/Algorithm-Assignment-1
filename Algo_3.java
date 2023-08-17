import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        int[] copy = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            copy[i] = nums[nums.length-(i+1)];
        }

        nums = copy;    //Once this line is excecuted we can not access original nums array. Since we do not have its memory location any more

        // //Print the reverse array
        // for(int i=0; i<nums.length;i++){
        //     System.out.print(nums[i] + ",");
        // }
        // System.out.println("\b ");

        //Arrays.toString(arryName) can be used to perform the above printing task
        System.out.println(Arrays.toString(nums));
    }
}
