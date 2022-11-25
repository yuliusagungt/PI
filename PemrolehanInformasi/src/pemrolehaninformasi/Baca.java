package PemrolehanInformasi;

import LinkedListOrdered.LinkedListOrdered;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Baca {

    public static void main(String[] args) {

        String path = "..\\Koleksi";
        Scanner input;
        Scanner scanner = new Scanner(System.in);
        LinkedListOrdered<String> linked = new LinkedListOrdered();
        System.out.print("Masukan 1 Kata yang dicari : ");
        String kata = scanner.nextLine();
        int i = 0;
        String[] tokens = kata.split(" ");
        while (i < tokens.length) {
            System.out.println(tokens[i]);
            i++;
        }
        File name = new File(path);

        if (name.exists()) {
            if (name.isDirectory()) {
                String directory[] = name.list();
                System.out.println("\nDirectory contents:\n");

                for (String directoryName : directory) {
                    System.out.printf("");
                    try {
                        input = new Scanner(new File(name.getAbsolutePath() + "\\" + directoryName));
                        try {
                            while (input.hasNext()) {
                                for (String token : tokens) {
                                    if (token.equalsIgnoreCase(kata)) {
                                        System.out.println(token + " ditemukan di " + directoryName);
                                    }
                                }
                            }
                        } catch (NoSuchElementException elementException) {
                            System.out.println("File improperly formed.");
                            input.close();
                            System.exit(1);
                        } catch (IllegalStateException stateException) {
                            System.out.println("Error reading from file");
                            System.exit(1);
                        }
                    } catch (FileNotFoundException fileNotFoundException) {
                        System.out.println("");
                        System.exit(1);
                    }
                }
            } else {
                System.out.println("Salah Masuk");
            }
        } else {
            System.out.printf("%s %s", path, "does not exsist");
        }
    }
}
