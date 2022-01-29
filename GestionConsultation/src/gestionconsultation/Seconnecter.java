/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconsultation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Judes Franck
 */
public class Seconnecter {
     public static Connection connection(){
          Connection conn = null;
		try{
                            Class.forName("com.mysql.jdbc.Driver");                         
			        String url = "jdbc:mysql://localhost:3306/consultation?zeroDateTimeBehavior=convertToNull";      
				String user = "root";
				String passwd = "";
				conn = DriverManager.getConnection(url, user, passwd);
                                System.out.print("Connexion Reussi");
		    } catch (ClassNotFoundException | SQLException e) {      
		} 
                return conn;
    }
}
