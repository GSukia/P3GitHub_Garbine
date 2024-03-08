
package com.mycompany.ejemploswing;
import javax.swing.*;
import java.awt.Frame;

/**
 *
 * @author Garbine
 */
public class EjemploSwing {

    public static void main(String[] args) {
        System.out.println("Ejemplo de creación de una ventana");
        Ventana ventana1= new Ventana();
        ventana1.setLocation (60,50);
        //ventana1.setBounds(60,50,600,500);
        ventana1.setTitle("Mi primera ventana");
        //ventana1.setIconImage();
       // ventana1.setResizable(false);
       //otras opciones MAXIMIZED_HORIZ, MAXIMIZED_VERT, NORMAL, ICONOFIED
        ventana1.setExtendedState(Frame.MAXIMIZED_BOTH);
        //ventana1.setExtendedState(6);
    }
}

class Ventana extends JFrame {
    public Ventana (){
        setSize (500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
        //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);