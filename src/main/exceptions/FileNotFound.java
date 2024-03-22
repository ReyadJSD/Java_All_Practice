package main.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("reyad.txt");
            fileReader.read();
            fileReader.close();
        }catch (Exception e){
            System.out.println(e);

        }
    }
}
