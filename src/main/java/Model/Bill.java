package model;

import java.time.LocalDate;

/**
 *
 * @author dsd03
 */
public class Bill {
    private int id;
    private LocalDate date;
    private double roomCharge;
    private double doctorFee;
    private String note;
    private double miscFee;

    public Bill() {
    }

    public Bill(int id, LocalDate date, double roomCharge, double doctorFee, String note, double miscFee) {
        this.id = id;
        this.date = date;
        this.roomCharge = roomCharge;
        this.doctorFee = doctorFee;
        this.note = note;
        this.miscFee = miscFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(double roomCharge) {
        this.roomCharge = roomCharge;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getMiscFee() {
        return miscFee;
    }

    public void setMiscFee(double miscFee) {
        this.miscFee = miscFee;
    }

    @Override
    public String toString() {
        return "Bill{" + "id=" + id + ", date=" + date + ", roomCharge=" + roomCharge + ", doctorFee=" + doctorFee + ", note=" + note + ", miscFee=" + miscFee + '}';
    }
    
    
}
