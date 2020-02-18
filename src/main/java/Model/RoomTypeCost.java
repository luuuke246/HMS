package model;

/**
 *
 * @author dsd03
 */
public class RoomTypeCost {
     
    private String name;
    private int roomId;
    private String type;
    private double cost;

    public RoomTypeCost() {
    }

    public RoomTypeCost(String name, int roomId, String type, double cost) {
        this.name = name;
        this.roomId = roomId;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "RoomTypeCost{" + "name=" + name + ", roomId=" + roomId + ", type=" + type + ", cost=" + cost + '}';
    }
    
    
    
}
