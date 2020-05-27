package src.main;

public class Guest {
    private int id;
    private String name;
    private String nationality;
    private int age;
    private int reservationID;

    public Guest(int id, String name, String nationality, int age, int reservationID) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.reservationID = reservationID;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getReservationID() {
        return reservationID;
    }

    public String getNationality() {
        return nationality;
    }
}
