package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import model.Doctor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dsd03
 */
public class DoctorDAO {
    
    Connection con = null;
    PreparedStatement ps = null;
    InputStream is = null;
    
    private Connection connection;

    public DoctorDAO() {
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
    
    public List<Doctor> selectAllDoctors() {

        ArrayList<Doctor> listOfDoctors = new ArrayList<>();
        try {
            PreparedStatement selectStmt = connection.prepareStatement(
                    "select * from Doctor_Details");

            ResultSet resultSet = selectStmt.executeQuery();

            while (resultSet.next()) { 
                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("Forename");
                String lastname = resultSet.getString("Surname");
                
                //photo?
//                is = resultSet.get
                
                boolean gender = resultSet.getBoolean("Gender");
                String address = resultSet.getString("Address");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String qualification = resultSet.getString("Qualifaction");
                int departmentId = resultSet.getInt("departmentId");
            }
        
        } catch (SQLException e) {
            System.out.println("Error selecting from the database");
            e.printStackTrace();
        } //catch (FileNotFoundException ex) {
          
        //}
        return listOfDoctors;
    }

    public boolean insertDoctor(Doctor doctor) {
        try {
            PreparedStatement insertStmt = connection.prepareStatement("Insert Into Patient_Details ( Forename, Surname, DateOfBirth, Gender, Address, NextOfKin, DoctorID)\n"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)");

            insertStmt.setString(1, doctor.getForeName());
            insertStmt.setString(2, doctor.getSurName());
            //IMAGE //?????
            insertStmt.setBoolean(4, doctor.isGender());       
            insertStmt.setString(5, doctor.getAddress());
            insertStmt.setString(6, doctor.getQualification());
            insertStmt.setInt(7, doctor.getDepartmentID());
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}