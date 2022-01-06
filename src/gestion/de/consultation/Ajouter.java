/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.consultation;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Judes Franck
 */
public class Ajouter {
        
    Programm con = new Programm();
    
        public void insere(String nom,String prenom,String sexe,String adresse, String syntome,int age,String detaille) throws ClassNotFoundException, SQLException{
        
//         try{
//                Connection connexion = con.Connect(); 
//                java.sql.Statement st =  connexion.createStatement();
//                String sql = " insert into  patient(nom, prenom, sexe, adresse, syntome, age, detaille) values('"+nom+"','"+prenom+"','"+sexe+"','"+adresse+",'"+syntome+"','"+age+"','"+detaille+"');";
//                st.execute(sql);
//                st.close();
//                connexion.close();
//                
//                JOptionPane.showMessageDialog(null, "Ajout Reussi");
//            }catch(HeadlessException | ClassNotFoundException | SQLException e){
//               e.printStackTrace();
//        }
            String sql = "INSERT INTO public.\"patient\"(nom, prenom, sexe, adresse, syntome, age, detaille) VALUES (?, ?, ?, ?, ?, ?, ?);";
            
            System.out.println(sql);
          Connection conn =  Programm.Connect();
          PreparedStatement pst = conn.prepareStatement(sql);
           
           pst.setString(1,nom);
           pst.setString(2,prenom);
           pst.setString(3,sexe);
           pst.setString(4,adresse);
           pst.setString(5,syntome);
           pst.setInt(6,age);
           pst.setString(7,detaille);
           pst.execute();
           conn.close();
           JOptionPane.showMessageDialog(null,"Patient Ajouter");
           
           
        }    

   
}       

