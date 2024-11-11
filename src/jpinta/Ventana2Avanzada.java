/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jpinta;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Sergio Teacher
 */
public class Ventana2Avanzada extends javax.swing.JFrame {

private ImageIcon miIcono;
private Image fotoTmp;
private Image fotoEscalada;

    /**
     * Creates new form Ventana2Avanzada
     */
    public Ventana2Avanzada() {
        initComponents();
        System.out.println("Iniciando Ventana Avanzada");
        setBounds(0,0,500,400);
        this.setLocationRelativeTo(null);

        miIcono = new ImageIcon(getClass().getResource("/jpinta/imagenes/miniCat.png"));
        txtFoto.setIcon(miIcono);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupOption = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        optionEscala = new javax.swing.JRadioButton();
        jSliderEscala = new javax.swing.JSlider();
        optionValores = new javax.swing.JRadioButton();
        jTextX = new javax.swing.JTextField();
        jTextY = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        txtFoto = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroupOption.add(optionEscala);
        optionEscala.setText("%");
        optionEscala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionEscalaActionPerformed(evt);
            }
        });
        jPanel1.add(optionEscala);

        jSliderEscala.setMinimum(10);
        jSliderEscala.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderEscalaStateChanged(evt);
            }
        });
        jPanel1.add(jSliderEscala);

        buttonGroupOption.add(optionValores);
        optionValores.setText("Ok");
        optionValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionValoresActionPerformed(evt);
            }
        });
        jPanel1.add(optionValores);

        jTextX.setColumns(3);
        jPanel1.add(jTextX);

        jTextY.setColumns(3);
        jPanel1.add(jTextY);

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel1.add(btnOK);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        txtFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(txtFoto, java.awt.BorderLayout.CENTER);

        txtEstado.setText("Tamaño:");
        getContentPane().add(txtEstado, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionEscalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionEscalaActionPerformed
        System.out.println("Activando el control de ESCALA");
        jSliderEscala.setEnabled(true);
        jSliderEscala.setValue(100);
        jTextX.setEnabled(false);
        jTextY.setEnabled(false);
        btnOK.setEnabled(false);

        Estado(jSliderEscala.getValue() + "%");

    }//GEN-LAST:event_optionEscalaActionPerformed

    private void optionValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionValoresActionPerformed
        System.out.println("Activando el control por VALOR");
        jSliderEscala.setEnabled(false);
        jTextX.setEnabled(true);
        jTextY.setEnabled(true);
        jTextX.setText("400");
        jTextY.setText("300");
        btnOK.setEnabled(true);

        Estado("X: " + jTextX.getText() + "  Y: " + jTextY.getText());
    }//GEN-LAST:event_optionValoresActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        int x,y;
        x = ConvierteLimitado(jTextX.getText());
        y = ConvierteLimitado(jTextY.getText());
        Estado("X: " + x + "  Y: " + y);

        CargaFoto(x,y);
    }//GEN-LAST:event_btnOKActionPerformed

    private void jSliderEscalaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderEscalaStateChanged
        Estado(jSliderEscala.getValue() + "%");
        CargaFoto(jSliderEscala.getValue());
    }//GEN-LAST:event_jSliderEscalaStateChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.ButtonGroup buttonGroupOption;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSliderEscala;
    private javax.swing.JTextField jTextX;
    private javax.swing.JTextField jTextY;
    private javax.swing.JRadioButton optionEscala;
    private javax.swing.JRadioButton optionValores;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFoto;
    // End of variables declaration//GEN-END:variables

public void CargaFoto(int WIDTH, int HEIGHT){
miIcono = new ImageIcon(getClass().getResource("/jpinta/imagenes/white-tiger-1513723_640.jpg"));
fotoTmp = miIcono.getImage();
fotoEscalada = fotoTmp.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_SMOOTH);

miIcono = new ImageIcon(fotoEscalada);
txtFoto.setIcon(miIcono);
//txtFoto.repaint();

}
public void CargaFoto(int PORCENTAJE){
int anchoOriginal, altoOriginal, anchoFinal, altoFinal;
miIcono = new ImageIcon(getClass().getResource("/jpinta/imagenes/white-tiger-1513723_640.jpg"));
fotoTmp = miIcono.getImage();
anchoOriginal = miIcono.getIconWidth();
altoOriginal = miIcono.getIconHeight();
anchoFinal = (int)( (((double) anchoOriginal) * PORCENTAJE)/100 );
altoFinal = (int)( (((double) altoOriginal) * PORCENTAJE)/100 );

fotoEscalada = fotoTmp.getScaledInstance(anchoFinal, altoFinal, Image.SCALE_SMOOTH);

miIcono = new ImageIcon(fotoEscalada);
txtFoto.setIcon(miIcono);
//txtFoto.repaint();

}


public void Estado(String sms){
    System.out.println("Tamaño: " + sms);
    txtEstado.setText("Tamaño: " + sms);
}

public int ConvierteLimitado(String campo){
int t=0;
try{
t = Integer.parseInt(campo) ;
}catch(NumberFormatException e){
    System.out.println("e:" + e.getMessage());
}
    System.out.println("salida t inicial " + t);
if ( t<10 ){
t=10;
}
    System.out.println("salida t final " + t);
    return t;
}

}