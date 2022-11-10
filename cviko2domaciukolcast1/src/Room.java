public class Room {
    int id;
    int numberOfBeds;
    boolean isBalcony;
    boolean isSeaView;
    int price;

    public Room(int id, int numberOfBeds, boolean isBalcony, boolean isSeaView, int price) {
        this.id = id;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeaView = isSeaView;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        isSeaView = seaView;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", numberOfBeds=" + numberOfBeds +
                ", isBalcony=" + isBalcony +
                ", isSeaView=" + isSeaView +
                ", price=" + price +
                '}';
    }
}
