package asobiba.kensareigai;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Throws {
    public static void main(String[] args) {
        try {
            //メソッドを呼ぶ側
            FileTest.read();
        }catch (IOException e) {
            //java.nio.file.NoSuchFileException: D:\workspace\test2.txt
        }finally {
            System.out.println("finallyの実行");
        }
    }
}
class FileTest{
    //メソッドが呼ばれる側
    static void read() throws IOException { //throws IOExceptionを書く
        String dir = "D:\\workspace";
        String filename = "test2.text";

        //存在しないファイルを読みに行って例外（IOException）が発生
        List<String> line = Files.readAllLines(Paths.get(dir,filename),
                Charset.forName("SHIFT_JIS"));


    }
}
