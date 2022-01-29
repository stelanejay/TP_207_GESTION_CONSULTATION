/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconsultation;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Judes Franck
 */
public class AjoutSyntome {
      public void insere(String nom,String syntome,String date,String age, String sexe,String statut,String detaille) throws ClassNotFoundException, SQLException{
        

            String sql = "INSERT INTO `symptome`( `nom`, `symptome`, `date`, `age`, `sexe`, `statut`, `detaille`) VALUES ('?','?','?','?','?','?','?','?')";
            
         try{   
         Seconnecter ss = new Seconnecter();
         Connection conn =  ss.connection();
         
          PreparedStatement pst = conn.prepareStatement(sql);
           
           pst.setString(1,nom);
           pst.setString(2,syntome);
           pst.setString(3,date);
           pst.setString(4,age);
           pst.setString(5,sexe);
           pst.setString(6,statut);
           pst.setString(7,detaille);
           pst.executeUpdate();
           conn.close();
           JOptionPane.showMessageDialog(null,"Patient Ajouter");
         }catch(HeadlessException | SQLException e){
             e.printStackTrace();
         } 
           
        }    
}
