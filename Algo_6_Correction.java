import java.util.Arrays;
import java.util.Scanner;

public class Algo_6_Correction {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            System.out.println("Enter a text: ");
            String input = scanner.nextLine();
            char[] chars = scanner.nextLine().strip().toCharArray();
            if(chars.length == 0){
                System.out.println("Text can't be empty");
                continue;
            }
            int wordCount = 1;

            for(int i=0; i< chars.length; i++){
                if(chars[i]>128){
                    System.out.println("Only ASCII charachters are supported");
                    continue loop;
                }
                if(chars[i] == ' '){
                    wordCount++;
                }
            }
            String[] words = new String[wordCount];
            int k=0;
            for(int i=0; i<words.length; i++){
                if(Character.isSpaceChar(chars[i])){
                    String word = input.substring(k, i);
                    k = i+1;
                    words[--wordCount] = word;
                    System.out.println(word);
                }
                String word = input.substring(k);
                words[0] = word;

                System.out.println(Arrays.toString(words));
                System.out.println(String.join(" ",words));
            }
        }while (true);           
            
    }
}
