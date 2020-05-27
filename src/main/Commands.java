package src.main;

import java.util.List;

public class Commands {
    private DBConnect dbConnect;

    public Commands(DBConnect dbConnect) {
        this.dbConnect = dbConnect;
    }

    public void ShowAllHotels() {
        List<Hotel> hotels = dbConnect.getAllHotels();
        System.out.printf("%s\t%s\t%s\t%s\t%s\n", "ID", "Hotel Name", "Adress", "Area", "Total Rooms");
        System.out.println("-----------------------------------");
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}
