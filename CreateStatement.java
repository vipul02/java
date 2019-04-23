/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createstatement;

import java.sql.*;

/**
 *
 * @author hp
 */
public class CreateStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String db = "test";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "ApnaPasswordDalo";
        //Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        String query1 = "insert into info values(3, 'Rahul');";
        int insertCount = st.executeUpdate(query1);
        System.out.println("Number of rows inserted:" + insertCount);
        String query2 = "select * from info;";
        ResultSet rs1 = st.executeQuery(query2);
        while(rs1.next()){
            System.out.println("Id:" + rs1.getInt(1) + "\tName:" + rs1.getString(2));
        }
        String query3 = "update info set id=5, name='King' where id=3;";
        int updateCount = st.executeUpdate(query3);
        System.out.println("Number of rows updated:" + updateCount);
        String query4 = "select * from info;";
        ResultSet rs2 = st.executeQuery(query4);
        while(rs2.next()){
            System.out.println("Id:" + rs2.getInt(1) + "\tName:" + rs2.getString(2));
        }
        st.close();
        con.close();
    
}
