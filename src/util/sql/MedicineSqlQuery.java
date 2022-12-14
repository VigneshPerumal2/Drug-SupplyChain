/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.sql;

import classes.Medicine;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author amulyamurahari
 */
public class MedicineSqlQuery {

    /**
     * DataBase Connection Details
     */
    private final String URL = "jdbc:mysql://localhost:3306/AVS";
    private final String USER = "root";
    private final String PASSWORD = "!1qaz@2wsx";

    /**
     * Medicine Queries
     */
    private static final String SQL_INSERT_MEDICINE = "INSERT INTO MEDICINE (Medicine_Name, Medicine_Status, Medicine_Category, Date_Of_Manufacture, Medicine_Shell_Life, Manufacturer_Name,Ingredients) VALUES (?,?,?,?,?,?,?)";
    private static final String SQL_READ_MEDICINE = "SELECT * FROM MEDICINE";

    /**
     *
     * @return int Create Medicine Function
     */
    public int createMedicine(Medicine medicine) {
        int result = 0;
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_INSERT_MEDICINE)) {

            preparedStatement.setString(1, medicine.getMedicine_Name());
            preparedStatement.setString(2, medicine.getMedicine_Status());
            preparedStatement.setString(3, medicine.getMedicine_Category());
            preparedStatement.setDate(4, medicine.getDate_Of_Manufacture());
            preparedStatement.setInt(5, medicine.getShell_Life());
            preparedStatement.setString(6, medicine.getManufacturer_Name());
            preparedStatement.setString(7, medicine.getIngredients());

            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }

    /**
     *
     * Select all medicine function
     */
    public ArrayList<Medicine> readAllMedicine() {

        ArrayList<Medicine> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MEDICINE)) {

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String status = resultSet.getString(3);
                String category = resultSet.getString(4);
                Date dom = resultSet.getDate(5);
                int shell_life = resultSet.getInt(6);
                String manufacturer_name = resultSet.getString(7);
                String Ingredients = resultSet.getString(8);

                Medicine obj = new Medicine();
                obj.setId(id);
                obj.setIngredients(Ingredients);
                obj.setMedicine_Name(name);
                obj.setMedicine_Status(status);
                obj.setMedicine_Category(category);
                obj.setDate_Of_Manufacture(dom);
                obj.setShell_Life(shell_life);
                obj.setManufacturer_Name(manufacturer_name);

                record.add(obj);
                System.out.println(obj);
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {

        }
        return record;

    }

    /**
     *
     * @return int Update Medicine Function
     */
    public int updateMedicine(Medicine medicine) {
        int result = 0;
        String SQL_UPDATE_MEDICINE = "UPDATE MEDICINE SET Medicine_Name = ? ,Medicine_Status = ? ,Medicine_Category = ? , Date_Of_Manufacture = ?,Medicine_Shell_Life = ?, Manufacturer_Name = ?,Ingredients=? WHERE Medicine_Id = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_UPDATE_MEDICINE)) {

            preparedStatement.setString(1, medicine.getMedicine_Name());
            preparedStatement.setString(2, medicine.getMedicine_Status());
            preparedStatement.setString(3, medicine.getMedicine_Category());
            preparedStatement.setDate(4, medicine.getDate_Of_Manufacture());
            preparedStatement.setInt(5, medicine.getShell_Life());
            preparedStatement.setString(6, medicine.getManufacturer_Name());
            preparedStatement.setString(7, medicine.getIngredients());
            preparedStatement.setInt(8, medicine.getId());

            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }

    /**
     *
     * @return int Delete Medicine Function
     */
    public int deleteMedicine(Medicine medicine) {
        int result = 0;
        String SQL_DELETE_MEDICINE = "DELETE FROM Medicine WHERE Medicine_Name = ? ";
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_DELETE_MEDICINE)) {

            preparedStatement.setString(1, medicine.getMedicine_Name());
            preparedStatement.setString(2, medicine.getMedicine_Status());
            preparedStatement.setString(3, medicine.getMedicine_Category());
            preparedStatement.setDate(4, medicine.getDate_Of_Manufacture());
            preparedStatement.setInt(5, medicine.getShell_Life());
            preparedStatement.setString(6, medicine.getManufacturer_Name());

            System.out.println("Prepared Statement ->" + preparedStatement);

            int row = preparedStatement.executeUpdate();
            result = row;

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
        }
        return result;
    }
    
    public ArrayList<Medicine> readAllMedicinebyMName(String mName) {
        String SQL_READ_MEDICINE_BY_NAME = "SELECT * FROM MEDICINE WHERE Manufacturer_Name = ? ; ";
        
        ArrayList<Medicine> record = new ArrayList<>();
        try ( Connection conn = DriverManager.getConnection(
                URL, USER, PASSWORD);  PreparedStatement preparedStatement = conn.prepareStatement(SQL_READ_MEDICINE_BY_NAME)) {

            preparedStatement.setString(1, mName);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String status = resultSet.getString(3);
                String category = resultSet.getString(4);
                Date dom = resultSet.getDate(5);
                int shell_life = resultSet.getInt(6);
                String manufacturer_name = resultSet.getString(7);
                String Ingredients = resultSet.getString(8);

                Medicine obj = new Medicine();
                obj.setId(id);
                obj.setIngredients(Ingredients);
                obj.setMedicine_Name(name);
                obj.setMedicine_Status(status);
                obj.setMedicine_Category(category);
                obj.setDate_Of_Manufacture(dom);
                obj.setShell_Life(shell_life);
                obj.setManufacturer_Name(manufacturer_name);

                record.add(obj);
                System.out.println(obj);
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {

        }
        return record;

    }
    

}
