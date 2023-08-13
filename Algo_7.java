import java.util.Scanner;

public class Algo_7 {
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

                String longest = words[0];
                String shortest = words[0];

                for(int i=0; i<words.length; i++){
                    
                    if(words[i].length()>longest.length()) longest = words[i];
                    
                    if(words[i].length()<shortest.length()) shortest = words[i];
                }

                System.out.println("Longest word is " + longest + " with " + longest.length() + " letters\n"
                 + "Shortes word is " + shortest + " with " + shortest.length() + " letters");       

            }

        } while (words.length <= 1);

    }
}
