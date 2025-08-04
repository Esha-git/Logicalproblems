public class SlotMachine {

        public static void main(String[] args) {
            int number = 363;

            if (isPalindrome(number) && isSumDivisibleBy3(number)) {
                System.out.println("Jackpot!");
            } else {
                System.out.println("Try Again.");
            }
        }

        static boolean isPalindrome(int num) {
            int original = num;
            int reversed = 0;

            while (num > 0) {
                reversed = reversed * 10 + (num % 10);
                num /= 10;
            }

            return original == reversed;
        }

        static boolean isSumDivisibleBy3(int num) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            return sum % 3 == 0;
        }
    }


