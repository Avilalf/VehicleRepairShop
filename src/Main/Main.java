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

                    // Creacion de objetos para los Servicios del taller a la hora de ingresar vehículo.
                    // Servicios asimilados con la lubricación de los vehículos:
                    taller.agregarServicio(new Servicio(01, "[LUBRICACIÓN] Cambio de Aceite", 10000));
                    taller.agregarServicio(new Servicio(02, "[LUBRICACIÓN] Cambio de Filtro", 10000));
                    // Servicios asimilados con la electricidad de los vehículos:
                    taller.agregarServicio(new Servicio(11, "[ELECTRICIDAD] Arranques", 12000));
                    taller.agregarServicio(new Servicio(12, "[ELECTRICIDAD] Alternadores", 12000));
                    taller.agregarServicio(new Servicio(13, "[ELECTRICIDAD] Encendido", 12000));
                    taller.agregarServicio(new Servicio(14, "[ELECTRICIDAD] Electro ventiladores", 12000));
                    taller.agregarServicio(new Servicio(15, "[ELECTRICIDAD] Afinación completa", 12000));
                    taller.agregarServicio(new Servicio(16, "[ELECTRICIDAD] Bujías", 12000));
                    taller.agregarServicio(new Servicio(17, "[ELECTRICIDAD] Cables", 12000));
                    taller.agregarServicio(new Servicio(18, "[ELECTRICIDAD] Problemas de temperatura", 12000));
                    // Servicios asimilados con la reparación de chapa y pintura:
                    taller.agregarServicio(new Servicio(21, "[CHAPA - PINTURA] Reparación de Chapa", 50000));
                    taller.agregarServicio(new Servicio(22, "[CHAPA - PINTURA] Pintura del vehículo", 50000));
                    taller.agregarServicio(new Servicio(23, "[CHAPA - PINTURA] Toques de mantenimiento", 50000));
                    // Servicios asimilados con la inyección electrónica y mecánica:
                    taller.agregarServicio(new Servicio(31, "[INYECCIÓN] Electrónica y Mecánica", 20000));
                    taller.agregarServicio(new Servicio(32, "[INYECCIÓN] Reparación y carga de aire acondicionado", 20000));
                    taller.agregarServicio(new Servicio(33, "[INYECCIÓN] Tren delantero", 20000));
                    taller.agregarServicio(new Servicio(34, "[INYECCIÓN] Frenos", 20000));
                    taller.agregarServicio(new Servicio(35, "[INYECCIÓN] Carburación", 20000));
                    taller.agregarServicio(new Servicio(36, "[INYECCIÓN] Cajas de velocidades", 20000));
                    taller.agregarServicio(new Servicio(37, "[INYECCIÓN] Embragues", 20000));
                    taller.agregarServicio(new Servicio(38, "[INYECCIÓN] Suspensión, alineación y balanceo", 20000));
                    taller.agregarServicio(new Servicio(39, "[INYECCIÓN] Apuesta a punto electrónica", 20000));
                    taller.agregarServicio(new Servicio(391, "[INYECCIÓN] Reperación y rectificación de motores", 20000));
                    taller.agregarServicio(new Servicio(392, "[INYECCIÓN] Cambio de Correas de distribución", 20000));
                    taller.agregarServicio(new Servicio(393, "[INYECCIÓN] Limpieza y calibrado de inyectores electrónicos", 20000));

                    TallerUI principalUI = new TallerUI(taller);
                    principalUI.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
