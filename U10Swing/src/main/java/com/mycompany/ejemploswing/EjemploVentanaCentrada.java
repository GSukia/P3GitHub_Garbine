
package com.mycompany.ejemploswing;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Garbine
 * Crea una ventana centrada en la pantalla
 */

public class EjemploVentanaCentrada {

    public static void main(String[] args) {
        System.out.println("Ejemplo de creación de una ventana centrada");
        VentanaCentrada ventanaC= new VentanaCentrada();
        ventanaC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaC.setVisible(true);
    }
    
}
class VentanaCentrada extends JFrame {
    
    public VentanaCentrada(){
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Dimension tamPantalla=mipantalla.getScreenSize();
        int altoPantalla=tamPantalla.height;
        int anchoPantalla=tamPantalla.width;
        setSize(anchoPantalla/2, altoPantalla/2);
        setLocation(anchoPantalla/4, altoPantalla/4);
        setTitle("Nueva ventana");
        Image icono=mipantalla.getImage ("src/imagenes/ifp.png");
        setIconImage(icono);
        Lamina miLamina=new Lamina();
        add(miLamina);
    }
}
class Lamina extends JPanel {
    public void paintComponent (Graphics g){
        super.paintComponent (g);
        g.drawString ("Dibujamos en el panel", 100,100);
    }
}    

