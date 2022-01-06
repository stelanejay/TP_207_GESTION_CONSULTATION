package gestion.de.consultation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class Programm {

        
    
    public static Connection Connect() throws ClassNotFoundException{
         String base = "jdbc:postgresql://localhost:5432/postgres";
     String user = "postgres";
     String pass = "Njie09.";
        Connection conn = null;
        PreparedStatement pst;
        ResultSet rs;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(base,user,pass);
            //System.out.println("Connection reussi ");
            //JOptionPane.showMessageDialog(null,"Connexion reussi");
           
        }catch(SQLException e)
        {
          JOptionPane.showMessageDialog(null,"Echec de Connexion");
        }
    
    return conn;
    
}
}
