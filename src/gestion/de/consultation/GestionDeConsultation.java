/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.de.consultation;

/**
 *
 * @author Judes Franck
 */
public class GestionDeConsultation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
       
//        Programm connection = new Programm();
//        connection.Connect();
        
        GestionPatient patientA = new GestionPatient();
        patientA.show();
    }
    
}
