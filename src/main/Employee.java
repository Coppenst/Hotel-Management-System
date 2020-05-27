package src.main;

public class Employee {
    private int employeeID;
    private String name;
    private String role;
    private String phone;
    private String email;
    private double wage;
    private int hotelId;


    public Employee(int employeeID,String name,String role,String phone,String email,double wage,int hotelId){
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.email = email;
        this.wage = wage;
        this.hotelId = hotelId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getWage() {
        return wage;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getHotelId() {
        return hotelId;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
