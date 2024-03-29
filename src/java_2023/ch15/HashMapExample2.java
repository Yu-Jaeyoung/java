package java_2023.ch15;

import java.util.*;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();

        map.put(new Student(1, "홍길동"), 95);
        map.put(new Student(1, "홍길동"), 95);
        // 학번과 이름이 동일한 Student를 키로 저장 진행

        System.out.println("총 Entry 수 : " + map.size());
        // 저장된 총 Map.Entry 수 얻기
    }
}