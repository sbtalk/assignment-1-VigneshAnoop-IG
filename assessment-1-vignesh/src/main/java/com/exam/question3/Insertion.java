package com.exam.question3;
import java.sql.*;
import java.util.Comparator;

public class Insertion {
    static void main() {


        String insert_sql = "insert into student(id,name,address) values(?,?,?)";
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/test", "root", "root");
                PreparedStatement pst = conn.prepareStatement(insert_sql);
                ) {
            pst.setInt(1, 101);
            pst.setString(2, "Vignesh");
            pst.setString(3, "Chennai");
            pst.executeUpdate();

            pst.setInt(1, 102);
            pst.setString(2, "Anoop");
            pst.setString(3, "Hyderabad");
            pst.executeUpdate();

            pst.setInt(1, 103);
            pst.setString(2, "Naidu");
            pst.setString(3, "Banglore");
            pst.executeUpdate();

            pst.setInt(1, 104);
            pst.setString(2, "Anand");
            pst.setString(3, "Hyderabad");
            pst.executeUpdate();

            pst.setInt(1, 105);
            pst.setString(2, "Shekhar");
            pst.setString(3, "Pune");
            pst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
