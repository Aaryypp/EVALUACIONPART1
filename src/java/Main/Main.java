/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.ArrayList;
import sw.Farmacia;
import sw.ServidorWS;
import sw.ServidorWS_Service;

/**
 *
 * @author ariel
 */
public class Main {
    public static Pedido ped = new Pedido();
    public static Farmacia farma = new Farmacia();
    public static ServidorWS_Service servicio =new ServidorWS_Service();
    public static ServidorWS cliente=servicio.getServidorWSPort();
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        ped.setLocationRelativeTo(null);
        ped.setVisible(true);
        llenarcombos();
        
        
        
        
    }

    private static void llenarcombos() {  
      ArrayList<Farmacia> farmacias = new ArrayList<>();
      farmacias=(ArrayList<Farmacia>) cliente.mostrarfarma();
        for (Farmacia farm : farmacias) {
        // Agregamos solo el nombre de la farmacia al combo
        ped.getCombofarma().addItem(farm.getNombre());
    }
    
    }
    
}
