package src.main;

import java.sql.Date;

public class Booking {
    private int id;
    private String phone;
    private String email;
    private Date bookingDate;
    private int guestsTotal;

    public Booking(int id,String phone,String email,Date bookingDate,int guestsTotal){
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.bookingDate = bookingDate;
        this.guestsTotal = guestsTotal;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public int getGuestsTotal() {
        return guestsTotal;
    }
}
