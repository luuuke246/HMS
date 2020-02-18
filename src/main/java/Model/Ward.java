package model;

/**
 *
 * @author dsd03
 */
public class Ward {
    
    private int wardId;
    private int departmentId;
    private String name;

    public Ward() {
    }

    public Ward(int wardId, int departmentId, String name) {
        this.wardId = wardId;
        this.departmentId = departmentId;
        this.name = name;
    }

    public int getWardId() {
        return wardId;
    }

    public void setWardId(int wardId) {
        this.wardId = wardId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ward{" + "wardId=" + wardId + ", departmentId=" + departmentId + ", name=" + name + '}';
    }
    
    
    
}
