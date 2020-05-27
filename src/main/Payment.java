package src.main;

public class Payment {
    private int id;
    private int reservationID;
    private double amount;
    private String paymentMethod;

    public Payment(int id, int reservationID, double amount, String paymentMethod) {
        this.id = id;
        this.reservationID = reservationID;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public int getReservationID() {
        return reservationID;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
