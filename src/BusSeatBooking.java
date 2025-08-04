import java.util.*;
public class BusSeatBooking {


        public static void main(String[] args) {
            int[] preferredSeats = {3, 5, 12, 5, 11};

            Set<Integer> bookedSeats = new HashSet<>();
            final int TOTAL_SEATS = 40;

            for (int seat : preferredSeats) {
                if (seat < 1 || seat > TOTAL_SEATS) {
                    System.out.println("Seat " + seat + " Invalid");
                    continue;
                }

                if (bookedSeats.contains(seat)) {
                    System.out.println("Seat " + seat + " Already Booked");
                } else {
                    bookedSeats.add(seat);
                    System.out.println("Seat " + seat + " Booked");
                }
            }
        }
    }


