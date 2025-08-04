import java.util.Scanner;
public class PatternLock {


        public static void main(String[] args) {
            final String correctPattern = "1234";
            final int maxAttempts = 5;

            Scanner scanner = new Scanner(System.in);

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Enter 4-digit pattern (Attempt " + attempt + "): ");
                String input = scanner.nextLine();

                if (input.equals(correctPattern)) {
                    System.out.println("Access Granted!");
                    return;
                } else {
                    System.out.println("Incorrect Pattern.");
                }
            }

            System.out.println("System Locked.");
        }
    }


