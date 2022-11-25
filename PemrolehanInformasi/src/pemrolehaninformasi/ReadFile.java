package PemrolehanInformasi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
        String path = "..\\Koleksi";
        Scanner input;

        File name = new File(path);

        if (name.exists()) {
            if (name.isDirectory()) {
                String directory[] = name.list();
                System.out.println("\n\nDirectory contents:\n");

                for (String directoryName : directory) {
                    System.out.printf("%s\n", directoryName);
                    try {
                        input = new Scanner(new File(name.getAbsolutePath() + "\\" + directoryName));
                        try {
                            while (input.hasNext()) {
                                System.out.println(input.nextLine());
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
