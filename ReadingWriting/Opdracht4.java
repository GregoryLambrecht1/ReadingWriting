package reading_writing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Opdracht4 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Gregory\\Documents\\readingwriting\\hello.txt"))){

           String line;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
