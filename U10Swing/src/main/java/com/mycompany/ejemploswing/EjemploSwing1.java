package com.mycompany.ejemploswing;
import javax.swing.*;
import java.awt.Frame;

/**
 *
 * @author Garbine
 */
public class EjemploSwing1 {

    public static void main(String[] args) {
        System.out.println("Ejemplo de creación de una ventana");
        Ventana2 ventana2= new Ventana2();
        ventana2.setLocation (60,50);
        //ventana1.setBounds(60,50,600,500);
        ventana2.setTitle("Mi primera ventana");
        //ventana1.setIconImage();
       // ventana2.setResizable(false);
       //otras opciones MAXIMIZED_HORIZ, MAXIMIZED_VERT, NORMAL, ICONOFIED
        ventana2.setExtendedState(Frame.MAXIMIZED_BOTH);
        //ventana1.setExtendedState(6);
        JPanel panel1= new JPanel();
        
    }
}

class Ventana2 extends JFrame {
    public Ventana2 (){
        setSize (500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
        //setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);