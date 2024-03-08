package U10Swing;

import java.awt.EventQueue;
import javax.swing.*;

/**
 * Ejemplo de uso de componentes Swing
 * Envia el codigo que se ejecuta dentro del metodo run() a la cola de eventos de swing.
 * El codigo definido dentro de run() será ejecutado por el hilo de despacho de sucesos gráficos.
 */
public class EjemploSwing2_3EVA extends JFrame {
 
    private JPanel contentPane;
    private JTextField textField;
 
    public static void main(String[] args) {
        //clase anónima que se declara dentro de otra expresión e implementa la interfaz Runnable
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EjemploSwing2_3EVA frame = new EjemploSwing2_3EVA();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public EjemploSwing2_3EVA() {
        //Añade un titulo, no es estrictamente necesario
                setTitle("Ejemplo de ventana");
 
                /*
                 * Coordenadas x y de la ventana y su altura y longitud,
                 * si no lo indicamos aparecera una ventana muy pequeña
                 */
                setBounds(400, 200, 607, 448);
 
                /*
                 * Indica que cuando se cierre la ventana se acaba la aplicacion,
                 * si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
                 */
                setDefaultCloseOperation(EXIT_ON_CLOSE);
 
                //Hace visible la ventana, si no lo hacemos no veremos la aplicacion
                setVisible(true);
 
                //Creamos el panel
                contentPane =new JPanel();
 
                //Indicamos su diseño
                contentPane.setLayout(null);
 
                //asigno el pannel a la ventana
                setContentPane(contentPane);
 
                //Creacion de componentes
 
                //Etiqueta
                JLabel etiqueta=new JLabel("¡Hola mundo!");
                etiqueta.setBounds(60, 20, 100, 20);
                contentPane.add(etiqueta);
 
                //Campo de texto
                textField = new JTextField();
                textField.setBounds(43, 67, 86, 26);
                contentPane.add(textField);
 
                //Boton
                JButton btnPulsame = new JButton("Pulsame");
                btnPulsame.setBounds(43, 133, 89, 23);
                contentPane.add(btnPulsame);
 
                //Boton de radio
                JRadioButton rdbtnOpcion= new JRadioButton("Opcion 1", true);
                rdbtnOpcion.setBounds(43, 194, 109, 23);
                contentPane.add(rdbtnOpcion);
 
                JRadioButton rdbtnOpcion_1 = new JRadioButton("Opcion 2", false);
                rdbtnOpcion_1.setBounds(43, 220, 109, 23);
                contentPane.add(rdbtnOpcion_1);
 
                JRadioButton rdbtnOpcion_2 = new JRadioButton("Opcion 3", false);
                rdbtnOpcion_2.setBounds(43, 246, 109, 23);
                contentPane.add(rdbtnOpcion_2);
 
                //Agrupamos los botnones de radio
                ButtonGroup bgroup = new ButtonGroup();
                bgroup.add(rdbtnOpcion);
                bgroup.add(rdbtnOpcion_1);
                bgroup.add(rdbtnOpcion_2);
 
                //Checkboxes
                JCheckBox chckbxOpcion = new JCheckBox("Opcion1", true);
                chckbxOpcion.setBounds(43, 305, 97, 23);
                contentPane.add(chckbxOpcion);
 
                JCheckBox chckbxNewCheckBox = new JCheckBox("Opcion 2", true);
                chckbxNewCheckBox.setBounds(43, 325, 97, 23);
                contentPane.add(chckbxNewCheckBox);
 
                JCheckBox chckbxOpcion_1 = new JCheckBox("Opcion3", false);
                chckbxOpcion_1.setBounds(43, 346, 97, 23);
                contentPane.add(chckbxOpcion_1);
 
                //TextArea
                JTextArea textArea = new JTextArea("pruebaaaa");
                textArea.setBounds(171, 18, 141, 117);
                textArea.setWrapStyleWord(true);
                textArea.setLineWrap(true);
                contentPane.add(textArea);
 
                //Scrollpane asociado a textarea
                JScrollPane scroll = new JScrollPane(textArea); //Objeto
                scroll.setBounds(189, 18, 141, 117); //Misma coordenadas y tamaño que el objeto
                contentPane.add(scroll);
 
                //Campo de password
                JPasswordField pwd = new JPasswordField("fernando");
                pwd.setBounds(189, 171, 139, 20);
                contentPane.add(pwd);
 
                //Menu de opciones
                JComboBox comboBox = new JComboBox<>();
                comboBox.setBounds(189, 221, 141, 22);
                contentPane.add(comboBox);
 
                //Añadimos opciones
                comboBox.addItem("Ainara");
				comboBox.addItem("Jon");
				comboBox.addItem("Felix");
 
                //Boton interruptor
                JToggleButton tglbtnNewToggleButton = new JToggleButton("Interruptor", true);
                tglbtnNewToggleButton.setBounds(189, 291, 121, 23);
                contentPane.add(tglbtnNewToggleButton);
 
                //Contador
                JSpinner spinner = new JSpinner();
                spinner.setBounds(371, 20, 29, 20);
                contentPane.add(spinner);
 
                //Arrays de String
                String pelis[]={"Star wars: la venganza de los siths", "El señor de los anillos: el retorno del rey", "Guerra mundial Z", "Revolution", "007: Todo o Nada"};
 
                //Lista
                JList list = new JList<>(pelis);
                list.setBounds(371, 72, 86, 80);
                contentPane.add(list);
 
                //Scroll asociado a la lista
                JScrollPane scroll2 = new JScrollPane(list); //Objeto
                scroll2.setBounds(371, 72, 86, 80); //Misma coordenadas y tamaño que el objeto
                contentPane.add(scroll2);
    }
}