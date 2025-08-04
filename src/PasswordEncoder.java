public class PasswordEncoder {

        public static String encode(String password) {
            StringBuilder encoded = new StringBuilder();

            for (char ch : password.toCharArray()) {
                char upper = Character.toUpperCase(ch);

                if ("AEIOU".indexOf(upper) != -1) {
                    encoded.append('@');
                } else if (Character.isDigit(upper) && (upper - '0') % 2 == 0) {
                    encoded.append('*');
                } else {
                    encoded.append(upper);
                }
            }

            return encoded.toString();
        }

        public static void main(String[] args) {
            String input = "Java1234";
            String output = encode(input);
            System.out.println(output);
        }
    }


