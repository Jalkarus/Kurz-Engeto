import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adela", "Malikova", LocalDate.of(1993, 03, 13));
        Guest guest2 = new Guest("Jan", "Dvoracek", LocalDate.of(1995, 05, 05));
        Room room1 = new Room(1,2, true, true, 1000);
        Room room2 = new Room(2,2, true, true, 1000);
        Room room3 = new Room(3,3, false, true, 2400);
        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021, 9, 19), LocalDate.of(2021, 9, 26), true);
        Booking booking2 = new Booking(guest1,guest2, room3, LocalDate.of(2021,9, 1), LocalDate.of(2021, 9, 14), false);
        ListOfBookings rezervace1 = new ListOfBookings(booking1);
        ListOfBookings rezervace2 = new ListOfBookings(booking2);


        System.out.println(guest1.toString());
        System.out.println(guest2.toString());
        System.out.println(room1.toString());
        System.out.println(room2.toString());
        System.out.println(room3.toString());

        System.out.println(booking1);
        System.out.println(booking2);
        System.out.println(rezervace1);
        System.out.println(rezervace2);

    }


}