package Lab3;

import java.util.Arrays;

public class Ex1_sort {
    static void main() {
        int[] clubs = {10, 5, 2, 16};
        for (int i = 0; i < clubs.length - 1; i++) {
            for (int j = i + 1; j < clubs.length; j++) {
                if (clubs[i] < clubs[j]) {
                    int temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(clubs));
    }
}
