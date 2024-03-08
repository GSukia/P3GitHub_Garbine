package Ejemplo;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.TextField;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main{

	/**
	 * VIENEN HECHAS pero algunas comentadas
	 */
	static JFrame jframe = new JFrame();
	static TextArea textArea = new TextArea();
	static ArrayList<String> cadenas = new ArrayList<String>();
	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		cadenas.add(new String("Me ha salvado la vida")); // 0
		cadenas.add(new String("Rodri no te enfades")); // 1
		cadenas.add(new String("Victor, confiamos en ti")); // 2
		cadenas.add(new String("Dani es el jefe")); // 3
		cadenas.add(new String("Marcos esos nombres...")); // 4
		
		alumnos.add(new Alumno(0, "Pepe", "Pérez"));
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 if(textArea.getText().length() >= 10)
				    {
				        e.consume();
				    }
			}
		});
		textArea.setText(alumnos.get(0).getNombre());
		
		/**
		 * VIENE HECHO
		 */
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setBounds(100, 100, 450, 300);
		jframe.setVisible(true);
		
		inicio_aplicacion();
		
		String datos = JOptionPane.showInputDialog(jframe, "Escribe un mensaje");
		agregarEnArrayList(datos);

		
		String datos2 = JOptionPane.showInputDialog(jframe, "Escribe un mensaje");
		agregarEnArrayList(datos2);
		rellenar_textarea();
		
		escribirFichero();
	}

	/**
	 * Metodo que recoge un string y crea un objeto dentro del ArrayList cadenas
	 * @param datos
	 * Hay que realizarlo
	 */
	private static void agregarEnArrayList(String datos) {
		cadenas.add(new String(datos));
	}

	/**
	 * Metodo que rellena el textarea con los datos del ArrayList de tipo String llamado angela
	 * Hay que realizarlo
	 */
	private static void rellenar_textarea() {
		for(int i = 0; i < cadenas.size(); i ++) {
			textArea.setText(textArea.getText() + " " +cadenas.get(i) + System.lineSeparator()); //OPCION 1
			//textField.append(cadenas.get(i) + System.lineSeparator()); // OPCION 2
		}
	}

	/**
	 * RECOGER LOS DATOS DEL TEXTAREA Y PASARLOS A UN FICHERO PARA EXPORTAR
	 * Hay que realizarlo
	 */
	private static void escribirFichero() {
		/**
		 * File
		 * FileWriter
		 * JFileChooser
		 */
		JFileChooser ficheros = new JFileChooser();
		int rutaAbsoluta = ficheros.showOpenDialog(jframe);
		String rutaAbsoluta2 = ficheros.getSelectedFile().getAbsolutePath();
		
		try {
			FileWriter fw = new FileWriter(rutaAbsoluta2+".txt");
			fw.write(textArea.getText());
			fw.close();
		} catch (IOException e) {}
		
	}

	/**
	 * Metodo de inicio de la aplicacion.
	 * Viene hecho
	 */
	private static void inicio_aplicacion() {
		jframe.getContentPane().add(textArea, BorderLayout.CENTER);
	}
}
