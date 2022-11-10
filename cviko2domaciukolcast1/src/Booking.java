import java.time.LocalDate;

public class Booking {
    Guest guest;
    Guest guestAditional;
    Room room;
    LocalDate startOfReservation;
    LocalDate endOfReservation;
    boolean isBusinessTrip;

    public Booking(Guest guest, Guest guestAditional, Room room, LocalDate startOfReservation, LocalDate endOfReservation, boolean isBusinessTrip) {
        this.guest = guest;
        this.guestAditional = guestAditional;
        this.room = room;
        this.startOfReservation = startOfReservation;
        this.endOfReservation = endOfReservation;
        this.isBusinessTrip = isBusinessTrip;
    }

    public Booking(Guest guest, Room room, LocalDate startOfReservation, LocalDate endOfReservation, boolean isBusinessTrip) {
        this.guest = guest;
        this.guestAditional = null;
        this.room = room;
        this.startOfReservation = startOfReservation;
        this.endOfReservation = endOfReservation;
        this.isBusinessTrip = isBusinessTrip;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuestAditional() {
        return guestAditional;
    }

    public void setGuestAditional(Guest guestAditional) {
        this.guestAditional = guestAditional;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartOfReservation() {
        return startOfReservation;
    }

    public void setStartOfReservation(LocalDate startOfReservation) {
        this.startOfReservation = startOfReservation;
    }

    public LocalDate getEndOfReservation() {
        return endOfReservation;
    }

    public void setEndOfReservation(LocalDate endOfReservation) {
        this.endOfReservation = endOfReservation;
    }

    public boolean isBusinessTrip() {
        return isBusinessTrip;
    }

    public void setBusinessTrip(boolean businessTrip) {
        isBusinessTrip = businessTrip;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guest=" + guest +
                ", guestAditional=" + guestAditional +
                ", room=" + room +
                ", startOfReservation=" + startOfReservation +
                ", endOfReservation=" + endOfReservation +
                ", isBusinessTrip=" + isBusinessTrip +
                '}';
    }
}
