package controller;

import model.Patient;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsd03
 */
public class PatientDAO {
    
    private Connection connection;

    public PatientDAO() {
        String url
                = "jdbc:sqlserver://SD-08;"
                + "Database=HospitalManagementSystem;"
                + "IntegratedSecurity=true";
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public List<Patient> selectAllPatients() {

        ArrayList<Patient> listOfPatients = new ArrayList<>();
        try {
            PreparedStatement selectStmt = connection.prepareStatement(
                    "select * from Patient_Details");

            ResultSet resultSet = selectStmt.executeQuery();

            while (resultSet.next()) { 
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("Forename");
                String lastname = resultSet.getString("Surname");
                LocalDate dateOfBirth
                        = resultSet.getDate("DateOfBirth").toLocalDate();
                boolean gender = resultSet.getBoolean("Gender");
                String address = resultSet.getString("Address");
                String nextOfKin = resultSet.getString("NextOfKin");
                int doctorId = resultSet.getInt("DoctorID");
            }
        } catch (SQLException e) {
            System.out.println("Error selecting from the database");
            e.printStackTrace();
        }
        return listOfPatients;
    }

    public boolean insertPatient(Patient patient) {
        try {
            PreparedStatement insertStmt = connection.prepareStatement("Insert Into Patient_Details ( Forename, Surname, DateOfBirth, Gender, Address, NextOfKin, DoctorID)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?)");
            
                insertStmt.setString(1, patient.getForeName());
                insertStmt.setString(2, patient.getSurName());
//                insertStmt.SetDate(3, patient.getDateOfBirth()).toLocalDate(); //?????
                insertStmt.setBoolean(4, patient.isGender());       
                insertStmt.setString(5, patient.getAddress());
                insertStmt.setString(6, patient.getNextOfKin());
                insertStmt.setInt(7, patient.getDoctorID());

                int numRows = insertStmt.executeUpdate();
                System.out.println("Number of rows affected " + numRows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
