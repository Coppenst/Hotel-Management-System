package src.main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnect {
    private Connection conn;

    public DBConnect() {
        String url = "jdbc:mysql://localhost:3306/hoteldb";
        try {
            conn = DriverManager.getConnection(url, "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Hotel> getAllHotels() {
        String query = "SELECT * FROM tbl_hotel";
        List<Hotel> hotels = new ArrayList<>();
        try {
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String address = resultSet.getString(3);
                String area = resultSet.getString(4);
                int totalRoom = resultSet.getInt(5);

                Hotel hotel = new Hotel(id, name, address, area, totalRoom);
                hotels.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hotels;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
