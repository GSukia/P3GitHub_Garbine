/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package U10Swing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase representa una empresa de coches de alquiler que ofrece diez modelos diferentes de coches.
 * El programa permite al usuario seleccionar un coche según el número de plazas y la duración del alquiler,
 * y le informa del precio total y le permite reservarlo introduciendo su nombre y DNI.
 * @author Yván Morales/ AKA Slyfer

 */


public class EmpresaAlquiler {

    // Atributos
    private ArrayList<Coche> catalogo; // Lista de coches disponibles
    private Scanner sc; // Objeto para leer datos por teclado

    // Constructor
    public EmpresaAlquiler() {
        catalogo = new ArrayList<>(); // Inicializamos el catálogo vacío
        sc = new Scanner(System.in); // Inicializamos el scanner
        cargarCatalogo(); // Cargamos el catálogo con algunos datos de ejemplo
    }

    // Métodos

    /**
     * Este método carga el catálogo con algunos datos de ejemplo.
     */
    public void cargarCatalogo() {
        catalogo.add(new Coche("Fiesta", "Ford", 5, 10));
        catalogo.add(new Coche("Polo", "Volkswagen", 5, 12));
        catalogo.add(new Coche("Clio", "Renault", 5, 11));
        catalogo.add(new Coche("Corsa", "Opel", 5, 9));
        catalogo.add(new Coche("Mini", "Mini", 4, 15));
        catalogo.add(new Coche("500", "Fiat", 4, 14));
        catalogo.add(new Coche("Yaris", "Toyota", 4, 13));
        catalogo.add(new Coche("Picanto", "Kia", 4, 8));
        catalogo.add(new Coche("Smart", "Smart", 2, 10));
        catalogo.add(new Coche("Twingo", "Renault", 2, 9));
    }

    /**
     * Este método muestra el menú principal del programa y lee la opción elegida por el usuario.
     * @return La opción elegida por el usuario como un entero entre 1 y 3. Si se introduce un valor inválido se lanza una excepción.
     */
    public int mostrarMenu() {
        System.out.println("Bienvenido/a a la empresa de alquiler de coches");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Ver catálogo de coches disponibles");
        System.out.println("2. Reservar un coche");
        System.out.println("3. Salir");
        System.out.print("Introduce tu opción: ");
        
    // Usamos un bloque try-catch para capturar posibles excepciones al leer la opción
    try {
            int opcion = sc.nextInt(); // Leemos la opción por teclado
            sc.nextLine(); // Limpiamos el buffer del scanner

        // Validamos que la opción sea válida (entre 1 y 3)
            if (opcion <1 || opcion >3) {
                throw new IllegalArgumentException ("Opción inválida"); 
            }
            return opcion; // Devolvemos la opción si es válida
    } catch (Exception e) { 
        sc.nextLine(); // Limpiamos el buffer del scanner en caso de excepción
        throw e; // Relanzamos la excepción capturada
    }
        
    }

    /**
     * Este método muestra el catálogo de coches disponibles según el número de plazas solicitado por el usuario.
     * @param plazas El número de plazas solicitado por el usuario como un entero entre 2 y 5. Si se introduce un valor inválido se lanza una excepción.
     */
    public void mostrarCatalogo(int plazas) {
        
    // Validamos que las plazas sean válidas (entre 2 y 5)
    if (plazas <2 || plazas >5) {
            throw new IllegalArgumentException ("Número de plazas inválido"); 
    }

    System.out.println("\nCatálogo de coches disponibles con "+plazas+" plazas:");
    System.out.println("-----------------------------------------------");

    // Variable para comprobar si hay algún coche disponible con las plazas solicitadas
    boolean hayCoches = false;

    // Recorremos el catálogo de coches y mostramos los que coinciden con las plazas solicitadas
    for (Coche c : catalogo) {
        if (c.getPlazas() == plazas) {
        System.out.println(c); // Mostramos los datos del coche
        hayCoches = true; // Indicamos que hay al menos un coche disponible
        }
    }

    // Si no hay ningún coche disponible, mostramos un mensaje de aviso
    if (!hayCoches) {
        System.out.println("Lo sentimos, no hay ningún coche disponible con "+plazas+" plazas.");
    }
    }

    /**
     * Este método permite al usuario reservar un coche introduciendo el modelo deseado y la duración del alquiler.
     * El método informa al usuario del precio total del alquiler y le permite reservarlo introduciendo su nombre y DNI.
     * @param modelo El modelo de coche deseado por el usuario como una cadena de texto. Si se introduce un valor inválido se lanza una excepción.
     * @param horas La duración del alquiler en horas como un entero positivo. Si se introduce un valor inválido se lanza una excepción.
     */
    public void reservarCoche(String modelo, int horas) {

        // Validamos que las horas sean positivas
    if (horas <= 0) {
            throw new IllegalArgumentException ("Número de horas inválido"); 
    }

        // Variable para guardar el coche seleccionado por el usuario
    Coche seleccionado = null;

        // Recorremos el catálogo de coches y buscamos el que coincide con el modelo solicitado
    for (Coche c : catalogo) {
        if (c.getModelo().equalsIgnoreCase(modelo)) {
        seleccionado = c; // Guardamos el coche encontrado
        break; // Salimos del bucle
        }
    }

        // Si no encontramos ningún coche con ese modelo, mostramos un mensaje de error y salimos del método
    if (seleccionado == null) {
        System.out.println("Lo sentimos, no hay ningún coche disponible con ese modelo.");
        return;
    }

        // Calculamos el precio total del alquiler multiplicando las horas por el precio por hora del coche seleccionado
    double precioTotal = horas * seleccionado.getPrecio();

        // Mostramos los datos del coche seleccionado y el precio total del alquiler
    System.out.println("\nHas seleccionado el siguiente coche:");
    System.out.println(seleccionado);
    System.out.printf("El precio total del alquiler es: %.2f euros\n", precioTotal);

        // Preguntamos al usuario si quiere confirmar la reserva e introducir sus datos personales
    System.out.print("¿Quieres confirmar la reserva? (S/N): ");
    String respuesta = sc.nextLine();

        // Si la respuesta es afirmativa, pedimos al usuario su nombre y DNI y mostramos un mensaje de confirmación de la reserva
    if (respuesta.equalsIgnoreCase("S")) {
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu DNI: ");
        String dni = sc.nextLine();
        System.out.println("\nLa reserva ha sido realizada correctamente.");
        System.out.println("Los datos de la reserva son:");
        System.out.println("Nombre: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Modelo: "+seleccionado.getModelo());
        System.out.println("Horas: "+horas);
        System.out.printf("Precio total: %.2f euros\n", precioTotal);
    } else { 
            // Si la respuesta es negativa, mostramos un mensaje de cancelación de la reserva
            System.out.println("\nLa reserva ha sido cancelada.");
        }
    }

