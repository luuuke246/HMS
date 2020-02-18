package model;

import java.time.LocalDate;

/**
 *
 * @author dsd03
 */
public class Visit {
    private int visitorId;
    private int patientId;
    private int doctorId;
    private int departmentId;
    private LocalDate admissionDate;
    private LocalDate dischargeDate;
    private int bedId;
    private LocalDate appointmentDate;

    public Visit() {
    }

    public Visit(int visitorId, int patientId, int doctorId, int departmentId, LocalDate admissionDate, LocalDate dischargeDate, int bedId, LocalDate appointmentDate) {
        this.visitorId = visitorId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.departmentId = departmentId;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.bedId = bedId;
        this.appointmentDate = appointmentDate;
    }

    public int getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(int visitorId) {
        this.visitorId = visitorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Visit{" + "visitorId=" + visitorId + ", patientId=" + patientId + ", doctorId=" + doctorId + ", departmentId=" + departmentId + ", admissionDate=" + admissionDate + ", dischargeDate=" + dischargeDate + ", bedId=" + bedId + ", appointmentDate=" + appointmentDate + '}';
    }
    
    
}
