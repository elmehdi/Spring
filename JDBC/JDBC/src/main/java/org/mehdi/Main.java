package org.mehdi;


import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String password = System.getenv("DB_PASSWORD"); // VM ENV.

        try ( // try with resource java 7 - it closes the connection implicitly
              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc" , "root", password);// Driver Manager give me a connection to my DB ---- always start with jdbc:
        ) {
            System.out.println("Connection available : " + connection.isValid(0));

            // CRUD :

            // CREATE - Insert
//            PreparedStatement insertPs = connection.prepareStatement("INSERT INTO USERS (name) values (?)");
//            insertPs.setString(1, "Me");
//            int insertCount = insertPs.executeUpdate();
//            System.out.println("insert count = " + insertCount);


            // READ - Select
            PreparedStatement ps = connection.prepareStatement("Select * FROM USERS WHERE name = ?"); // ? instead of example Mehdi, that's why they are called prepared statements
            ps.setString(1, "Mehdi");
            ResultSet resultset = ps.executeQuery();
            while (resultset.next()) {
                System.out.println(resultset.getInt("id") + " - " + resultset.getString("name"));
            }

            // UPDATE - Update

            PreparedStatement updatePs = connection.prepareStatement("UPDATE USERS set name = ? where name = ?");
            updatePs.setString(1, "Meddy");
            updatePs.setString(2, "Me");

            int updateCount = updatePs.executeUpdate();
            System.out.println("update count = " + updateCount);

            // Delete - Delete
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }