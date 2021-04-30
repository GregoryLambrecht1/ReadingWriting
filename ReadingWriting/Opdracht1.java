package reading_writing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Opdracht1 {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("C:\\Users\\Gregory\\Documents\\readingwriting\\hello.txt");

            Files.createFile(path);

            List<String>text = new ArrayList<>();
            text.add("hello");
            text.add("beautiful");
            text.add("people");
            Files.write(path,text);

            DosFileAttributes attributes = Files.readAttributes(path,DosFileAttributes.class);
            System.out.println(attributes.size());
            System.out.println(attributes.creationTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.lastModifiedTime());

            System.out.println(Files.readAllLines(path));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
