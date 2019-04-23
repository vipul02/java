/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultme;

import java.sql.*;

/**
 *
 * @author hp
 */
public class ResultMe {

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
        PreparedStatement ps=con.prepareStatement("select * from info");  
        ResultSet rs=ps.executeQuery();  
        ResultSetMetaData rsmd=rs.getMetaData();  
  
        System.out.println("Total columns: "+rsmd.getColumnCount());  
        System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
        System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(2));
        System.out.println("Table Name: "+rsmd.getTableName(1));
        
        ps.close();
        con.close();
    }    
    
}
