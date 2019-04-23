/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;
import java.sql.*;
/**
 *
 * @author hp
 */

public class Jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String db = "test";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        //int id = 3;
        //String name = "Rahul";
        //String query = "insert into info values(" + id + "," + name + ");";
        String query = "select * from info;";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.println("Id:" + rs.getInt(1) + "\tName:" + rs.getString(2));
        }
        st.close();
        con.close();
    }
    
}
