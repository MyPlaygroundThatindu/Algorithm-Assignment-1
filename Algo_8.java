public class Algo_8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        int[] intersection = new int[7];
        int[] union =  new int[14];
        int[] complA = new int[50];
        int[] complB = new int[50];
        int x = 0;
        int a = 0;
        int b = 0;

        for(int i=0; i<numA.length; i++){
            for(int j=0; j<numB.length; j++){
                if(numA[i] == numB[j]){
                    intersection[x++] = numB[j];                     
                } 
            }
        }

        //Print the reverese array
        for(int i=0; i<complA.length;i++){
            System.out.print(complA[i] + ",");
        }
        System.out.println("\b ");


    }
}
