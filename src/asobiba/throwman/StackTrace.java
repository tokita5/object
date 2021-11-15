package asobiba.throwman;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class StackTrace {
    public static void main(String[] args) {
        Path path1 = Paths.get("D:\\test99","test1.txt");
        Charset charset = Charset.forName("MS932");

        try {
            //存在しないファイルを読みに行って例外を発生させる
            List<String> line = Files.readAllLines(path1,charset);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
