package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import model.Bed;

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
public class BedDAO {
    
    Connection con = null;
    PreparedStatement ps = null;
    InputStream is = null;
    
    private Connection connection;

    public BedDAO() {
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
    
    public List<Bed> selectAllBeds() {

        ArrayList<Bed> listOfBeds = new ArrayList<>();
        try {
            PreparedStatement selectStmt = connection.prepareStatement(
                    "select * from Bed_Details");

            ResultSet resultSet = selectStmt.executeQuery();

            while (resultSet.next()) { 
                int roomId = resultSet.getInt("RoomId");
                double cost = resultSet.getDouble("Cost");
            }
        
        } catch (SQLException e) {
            System.out.println("Error selecting from the database");
            e.printStackTrace();
        } //catch (FileNotFoundException ex) {
          
        //}
        return listOfBeds;
    }

    public boolean insertBed(Bed bed) {
        try {
            PreparedStatement insertStmt = connection.prepareStatement("Insert Into Patient_Details ( Forename, Surname, DateOfBirth, Gender, Address, NextOfKin, DoctorID)\n"
                    + "values (?, ?)");

            insertStmt.setInt(1, bed.getRoomId());
            insertStmt.setDouble(2, bed.getCost());
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
