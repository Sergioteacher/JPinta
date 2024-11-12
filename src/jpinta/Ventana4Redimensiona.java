/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jpinta;

import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio Teacher
 */
public class Ventana4Redimensiona extends javax.swing.JFrame implements ComponentListener {

private ImageIcon miIcono;
private Image fotoTmp;
private Image fotoEscalada;

    /**
     * Creates new form Ventana4Redimensiona
     */
    public Ventana4Redimensiona() {
        initComponents();
        System.out.println("Iniciando Ventana Redimensiona");
        setBounds(0,0,400,300);
        this.setLocationRelativeTo(null);

        this.addComponentListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEstado = new javax.swing.JLabel();
        txtFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana4 Redimensiona");

        txtEstado.setText("Tamaño:");
        getContentPane().add(txtEstado, java.awt.BorderLayout.PAGE_END);

        txtFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFoto, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFoto;
    // End of variables declaration//GEN-END:variables


public void Estado(String sms){
    System.out.println("Tamaño: " + sms);
    txtEstado.setText("Tamaño: " + sms);
}

public void CargaFoto(int WIDTH, int HEIGHT){
miIcono = new ImageIcon(getClass().getResource("/jpinta/imagenes/white-tiger-1513723_640.jpg"));
fotoTmp = miIcono.getImage();
fotoEscalada = fotoTmp.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);

miIcono = new ImageIcon(fotoEscalada);
txtFoto.setIcon(miIcono);
//txtFoto.repaint();

}
    public void componentResized(ComponentEvent e){
        int x,y;
        x = this.getWidth();
        y = this.getHeight();
        Estado("Tamaño: " + x + " " + y);

        CargaFoto(x,y);
    }

    public void componentMoved(ComponentEvent e){
    }

    public void componentShown(ComponentEvent e){
    }


    public void componentHidden(ComponentEvent e){
    }

}

