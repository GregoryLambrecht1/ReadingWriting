package reading_writing;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Opdracht3 {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("C:\\Users\\Gregory\\Documents\\readingwriting\\hello.txt")){

            int character;
            while ((character = fileReader.read())!= -1){
                System.out.println((char) character);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
