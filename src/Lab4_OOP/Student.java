package Lab4_OOP;

public class Student {
    //Class Attributes
    private String name;
    private int age;

    //Class method/function
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }


}
