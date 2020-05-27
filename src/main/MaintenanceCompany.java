package src.main;

public class MaintenanceCompany {
    private int id;
    private String name;
    private String address;

    public MaintenanceCompany(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address= address;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
