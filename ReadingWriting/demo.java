package reading_writing;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.DosFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {

            Path path = Paths.get("C:\\Users\\Gregory\\Documents\\readingwriting\\text.txt");

        try {
            Files.createDirectories(path.getParent());
            if (Files.notExists(path)){
                Files.createFile(path);
                System.out.println("file created");
            }else {
                System.out.println("file already exists");
            }
            List<String> lines = new ArrayList<>();
            lines.add("hello");
            lines.add("world");

            Files.write(path,lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);

            DosFileAttributes attrs = Files.readAttributes(path,DosFileAttributes.class);

            System.out.println(attrs.size());
            System.out.println(attrs.creationTime());
            System.out.println(attrs.lastAccessTime());
            System.out.println(attrs.lastModifiedTime());
            System.out.println(attrs.isArchive());
            System.out.println(attrs.isHidden());
            System.out.println(attrs.isReadOnly());

            Files.lines(path).forEach(System.out::println);

            Path path2 = Paths.get("C:\\Users\\Gregory\\Documents\\readingwriting\\copytext.txt");
            Files.copy(path,path2, StandardCopyOption.REPLACE_EXISTING);

            Files.deleteIfExists(path);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}


