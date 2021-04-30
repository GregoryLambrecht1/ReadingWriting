package reading_writing;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Opdracht2 {
    public static void main(String[] args) {
        System.out.println("Working Directory = " +System.getProperty("user.dir"));
        final String home = System.getProperty("user.dir");
        if (Files.notExists(Paths.get(home ,"data"))) {
            try {
                Files.createDirectory(Paths.get(home ,"data"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        final String output = Paths.get(home ,"data", "output.txt").toString();

        try (FileWriter fileWriter = new FileWriter(output)){

            fileWriter.write("hello");
            fileWriter.write("people");
            fileWriter.write("blabla");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //
    }
}
