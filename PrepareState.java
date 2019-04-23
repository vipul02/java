/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparestate;

import java.sql.*;

/**
 *
 * @author hp
 */
public class PrepareState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String db = "test";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "";
        //Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement pst = con.prepareStatement("insert into info values(?, ?);");
        int id = 7;
        String name = "Manoj";
        pst.setInt(1, id);
        pst.setString(2, name);
        int insertCount = pst.executeUpdate();
        System.out.println("Number of rows inserted:" + insertCount);
        pst = con.prepareStatement("select * from info;");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println("Id:" + rs.getInt(1) + "\tName:" + rs.getString(2));
        }
        pst = con.prepareStatement("update info set id=?, name=? where id=?;");
        id = 8;
        name = "Kalu";
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, 7);
        int updateCount = pst.executeUpdate();
        System.out.println("Number of rows updated:" + updateCount);
        pst = con.prepareStatement("select * from info;");
        rs = pst.executeQuery();
        while(rs.next()){
            System.out.println("Id:" + rs.getInt(1) + "\tName:" + rs.getString(2));
        }
        
        pst.close();
        con.close();
    }    
    
}
