package model;

import java.time.LocalDate;

/**
 *
 * @author dsd03
 */
public abstract class Patient {
    
    private int id;
    private String foreName;
    private String surName;
    private LocalDate dateOfBirth;
    private boolean gender;
    private String address;
    private int phoneNumber;
    private String nextOfKin;
    private int doctorID;

    public Patient() {
    }

    public Patient(int id, String foreName, String surName, LocalDate dateOfBirth, boolean gender, String address, int phoneNumber, String nextOfKin, int doctorID) {
        this.id = id;
        this.foreName = foreName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.nextOfKin = nextOfKin;
        this.doctorID = doctorID;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public String getNextOfKin() {
        return nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", foreName=" + foreName + ", surName=" + surName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber + ", nextOfKin=" + nextOfKin + ", doctorID=" + doctorID + '}';
    }
    
      


}
