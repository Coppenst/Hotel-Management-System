package src.main;

public class Hotel {
    private int id;
    private String hotelName;
    private String address;
    private String area;
    private int roomTotal;

    public Hotel(int id, String hotelName, String address, String area, int roomTotal) {
        this.id = id;
        this.hotelName = hotelName;
        this.address = address;
        this.area = area;
        this.roomTotal = roomTotal;
    }

    public int getId() {
        return id;
    }

    public int getRoomTotal() {
        return roomTotal;
    }

    public String getAddress() {
        return address;
    }

    public String getArea() {
        return area;
    }

    public String getHotelName() {
        return hotelName;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%s\t%s\t%d", id, hotelName, address, area, roomTotal);
    }
}
