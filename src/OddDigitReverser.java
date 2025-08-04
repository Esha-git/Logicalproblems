public class OddDigitReverser {

        public static void main(String[] args) {
            int number = 123456789;
            String reversedOdd = "";

            while (number > 0) {
                int digit = number % 10;
                if (digit % 2 != 0) {
                    reversedOdd += digit;
                }
                number /= 10;
            }

            System.out.println(reversedOdd); // Output: 97531
        }
    }


