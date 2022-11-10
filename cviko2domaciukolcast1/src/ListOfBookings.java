public class ListOfBookings {
    Booking booking;

    public ListOfBookings(Booking booking) {
        this.booking = booking;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "ListOfBookings{" +
                "Rezervace = " + booking +
                '}';
    }
}
