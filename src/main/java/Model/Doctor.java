package model;

import java.time.LocalDate;

/**
 *
 * @author dsd03
 */
public class Doctor {
    private int id;
    private String foreName;
    private String surName;
    private String photo;   //image URL I would assume
    private boolean gender;
    private String address;
    private int phoneNumber;
    private String qualification;
    private int departmentID;

    public Doctor() {
    }

    public Doctor(int id, String foreName, String surName, String photo, boolean gender, String address, int phoneNumber, String qualification, int departmentID) {
        this.id = id;
        this.foreName = foreName;
        this.surName = surName;
        this.photo = photo;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.qualification = qualification;
        this.departmentID = departmentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForeName() {
        return foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public String toString() {
        return "Doctor{" + "id=" + id + ", foreName=" + foreName + ", surName=" + surName + ", photo=" + photo + ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", qualification=" + qualification + ", departmentID=" + departmentID + '}';
    }
    
    
}