    /**
     * Este método ejecuta el programa principal que muestra el menú y llama a los métodos correspondientes según la opción elegida por el usuario.
     */
    public void ejecutarPrograma() {

    boolean salir = false; // Variable para controlar si se quiere salir o no del programa

    while (!salir) { 
            try { 
                int opcion = mostrarMenu(); // Mostramos el menú y leemos la opción

                switch(opcion) {
                    case 1: // Si la opción es 1, mostramos el catálogo de coches disponibles según las plazas solicitadas por el usuario
                        System.out.print("Introduce el número de plazas que deseas (2-5): ");
                        int plazas = sc.nextInt(); // Leemos las plazas por teclado
                        sc.nextLine(); // Limpiamos el buffer del scanner
                        mostrarCatalogo(plazas); // Mostramos el catálogo con las plazas solicitadas
                        break;
                    case 2: // Si la opción es 2, permitimos al usuario reservar un coche introduciendo el modelo y las horas de alquiler
                        System.out.print("Introduce el modelo de coche que deseas: ");
                        String modelo = sc.nextLine(); // Leemos el modelo por teclado
                        System.out.print("Introduce el número de horas que quieres alquilarlo: ");
                        int horas = sc.nextInt(); // Leemos las horas por teclado
                        sc.nextLine(); // Limpiamos el buffer del scanner
                        reservarCoche(modelo, horas); // Reservamos el coche con los datos introducidos
                        break;
                    case 3: // Si la opción es 3, salimos del programa y mostramos un mensaje de despedida
                        salir = true; 
            System.out.println("\nGracias por usar nuestro servicio. Hasta pronto.");
            break;
                }
            } catch (Exception e) { 
                System.out.println("\nHa ocurrido un error: "+e.getMessage()); 
        // Mostramos el mensaje de la excepción en caso de que se produzca algún error al leer o procesar los datos
            }
        }
    }

    /**
     * Este método crea una instancia de la clase EmpresaAlquiler y llama al método ejecutarPrograma para iniciar el programa principal.
     * @param args Los argumentos pasados por línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {
        EmpresaAlquiler empresa = new EmpresaAlquiler(); // Creamos una instancia de la clase EmpresaAlquiler
        empresa.ejecutarPrograma(); // Llamamos al método ejecutarPrograma para iniciar el programa principal
    }
}

/**
 * Esta clase representa un coche con sus datos básicos: modelo, marca, número de plazas y precio de alquiler por hora.
 */
class Coche {

    // Atributos
    private String modelo; // El modelo del coche (ej. Fiesta)
    private String marca; // La marca del coche (ej. Ford)
    private int plazas; // El número de plazas del coche (entre 2 y 5)
    private double precio; // El precio de alquiler por hora del coche (en euros)

    // Constructor

    /**
     * Este constructor crea un nuevo coche con los datos pasados como parámetros.
     * @param modelo El modelo del coche como una cadena de texto.
     * @param marca La marca del coche como una cadena de texto.
     * @param plazas El número de plazas del coche como un entero entre 2 y 5. Si se introduce un valor inválido se lanza una excepción.
     * @param precio El precio de alquiler por hora del coche como un número real positivo. Si se introduce un valor inválido se lanza una excepción.
     */
    public Coche(String modelo, String marca, int plazas, double precio) {
        this.modelo = modelo;
        this.marca = marca;

    // Validamos que las plazas sean válidas (entre 2 y 5)
    if (plazas <2 || plazas >5) {
            throw new IllegalArgumentException ("Número de plazas inválido"); 
    }
        this.plazas = plazas;

    // Validamos que el precio sea positivo
    if (precio <=0) {
            throw new IllegalArgumentException ("Precio inválido"); 
    }
        this.precio = precio;
    }
// Métodos

    /**
     * Este método devuelve el modelo del coche.
     * @return El modelo del coche como una cadena de texto.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Este método devuelve la marca del coche.
     * @return La marca del coche como una cadena de texto.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Este método devuelve el número de plazas del coche.
     * @return El número de plazas del coche como un entero entre 2 y 5.
     */
    public int getPlazas() {
        return plazas;
    }

    /**
     * Este método devuelve el precio de alquiler por hora del coche.
     * @return El precio de alquiler por hora del coche como un número real positivo (en euros).
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Este método devuelve una representación textual de los datos del coche con el siguiente formato:
     * Modelo: [modelo] - Marca: [marca] - Plazas: [plazas] - Precio/hora: [precio] euros
     * @return Una cadena de texto con los datos del coche.
     */
    public String toString() {
        return "Modelo: "+modelo+" - Marca: "+marca+" - Plazas: "+plazas+" - Precio/hora: "+precio+" euros";
    }
}