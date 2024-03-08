
package com.mycompany.ejemploswing;
import javax.swing.*;

public class EjemploBasico {
//Ejem`plo básico de creación de una ventana mediante la clase JFrame 
    public static void main(String args[]) {      
        JFrame ventana = new JFrame("Mi primera ventana");      
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        ventana.setSize(300, 300);      
        //frame.setBounds(60,50,600,500);
        ventana.setTitle("Mi primera ventana");  //pone el título a la vengtana
        ventana.setResizable(false);  //hace que su tamaño no se pueda modificar
//        ventana.setIconImage("src/imagenes/ifp.png");  CORREGIR!!

        // Crea un botón
        JButton Boton = new JButton("Entrar");      
        ventana.getContentPane().add(Boton); // Agrega el botón al panel de contenido del marco     
        ventana.setVisible(true);   //Lo hace visible
    }
}