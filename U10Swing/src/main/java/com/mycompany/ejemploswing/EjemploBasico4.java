
package com.mycompany.ejemploswing;

/**
 * @author Garbine
 */

import java.awt.Color;
import java.awt.Font;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolTip;
 
public class EjemploBasico4 {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de ToolTipText personalizado");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
 
        Font fuente = new Font("Arial", Font.ITALIC, 15);
 
        JButton boton = new JButton("Aceptar"){
 
            private static final long serialVersionUID = 1L;
 
            @Override
            public JToolTip createToolTip() {
                JToolTip toolTip = super.createToolTip();
                toolTip.setBackground(Color.LIGHT_GRAY);
                toolTip.setFont(fuente);
                return toolTip;
            }
        };
 
        boton.setBounds(20, 20, 100, 30);
        frame.add(boton);
        boton.setToolTipText("Probando el ToolTip personalizado");
    }
}
