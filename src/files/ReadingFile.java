package files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingFile {

    public static void main(String[] args) throws IOException {
        //Stream<Path> paths = Files.find(Paths.get("e:", "a"), 2, );
        //Stream<Path> paths = Files.list(Paths.get("e:", "a"));

        Files.lines(Paths.get("e:", "a", "1.txt"))
                .forEach(System.out::println);

        Files.lines(Paths.get("e:", "a", "1.txt"), Charset.defaultCharset())
                .forEach(System.out::println);

        Files.readAllLines(Paths.get("e:", "a", "1.txt"))
                .forEach(System.out::println);
    }
}
