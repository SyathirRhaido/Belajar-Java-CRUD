
package belajarcrud;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Lab Apli 1
 */
public class MyConnectDB {

    Connection conn = null;

    public static Connection KoneksiSaya(){

        String url = "jdbc:mysql://localhost/db_java_crud";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            
            if(conn != null){
                System.out.print("Koneksi Terhubung");
            }
            return conn;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ada masalah Bro..: "+e);

            return null;
        }


    }

}
