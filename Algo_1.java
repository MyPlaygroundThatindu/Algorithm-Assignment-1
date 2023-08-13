import java.util.Scanner;

public class Algo_1{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num = 0;
        int[] fabSeq = {};

        do{
            System.out.print("Input a positive integer : ");
            num = scanner.nextInt();
            scanner.nextLine();

            if(num <= 0) System.out.println("Please enter a positive integer");
            else {
                fabSeq = new int[num];
                fabSeq[0] = 0;
                fabSeq[1] = 1;
                for(int i=2; i<num; i++){
                    fabSeq[i] = fabSeq[i-1] + fabSeq[i-2];
                }
            }

        } while (num <= 0);

        //Print the fibonacci sequance
        for(int i=0; i<fabSeq.length;i++){
            System.out.print(fabSeq[i] + ",");
        }
        System.out.println("\b ");
        
    }
}