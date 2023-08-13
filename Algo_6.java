import java.util.Scanner;

public class Algo_6 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String sentence = "";
        String[] words = new String[sentence.split(" ").length];        

        do{
            System.out.print("Please enter a sentence :");
            sentence = scanner.nextLine();

            words = sentence.split(" ");

            if(words.length <= 1) System.out.println("Please enter a valid sentence");
            else{
                for(int i=0; i<words.length/2; i++){
                    String temp = words[i];
                    words[i] = words[words.length -(i+1)];
                    words[words.length-(i+1)] = temp;
                }        

            }

        } while (words.length <= 1);

        //Print the reverese sentence
        for(int i=0; i<words.length;i++){
            System.out.print(words[i] + " ");
        }
        System.out.println("\b ");
    }
}
