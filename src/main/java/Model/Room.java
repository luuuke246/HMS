package model;

/**
 *
 * @author dsd03
 */
public class Room {
    private int roomId;
    private int wardId;
    private String type;

    public Room() {
    }

    public Room(int roomId, int wardId, String type) {
        this.roomId = roomId;
        this.wardId = wardId;
        this.type = type;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", wardId=" + wardId + ", type=" + type + '}';
    }
    
    
}
