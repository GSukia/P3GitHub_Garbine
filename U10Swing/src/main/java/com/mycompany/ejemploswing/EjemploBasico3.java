
package com.mycompany.ejemploswing;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class EjemploBasico3 {
 
    public static void main(String args[]) {        

        // Creando el Marco        
        JFrame ventana = new JFrame("Mi programa");       
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        ventana.setSize(400, 400);        

        // Creando MenuBar y agregando componentes   
        JMenuBar barraMenu = new JMenuBar();       
        JMenu menu1 = new JMenu("Archivo");       
        JMenu menu2 = new JMenu("Ayuda");       
        barraMenu.add(menu1);       
        barraMenu.add(menu2);       
        JMenuItem m11 = new JMenuItem("Abrir");       
        JMenuItem m22 = new JMenuItem("Guardar como");       
        menu1.add(m11);       
        menu1.add(m22);        

        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no está visible en la salida      
        JLabel etiqueta = new JLabel("Introducir texto");       
        JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
        JButton enviar = new JButton("Enviar");      
        enviar.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent e)  {
            System.out.println ("Has pulsado el botón enviar");
        }
        });
    
        JButton salir = new JButton("Salir");    
         salir.addActionListener(new ActionListener(){
        public void actionPerformed (ActionEvent e)  {
            System.exit(0);
        //    System.out.println ("Has pulsado el botón salir");
        
        }
        });
        panel.add(etiqueta); // Componentes agregados usando Flow Layout     
        panel.add(etiqueta); // Componentes agregados usando Flow Layout      
        panel.add(tf);       
        panel.add(enviar);       
        panel.add(salir);        
//        enviar.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                enviarActionPerformed(evt);
//            }
//        });

        // Área de texto en el centro    
        JTextArea ta = new JTextArea();        

        // Agregar componentes al marco.      
        ventana.getContentPane().add(BorderLayout.SOUTH, panel);       
        ventana.getContentPane().add(BorderLayout.NORTH, barraMenu);       
        ventana.getContentPane().add(BorderLayout.CENTER, ta);       
        ventana.setVisible(true);   
    }
//    private static void enviarActionPerformed (java.awt.event.ActionEvent evt){
//        JOptionPane.showMessageDialog(null, "Has pulsado el botón enviar");
//    }
   
}