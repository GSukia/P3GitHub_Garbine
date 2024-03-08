package com.mycompany.ejemploswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EjemploBasico2 {

    public static void main(String args[]) {

        // Creando el Marco        
        JFrame frame = new JFrame("Mi programa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

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
        enviar.addActionListener(accionEnviar());
        JButton restablecer = new JButton("Restablecer");
        
        panel.add(etiqueta); // Componentes agregados usando Flow Layout     
        panel.add(etiqueta); // Componentes agregados usando Flow Layout      
        panel.add(tf);
        panel.add(enviar);
        panel.add(restablecer);

        // Área de texto en el centro    
        JTextArea ta = new JTextArea();
        ta.setText("");
//      restablecer.addActionListener(borrar(ta));
        restablecer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                 ta.setText("");
            }
            });
        // Agregar componentes al marco.      
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, barraMenu);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
    private static ActionListener accionEnviar () {
       return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                 JOptionPane.showMessageDialog(null,
                                        "ENVIADO", "",
                                        JOptionPane.INFORMATION_MESSAGE);
            }
            
            };
    }
//     private static ActionListener borrar (JTextArea ta) {
//       return new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) { 
//                 ta.setText("");
//            }
//            
//            };
//    }
}
