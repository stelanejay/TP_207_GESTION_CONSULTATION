/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconsultation;

import static gestionconsultation.Seconnecter.connection;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Judes Franck
 */
public class GestionPatient extends javax.swing.JFrame {

    /**
     * Creates new form GestionPatient
     */
    public GestionPatient(int id) {
        initComponents();
        table();
         M.setSelected(true);
        int id_pat = 0;
        id = id_pat;
//        age.setVisible(false);
//        M.setVisible(false);
//        F.setVisible(false);
//        ageL.setVisible(false);
//        sexeL.setVisible(false);
//        nom.setVisible(false);
//        nomL.setVisible(false);
       
    }
    
   
       Seconnecter ss = new Seconnecter();
       Connection conn =  ss.connection();
        
        PreparedStatement pst;
         ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        ageL = new javax.swing.JLabel();
        symptome = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        details = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        sexeL = new javax.swing.JLabel();
        M = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        nomL = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        age = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" PATIENTS");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jButton1.setText("AJOUTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jButton2.setText("SUPPRIMER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bell MT", 2, 24)); // NOI18N
        jButton3.setText("MODIFIER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton4.setText("Deconnecter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        table.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Symptome", "Date_RDV", "Statut", "Age", "Sexe", "Détails"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(26);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setText("Syntome    : ");

        ageL.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        ageL.setText("Age          :");

        symptome.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        symptome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maux de :---------------------", "Tete", "Gorge", "Ventre", "Coeur", "Membres", "Autres...." }));
        symptome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setText("Détails      : ");

        details.setColumns(20);
        details.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        details.setRows(5);
        details.setText(" ");
        jScrollPane1.setViewportView(details);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("Nettoyer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        sexeL.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        sexeL.setText("Sexe         :");

        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        nomL.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        nomL.setText(" Nom        :");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ageL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexeL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(nomL, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(M)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(age)
                    .addComponent(symptome, 0, 1, Short.MAX_VALUE)
                    .addComponent(nom)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addGap(123, 123, 123))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomL, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(nom))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(symptome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ageL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(age)
                                .addGap(3, 3, 3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sexeL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(M))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(F)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(983, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void table(){
            Seconnecter ss = new Seconnecter();
            Connection conn =  ss.connection();
            
            String []patient={"ID","Nom","Symptome","Date_RDV","Age","Sexe","Statut","detaille","Heure"};
            String []  afficher = new String [9];
           
            DefaultTableModel model = new DefaultTableModel(null,patient);
            String pp = "select * from symptome";
        try{
         
          Statement st;
          st = conn.createStatement();
          rs = st.executeQuery(pp);
          
            while(rs.next()){
           afficher[0] = rs.getString("num_id");
           afficher[1] = rs.getString("nom"); 
           afficher[2] = rs.getString("symptome");
           afficher[3] = rs.getString("date");
           afficher[4] = rs.getString("age");
           afficher[5] = rs.getString("sexe");
           afficher[6] = rs.getString("statut");
           afficher[7] = rs.getString("detaille");
           afficher[8] = rs.getString("Heure");
           model.addRow(afficher);
           
        }
          table.setModel(model);
          conn.close();
        }catch(SQLException e){
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       
        try{
        Seconnecter ss = new Seconnecter();
        Connection conn =  ss.connection();
        pst = conn.prepareStatement("INSERT INTO  `symptome`( nom, symptome, date, age, sexe,statut,detaille, Heure) VALUES (?,?,?,?,?,?,?,?)");
      
        pst.setString(1,nom.getText());
        pst.setString(2,symptome.getSelectedItem().toString());
        pst.setString(3,"");
        pst.setString(4,age.getText());
        pst.setString(5, M.isSelected()?"Masculin":"Feminin");
        pst.setString(6,"En attente");
        pst.setString(7,details.getText());
        pst.setString(8,"");
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Ajout Reussi");
        table();
        }catch(SQLException e){
            e.printStackTrace();
        }
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed


                                                       
      try{
           Seconnecter ss = new Seconnecter();
         Connection conn =  ss.connection();
           pst = conn.prepareStatement("delete from symptome where num_id = ? ");
           int  num_id = table.getSelectedRow();
           String selectionner = (String)table.getValueAt(num_id, 0);
           pst.setString(1,selectionner);
           pst.executeUpdate();
           conn.close();
           JOptionPane.showMessageDialog(null,"Suppression avec Succes"); 
           table();
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Erreur de Suppression ");
      }
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
        Seconnecter ss = new Seconnecter();
        Connection conn =  ss.connection();
        pst = conn.prepareStatement("update`symptome` set nom=? , symptome=?, age=?, sexe=?,detaille=? where num_id = ?");
        int code  = table.getSelectedRow();
        String selectionner = (String)table.getValueAt(code,0);
        pst.setString(1,nom.getText());
        pst.setString(2,symptome.getSelectedItem().toString());
        pst.setString(3,age.getText());
        pst.setString(4, M.isSelected()?"Masculin":"Feminin");
        pst.setString(5,details.getText());
        pst.setString(6,selectionner);
        pst.executeUpdate();
        conn.close();
        JOptionPane.showMessageDialog(null,"Modification Reussi");
        table();
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Erreur de Modification");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      Connexion connect = new Connexion();
      connect.show();
      this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseEntered

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        int select = table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)table.getModel();
       nom.setText(model.getValueAt(select,1).toString());
       symptome.setSelectedItem(model.getValueAt(select,2).toString());
       age.setText(model.getValueAt(select,4).toString());
       M.setText(model.getValueAt(select,5).toString());
       details.setText(model.getValueAt(select,7).toString());
    }//GEN-LAST:event_tableMouseReleased

    private void symptomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_symptomeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        nom.setText("");
        age.setText("");
        details.setText("");
        symptome.getSelectedItem();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
        if(M.isSelected()) F.setSelected(false);
        else F.setSelected(true);
    }//GEN-LAST:event_MActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
        if(F.isSelected()) M.setSelected(false);
        else M.setSelected(true);
    }//GEN-LAST:event_FActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPatient(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton M;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageL;
    private javax.swing.JTextArea details;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nomL;
    private javax.swing.JLabel sexeL;
    private javax.swing.JComboBox<String> symptome;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
