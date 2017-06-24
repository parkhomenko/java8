package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesWalking {

    public static void main(String[] args) throws IOException {
        Files.walk(Paths.get("e:", "a"), 0)
                .forEach(System.out::println);
    }
}
