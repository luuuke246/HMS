package model;

/**
 *
 * @author dsd03
 */
public class Bed {
    private int bedId;
    private int roomId;
    private double cost;

    public Bed() {
    }

    public Bed(int bedId, int roomId, double cost) {
        this.bedId = bedId;
        this.roomId = roomId;
        this.cost = cost;
    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bed{" + "bedId=" + bedId + ", roomId=" + roomId + ", cost=" + cost + '}';
    }
    
    
}
