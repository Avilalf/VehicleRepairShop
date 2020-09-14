/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.logging.Level;
import java.util.logging.Logger;
import taller.logica.Servicio;
import taller.logica.Taller;
import taller.ui.TallerUI;

/**
 *
 * @author 57312
 */
public class Main {

    public static void main(String[] args) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Taller taller = new Taller(1411L, "PAPAYAL MECANICH");

                    TallerUI principalUI = new TallerUI(taller);
                    principalUI.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
