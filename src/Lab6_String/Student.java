package Lab6_String;

public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    static void main() {
        Student s1 = new Student("Nguyễn Tiến Dũng", 1);
        Student s2 = new Student("Eric", 2);
        Student s3 = new Student("Nguyễn Văn A", 3);
        Student s4 = new Student("Trần Thị C", 4);
        Student s5 = new Student("Jonny Nguyen", 5);

        Student[] list = {s1, s2, s3, s4, s5};
        for (Student s : list) {
            if (s.getName().contains("Nguyễn")) {
                System.out.println(s.toString());
            }
        }
    }
}
