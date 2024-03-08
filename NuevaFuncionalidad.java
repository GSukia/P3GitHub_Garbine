package hoja1;
import java.util.Scanner;

public class NuevaFuncionalidad {
           
    public static void main(String[] args) throws IOException {
 
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        String strEdad = lector.readLine();
        Integer edad= Integer.parseInt(strEdad);
        if (edad >= 18) {
            System.out.println("Es mayor de edad ");
        } else {
            System.out.println("Es menor de edad ");
        }
    }
}
