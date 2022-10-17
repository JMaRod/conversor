/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.ventanas;

/**
 *
 * @author JMaRod
 */

import com.jmr.MetodosNumeros.ConversorDeStrings;
import com.jmr.operaciones.TemperaturasOp;

public class Temperaturas extends javax.swing.JFrame
{

    TemperaturasOp temperaturasOp = new TemperaturasOp();
    /**
     * Creates new form Distancias
     */
    public Temperaturas()
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabelTemperaturasTitulo = new javax.swing.JLabel();
        jButtonTemperaturasRetorno = new javax.swing.JButton();
        jLabelTemperaturasCentigrados = new javax.swing.JLabel();
        jTextFieldTemperaturasCentigrados = new javax.swing.JTextField();
        jLabelTemperaturaKelvin = new javax.swing.JLabel();
        jTextFieldTemperaturaKelvin = new javax.swing.JTextField();
        jLabelTemperaturasFahrenheit = new javax.swing.JLabel();
        jTextFieldTemperaturaFahrenheit = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneTemperaturaInstrucciones = new javax.swing.JTextPane();
        jLabelTemperaturasFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTemperaturasTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTemperaturasTitulo.setText("Temperaturas");
        getContentPane().add(jLabelTemperaturasTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        jButtonTemperaturasRetorno.setText("Regresar");
        jButtonTemperaturasRetorno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTemperaturasRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTemperaturasRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabelTemperaturasCentigrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperaturasCentigrados.setText("Centigrados");
        getContentPane().add(jLabelTemperaturasCentigrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 110, 20));

        jTextFieldTemperaturasCentigrados.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldTemperaturasCentigradosActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTemperaturasCentigrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 120, -1));

        jLabelTemperaturaKelvin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperaturaKelvin.setText("Kelvin");
        getContentPane().add(jLabelTemperaturaKelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 80, 20));

        jTextFieldTemperaturaKelvin.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldTemperaturaKelvinActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTemperaturaKelvin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 120, -1));

        jLabelTemperaturasFahrenheit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperaturasFahrenheit.setText("Fahrenheit");
        getContentPane().add(jLabelTemperaturasFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 90, 20));

        jTextFieldTemperaturaFahrenheit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldTemperaturaFahrenheitActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTemperaturaFahrenheit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 120, -1));

        jTextPaneTemperaturaInstrucciones.setEditable(false);
        jTextPaneTemperaturaInstrucciones.setText("Escriba en la casilla de origen el valor a converitr,\nDespues presione Enter");
        jTextPaneTemperaturaInstrucciones.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextPaneTemperaturaInstrucciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 70));

        jLabelTemperaturasFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelTemperaturasFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTemperaturasRetornoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonTemperaturasRetornoActionPerformed
    {//GEN-HEADEREND:event_jButtonTemperaturasRetornoActionPerformed
        Intro intro = new Intro();
        this.setVisible(false);
        intro.setVisible(true);
    }//GEN-LAST:event_jButtonTemperaturasRetornoActionPerformed

    private void jTextFieldTemperaturaKelvinActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldTemperaturaKelvinActionPerformed
    {//GEN-HEADEREND:event_jTextFieldTemperaturaKelvinActionPerformed
        double valor = ConversorDeStrings.revisarNumeroConCero(evt.getActionCommand());
            imprimirResultados(valor, "kelvin");
    }//GEN-LAST:event_jTextFieldTemperaturaKelvinActionPerformed

    private void jTextFieldTemperaturasCentigradosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldTemperaturasCentigradosActionPerformed
    {//GEN-HEADEREND:event_jTextFieldTemperaturasCentigradosActionPerformed
        double valor = ConversorDeStrings.revisarNumeroConCero(evt.getActionCommand());
        imprimirResultados(valor, "centigrados");
    }//GEN-LAST:event_jTextFieldTemperaturasCentigradosActionPerformed

    private void jTextFieldTemperaturaFahrenheitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldTemperaturaFahrenheitActionPerformed
    {//GEN-HEADEREND:event_jTextFieldTemperaturaFahrenheitActionPerformed
        double valor = ConversorDeStrings.revisarNumeroConCero(evt.getActionCommand());
        imprimirResultados(valor, "fahrenheit");
    }//GEN-LAST:event_jTextFieldTemperaturaFahrenheitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTemperaturasRetorno;
    private javax.swing.JLabel jLabelTemperaturaKelvin;
    private javax.swing.JLabel jLabelTemperaturasCentigrados;
    private javax.swing.JLabel jLabelTemperaturasFahrenheit;
    private javax.swing.JLabel jLabelTemperaturasFondo;
    private javax.swing.JLabel jLabelTemperaturasTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldTemperaturaFahrenheit;
    private javax.swing.JTextField jTextFieldTemperaturaKelvin;
    private javax.swing.JTextField jTextFieldTemperaturasCentigrados;
    private javax.swing.JTextPane jTextPaneTemperaturaInstrucciones;
    // End of variables declaration//GEN-END:variables

    private void imprimirResultados(double valor, String origen)
    {
        if (valor >= 0 ){
            if ("centigrados".equals(origen)){
                jTextFieldTemperaturaKelvin.setText(String.valueOf(temperaturasOp.centigradosKelvin(valor)));
                jTextFieldTemperaturaFahrenheit.setText(String.valueOf(temperaturasOp.centgradosFahrenheit(valor)));
            }
            else if ("kelvin".equals(origen)){
                jTextFieldTemperaturasCentigrados.setText(String.valueOf(temperaturasOp.kelvinCentigrados(valor)));
                jTextFieldTemperaturaFahrenheit.setText(String.valueOf(temperaturasOp.kelvinFahrenheit(valor)));
            }
                else if ("fahrenheit".equals(origen)){
                jTextFieldTemperaturasCentigrados.setText(String.valueOf(temperaturasOp.fahrenheitCentigrados(valor)));
                jTextFieldTemperaturaKelvin.setText(String.valueOf(temperaturasOp.fahrenheitKelvin(valor)));
            }
        }
        else{
            jTextFieldTemperaturaFahrenheit.setText("");
            jTextFieldTemperaturaKelvin.setText("");
            jTextFieldTemperaturasCentigrados.setText("");
        }
        
    }
}