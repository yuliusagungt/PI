package PemrolehanInformasi;

import java.util.Scanner;

public class TokenTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence and press Enter : ");
        String sentence = scanner.nextLine();
        
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of Elements : %d\n", tokens.length);
        
        System.out.print("The tokens are: ");
        for(String token : tokens)
            System.out.print(token + " - ");
    }
}
