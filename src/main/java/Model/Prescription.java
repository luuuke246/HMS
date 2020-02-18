package model;

import java.time.LocalDate;

/**
 *
 * @author dsd03
 */
public class Prescription {
    private int id;
    private int patientId;
    private LocalDate issueDate;
    private String notes;

    public Prescription() {
    }

    public Prescription(int id, int patientId, LocalDate issueDate, String notes) {
        this.id = id;
        this.patientId = patientId;
        this.issueDate = issueDate;
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

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Prescription{" + "id=" + id + ", patientId=" + patientId + ", issueDate=" + issueDate + ", notes=" + notes + '}';
    }
    
    
}
