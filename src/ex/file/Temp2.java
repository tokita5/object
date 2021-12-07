package ex.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) throws IOException {
        question2();
    }
    public static void question2() {
        String first = "./src/ex/file";
        String filename = "temp.txt";
        Path path = Path.of(first,filename);
        if (Files.exists(path)) {
            List<String> list = Arrays.asList("あいうえお","かきくけこ");
            try {
                Files.write(path,list);
            }catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}
