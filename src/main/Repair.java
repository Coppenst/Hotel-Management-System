package src.main;

public class Repair {
    private int id;
    private int roomID;
    private int cmpID;
    private String dates;
    private String description;
    private String repairType;

    public Repair(int id, int roomID, int cmpID, String dates, String description, String repairType) {
        this.id = id;
        this.roomID = roomID;
        this.cmpID = cmpID;
        this.dates = dates;
        this.description = description;
        this.repairType = repairType;
    }

    public int getId() {
        return id;
    }

    public int getCmpID() {
        return cmpID;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getDates() {
        return dates;
    }

    public String getDescription() {
        return description;
    }

    public String getRepairType() {
        return repairType;
    }
}
