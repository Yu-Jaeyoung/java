package java_2023.ch18;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/java_2023/ch18/FileInputStreamExample.java");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
