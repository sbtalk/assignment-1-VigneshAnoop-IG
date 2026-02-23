package com.exam.question3;

import java.sql.*;

public class Selection {
        static void main() {
            String select_sql = "select * from student";
            try(
                    Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/test","root","root");
                    PreparedStatement pst=conn.prepareStatement(select_sql);
                    ResultSet rs=pst.executeQuery();
                    ) {

                while(rs.next()){
                    System.out.println(rs.getInt("ID")+" "+rs.getString("NAME")+" "+rs.getString("ADDRESS"));
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
}