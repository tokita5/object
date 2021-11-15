package asobiba.kensareigai;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class NotThrows {
    public static void main(String[] args) {
        FileTesting.read();
    }
}
class FileTesting{
    static  void read() {
        String dir = "D:\\workspace";
        String filename = "test2.txt";

        try {
            List<String> line = Files.readAllLines(Paths.get(dir,filename),
                    Charset.forName("SHIFT_JIS"));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}