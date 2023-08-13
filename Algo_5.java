import java.util.Scanner;

public class Algo_5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String word = "";
        char[] charArray = new char[word.length()];

        do{
            System.out.print("Please enter a word :");
            word = scanner.nextLine();

            if(word.isBlank()) System.out.println("Please enter a valid word");
            else{
                charArray = word.toLowerCase().toCharArray();
                for(int i=0; i<charArray.length/2; i++){
                    char temp = charArray[i];
                    charArray[i] = charArray[charArray.length -(i+1)];
                    charArray[charArray.length-(i+1)] =temp;
                }        

            }
            System.out.println(charArray);

        } while (word.isBlank());
    }
}
