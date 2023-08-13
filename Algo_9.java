import java.util.Scanner;

public class Algo_9 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String word = "";
        char[] charArray = new char[word.length()];

        do{
            System.out.print("Please enter a word :");
            word = scanner.nextLine();

            if(word.isBlank() || word.split(" ").length > 1) System.out.println("Please enter a valid single word");
            else{
                charArray = word.toLowerCase().toCharArray();
                for(int i=0; i<charArray.length/2; i++){
                    char temp = charArray[i];
                    charArray[i] = charArray[charArray.length -(i+1)];
                    charArray[charArray.length-(i+1)] =temp;
                }

                if(String.valueOf(charArray).equalsIgnoreCase(word)) System.out.println("Word is a palindrome");
                else System.out.println("Word is not a palindrome");

            }
            

        } while (word.isBlank() || word.split(" ").length > 1);
    }
}
