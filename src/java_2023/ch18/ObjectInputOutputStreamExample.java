package java_2023.ch18;

import java.io.*;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src/java_2023/ch18/Object.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(10);
        oos.writeObject(3.14);
        oos.writeObject(new int[]{1, 2, 3});
        oos.writeObject(new String("홍길동"));

        oos.flush();
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("src/java_2023/ch18/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Integer obj1 = (Integer) ois.readObject();
        Double obj2 = (Double) ois.readObject();
        int[] obj3 = (int[]) ois.readObject();
        String obj4 = (String) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3[0] + "," + obj3[1] + "," + obj3[2]);
        System.out.println(obj4);
    }
}
