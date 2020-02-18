package model;

import java.time.LocalDate;

/**
 *
 * @author dsd03
 */
public class Note {
    private int id;
    private int patientId;
    private LocalDate date;
    private String notes;

    public Note() {
    }

    public Note(int id, int patientId, LocalDate date, String notes) {
        this.id = id;
        this.patientId = patientId;
        this.date = date;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", patientId=" + patientId + ", date=" + date + ", notes=" + notes + '}';
    }
    
}
