package java_2023.ch18;

import java.io.*;

public class FileWriterExample {
    public static void main(String[] args) throws Exception {
        File file = new File("src/java_2023/ch18/file.txt");
        FileWriter fw = new FileWriter(file, true);
        fw.write("FileWriter는 한글로된 " + "\r\n");
        fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
        fw.flush();
        fw.close();
        System.out.println("파일에 저장되었습니다.");
    }
}
