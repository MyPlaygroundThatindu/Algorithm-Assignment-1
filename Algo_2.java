public class Algo_2 {
    public static void main(String[] args) {
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        int max = nums[0];
        int min = nums[0];

        for(int i=0; i<nums.length; i++){
            
            if(nums[i]>max) max = nums[i];
            
            if(nums[i]<min) min = nums[i];
        }

        System.out.println("Max :" + max + ", Min :" +  min);

    }
}
