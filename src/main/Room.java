package src.main;

public class Room {
    private int id;
    private int roomNo;
    private String type;
    private double pricePerNight;
    private int bedTotal;
    private int hotelID;
    private boolean isBooked;
    private int floorNumber;

    public Room(int id, int roomNo, String type, double pricePerNight, int bedTotal, int hotelID, boolean isBooked, int floorNumber) {
        this.id = id;
        this.roomNo = roomNo;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.bedTotal = bedTotal;
        this.hotelID = hotelID;
        this.isBooked = isBooked;
        this.floorNumber = floorNumber;
    }

    public int getId() {
        return id;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getBedTotal() {
        return bedTotal;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getHotelID() {
        return hotelID;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getType() {
        return type;
    }
}
