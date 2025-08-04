public class ExamSeatValidator {

        public static void validateSeats(int[] ids) {
            for (int i = 0; i < ids.length - 1; i++) {
                int lastDigit1 = ids[i] % 10;
                int lastDigit2 = ids[i + 1] % 10;

                if (lastDigit1 == lastDigit2) {
                    System.out.println("Invalid - " + ids[i] + " and " + ids[i + 1] + " have same last digit");
                    return;
                }
            }
            System.out.println("Valid Seating");
        }

        public static void main(String[] args) {
            int[] ids = {21, 34, 43, 52};
            validateSeats(ids);
        }
    }


