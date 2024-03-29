package java_2023.ch16;

public class Student implements Comparable<Student> {

    public enum Sex {MALE, FEMALE}

    public enum City {Seoul, Pusan}

    private String name;
    private int score;
    private Sex sex;
    private City city;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }

    public Student(String name, int score, Sex sex, City city) {
        this.name = name;
        this.score = score;
        this.sex = sex;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Sex getSex() { return sex; }

    public City getCity() { return city; }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(score, o.score);
    }
}