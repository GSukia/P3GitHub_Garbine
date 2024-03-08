
package com.mycompany.ejemploswing;
import javax.swing.JOptionPane;
/**
 * @author Garbine
 */
public class EjemploSwing2 {

  private static String [] alumnos;
	private static double[] notas;
	private static int notaMaxima;
	
	public static void main(String[] args) {
		alumnos = new String [3]; // Inicializo array alumnos con 19 posiciones ( de 0 a 18)
		notas = new double [3]; // Inicializo array notas con 19 posiciones ( de 0 a 18)
		
		// 0. Introducir la nota maxima del test
		//String textoIntroducido = JOptionPane.showInputDialog("Introduce la nota maxima del test"); 
		String textoIntroducido = JOptionPane.showInputDialog(null, "Introduce la nota maxima del test", "Titulo del input", JOptionPane.PLAIN_MESSAGE);
		
		
		if(textoIntroducido.matches("[+-]?\\d*(\\.\\d+)?")) { // Comprueba si hay algun error al introducir datos
			notaMaxima = Integer.parseInt(textoIntroducido);
			introducirDatos();
			imprimirDatos();
		}
	}

	private static void introducirDatos() {
		String comprobacion;
		for(int i = 0; i < alumnos.length; i++) {
			alumnos [i] = JOptionPane.showInputDialog("Introduce nombre del alumno/a");
			comprobacion = JOptionPane.showInputDialog("Introduce la nota del alumno/a");
			if(comprobacion.matches("[+-]?\\d*(\\.\\d+)?")) { // Comprueba si hay algun error al introducir datos
				notas[i] = Integer.parseInt(comprobacion);
			}else {
				JOptionPane.showMessageDialog(null, "Numero incorrecto");
			}	
		}
	}
	
	private static void imprimirDatos() {
		String alumnoConNota = "";
		for(int i = 0; i < alumnos.length; i++) {
			alumnoConNota += alumnos[i] + " " + notas[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, alumnoConNota);
	}
}
