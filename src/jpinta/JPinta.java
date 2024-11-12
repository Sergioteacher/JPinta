/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpinta;

import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Teacher
 */
public class JPinta {


    /**
     * Es el método estático principal
     * @param args es una matriz de String donde se cargan los parámetros que se pasan al programa.
     */
    public static void main(String[] args) {
        System.out.println("Iniciando JPinta ...");
        System.out.println("Se han pasado " + args.length + " argumentos.");

        int optionT=0;
        String[] optionesVentana={"Básica", "Avanzada","Visor","Redimensiona"};
        optionT = JOptionPane.showOptionDialog(null, "Control de presentación de imágenes", "Seleccione VENTANA de arranque", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionesVentana, "Básica");

//sólo creo el objto que necesito.
        if( optionT == 0 ){
            Ventana1Basica Ventana1 = new Ventana1Basica();
            Ventana1.setVisible(true);
        }else if( optionT == 1 ){
            Ventana2Avanzada Ventana2 = new Ventana2Avanzada();
            Ventana2.setVisible(true);
        }else if( optionT == 2 ){
            Ventana3Visor Ventana3 = new Ventana3Visor();
            Ventana3.setVisible(true);
        }else if( optionT == 3 ){
                    Ventana4Redimensiona Ventana4 = new Ventana4Redimensiona();
                    Ventana4.setVisible(true);
        }else{
            System.out.println("Descartado lanzar alguna ventana, se sale ...");
        }




    }
    
}
