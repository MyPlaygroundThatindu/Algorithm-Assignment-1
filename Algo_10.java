import java.util.Scanner;

public class Algo_10 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your phone number : ");
        String number = scanner.nextLine();

        char[] charArray = number.toCharArray();

        for(int i=0; i<number.length(); i++){
            number.charAt(i);           
        }
    }
}
