import java.util.*;
public class BoardingGateSimulation {
        public static int countSwaps(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++)
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[i] > arr[j]) count++;
            return count;
        }

        public static void main(String[] args) {
            int[] actual = {101, 103, 102, 104};
            System.out.println("Output: " + countSwaps(actual));
        }
    }
