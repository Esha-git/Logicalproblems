import java.util.Arrays;
import java.util.Collections;

public class StudentRankList {

        public static void main(String[] args) {
            Integer[] marks = {50, 80, 60};

            Arrays.sort(marks, Collections.reverseOrder());

            for (int i = 0; i < marks.length; i++) {
                System.out.println((i + 1) + ". " + marks[i]);
            }
        }
    }


