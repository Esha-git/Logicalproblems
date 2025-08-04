public class Vowel {

        public static boolean isValidWord(String word) {
            String vowels = "aeiouAEIOU";

            if (word.length() < 3) {
                return false;
            }

            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if (vowels.indexOf(first) == -1 || vowels.indexOf(last) == -1) {
                return false;
            }


            int vowelCount = 0;
            for (int i = 1; i < word.length() - 1; i++) {
                if (vowels.indexOf(word.charAt(i)) != -1) {
                    vowelCount++;
                }
            }

            return vowelCount == 2;
        }

        public static void main(String[] args) {
            String[] words = {"area", "education", "isolation", "idea", "eagle", "input", "eye"};

            for (String word : words) {
                System.out.println(word + ": " + (isValidWord(word) ? "Valid" : "Invalid"));
            }
        }
    }


