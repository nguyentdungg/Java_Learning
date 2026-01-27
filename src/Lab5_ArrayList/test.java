package Lab5_ArrayList;

import java.util.ArrayList;

public class test {
    static void main() {
        int a = 10;
        ArrayList<String> a1 = new ArrayList<String>();

//        a1.add(2); //integer --> Integer(Class)
        a1.add("Test ArrayList");
        a1.add("Youtube1");
        a1.add("Youtube2");

        a1.remove(1);
        System.out.println(a1.toString() + " " + a1.get(1));

//        System.out.println(a1.toString() + " " + a1.get(2));
    }
}
