package Lab4_OOP;

public class VideoOOP {
    static void main() {
        Student st1 = new Student(); // constructor
        Student st2 = new Student("Nguyễn Tiến Dũng", 19);
        System.out.println("Obj: " + st2.getName() + " and age = " + st2.getAge());
    }
}

