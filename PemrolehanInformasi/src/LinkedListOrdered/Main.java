package LinkedListOrdered;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InvertedIndex invertex = new InvertedIndex();
        String [] query;
        //baca file 
        String path = "..\\Koleksi";
        Scanner input;
        
        File name = new File(path);
        if (name.exists()) {
            if (name.isDirectory()) {
                String directory[] = name.list();
                System.out.println("\n\nDirectory yang sudah dibaca : \n");
                
                for (String directoryName : directory) {
                    System.out.printf("%s\n", directoryName);
                    
                    try {
                        input = new Scanner (new File(name.getAbsolutePath()+"\\"+directoryName));
                        
                        try {
                            while (input.hasNext()) {
                                String sentence = input.nextLine();
                                String[] tokens = sentence.split(" ");
                                for (String token : tokens) {
                                    if (token.isEmpty()) {
                                        continue;
                                    }else{
                                        //System.out.println(directoryName + " " + token);
                                        invertex.add(token, directoryName);
                                    }
                                }
                            }//end while
                        } catch (NoSuchElementException elementException) {
                            System.out.println("File improperly formed.");
                            input.close();
                            System.exit(1);
                        }//end catch
                    } catch (FileNotFoundException fileNotFoundException) {
                        System.out.println("Error opening file.");
                        System.exit(1);
                    }
                    System.out.println("");
                }
            }else{
                System.out.println("Tidak nemu");
            }
        }else{
            System.out.printf("%s %s", path, "does not exist");
        }
        
        input = new Scanner(System.in);

       
        query = new String [1];
        for (int i = 0; i < 1; i++) {
            System.out.print("Input Kata Yang Ingin Di Cari : ");
            String data = input.next();
            query[i] = data;
        }
        
        System.out.println("\nHasil Pencarian : ");
        for (int i = 0; i < query.length; i++) {
            invertex.search(query[i]);
        }
    }
    
}
