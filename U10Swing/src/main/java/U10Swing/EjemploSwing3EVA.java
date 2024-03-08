package U10Swing;

import javax.swing.*;
 
public class EjemploSwing3EVA extends JFrame{
 
    /**
     * Panel de la aplicacion
     */
    private JPanel contentPane;
    public EjemploSwing3EVA(){
 
        //Añade un titulo, no es estrictamente necesario
        setTitle("Titulo de la ventana");
 
        /*
         * Coordenadas x y de la aplicacion y su altura y longitud,
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
		
JLabel etiqueta=new JLabel("¡Hola mundo!");
etiqueta.setBounds(60, 20, 100, 20);
contentPane.add(etiqueta);

//textField = new JTextField();
//textField.setBounds(43, 67, 86, 26);
//contentPane.add(textField);

JButton btnPulsame = new JButton("Pulsame");
btnPulsame.setBounds(43, 133, 89, 23);
contentPane.add(btnPulsame);

JRadioButton rdbtnOpcion= new JRadioButton("Opcion 1", true);
                rdbtnOpcion.setBounds(43, 194, 109, 23);
                contentPane.add(rdbtnOpcion);
 
                JRadioButton rdbtnOpcion_1 = new JRadioButton("Opcion 2", false);
                rdbtnOpcion_1.setBounds(43, 220, 109, 23);
                contentPane.add(rdbtnOpcion_1);
 
                JRadioButton rdbtnOpcion_2 = new JRadioButton("Opcion 3", false);
                rdbtnOpcion_2.setBounds(43, 246, 109, 23);
                contentPane.add(rdbtnOpcion_2);
 
                ButtonGroup bgroup = new ButtonGroup();
                bgroup.add(rdbtnOpcion);
                bgroup.add(rdbtnOpcion_1);
                bgroup.add(rdbtnOpcion_2);

JCheckBox chckbxOpcion = new JCheckBox("Opcion1", true);
chckbxOpcion.setBounds(43, 305, 97, 23);
contentPane.add(chckbxOpcion);
 
JCheckBox chckbxNewCheckBox = new JCheckBox("Opcion 2", true);
chckbxNewCheckBox.setBounds(43, 325, 97, 23);
contentPane.add(chckbxNewCheckBox);
 
JCheckBox chckbxOpcion_1 = new JCheckBox("Opcion3", false);
chckbxOpcion_1.setBounds(43, 346, 97, 23);
contentPane.add(chckbxOpcion_1);
 
 JTextArea textArea = new JTextArea("prueba");
textArea.setBounds(189, 18, 141, 117);
textArea.setWrapStyleWord(true);
textArea.setLineWrap(true);
contentPane.add(textArea);

JScrollPane scroll = new JScrollPane(textArea); //Objeto
scroll.setBounds(189, 18, 141, 117); //Misma coordenadas y tamaño que el objeto
contentPane.add(scroll);

JPasswordField pwd = new JPasswordField("fernando");
pwd.setBounds(189, 171, 139, 20);
contentPane.add(pwd);
JComboBox comboBox = new JComboBox<>();
comboBox.setBounds(189, 221, 141, 22);
contentPane.add(comboBox);
 
comboBox.addItem("Ainara");
comboBox.addItem("Jon");
comboBox.addItem("Felix");

JToggleButton tglbtnNewToggleButton = new JToggleButton("Interruptor", true);
tglbtnNewToggleButton.setBounds(189, 291, 121, 23);
contentPane.add(tglbtnNewToggleButton);

JSpinner spinner = new JSpinner();
spinner.setBounds(371, 20, 29, 20);
contentPane.add(spinner);

//Arrays de String
String pelis[]={"Star wars: la venganza de los siths", "El señor de los anillos: el retorno del rey", "Guerra mundial Z", "Revolution", "007: Todo o Nada"};
 
JList list = new JList<>(pelis);
list.setBounds(371, 72, 86, 80);
contentPane.add(list);

    }
 
    public static void main(String[] args) {
        EjemploSwing3EVA ventana=new EjemploSwing3EVA();
 
    }
 
}