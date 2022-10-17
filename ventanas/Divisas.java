/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.ventanas;

import com.jmr.operaciones.DivisasOp;
import static com.jmr.MetodosNumeros.ConversorDeStrings.revisarNumeroSinCero;

/**
 *
 * @author JMaRod
 */
public class Divisas extends javax.swing.JFrame
{
    final DivisasOp divisasOp = new DivisasOp();
    //variable para saber si se va a convertir divisas (true) o se van a 
    //guardar los valores de conversion(false)
    boolean operacion;

    /**
     * Creates new form Conversiones
     */
    public Divisas()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        iniciarOperaciones();
        this.operacion = true;
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

        buttonGroupDivisas = new javax.swing.ButtonGroup();
        jLabelDivisasTitulo = new javax.swing.JLabel();
        jButtonDivisasRetorno = new javax.swing.JButton();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelResultadoDolar = new javax.swing.JLabel();
        jTextFieldResultadoDolar = new javax.swing.JTextField();
        jLabelResultadoEuro = new javax.swing.JLabel();
        jTextFieldResultadoEuro = new javax.swing.JTextField();
        jLabelResultadoLibra = new javax.swing.JLabel();
        jTextFieldResultadoLibra = new javax.swing.JTextField();
        jLabelResultadoYen = new javax.swing.JLabel();
        jTextFieldResultadoYen = new javax.swing.JTextField();
        jLabelResultadoWon = new javax.swing.JLabel();
        jTextFieldResultadoWon = new javax.swing.JTextField();
        jRadioButtonDivisasIngresar = new javax.swing.JRadioButton();
        jRadioButtonDivisasCalcular = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDivisasInstrucciones = new javax.swing.JTextPane();
        jLabelConversionesFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDivisasTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelDivisasTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDivisasTitulo.setText("Divisas");
        getContentPane().add(jLabelDivisasTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 120, 30));

        jButtonDivisasRetorno.setText("Regresar");
        jButtonDivisasRetorno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonDivisasRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDivisasRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabelCantidad.setText("Mx");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 30, 20));

        jTextFieldCantidad.setText("1");
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        jLabelResultadoDolar.setText("Dolar");
        getContentPane().add(jLabelResultadoDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 30, 20));

        jTextFieldResultadoDolar.setEditable(false);
        jTextFieldResultadoDolar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldResultadoDolarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldResultadoDolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, -1));

        jLabelResultadoEuro.setText("Euro");
        getContentPane().add(jLabelResultadoEuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 30, 20));

        jTextFieldResultadoEuro.setEditable(false);
        jTextFieldResultadoEuro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldResultadoEuroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldResultadoEuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));

        jLabelResultadoLibra.setText("Libra");
        getContentPane().add(jLabelResultadoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 30, 20));

        jTextFieldResultadoLibra.setEditable(false);
        jTextFieldResultadoLibra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldResultadoLibraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldResultadoLibra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 100, -1));

        jLabelResultadoYen.setText("Yen");
        getContentPane().add(jLabelResultadoYen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 30, 20));

        jTextFieldResultadoYen.setEditable(false);
        jTextFieldResultadoYen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldResultadoYenActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldResultadoYen, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, -1));

        jLabelResultadoWon.setText("Won");
        getContentPane().add(jLabelResultadoWon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 30, 20));

        jTextFieldResultadoWon.setEditable(false);
        jTextFieldResultadoWon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldResultadoWonActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldResultadoWon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 100, -1));

        buttonGroupDivisas.add(jRadioButtonDivisasIngresar);
        jRadioButtonDivisasIngresar.setText("Tipo de cambio");
        jRadioButtonDivisasIngresar.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jRadioButtonDivisasIngresarItemStateChanged(evt);
            }
        });
        jRadioButtonDivisasIngresar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jRadioButtonDivisasIngresarMouseClicked(evt);
            }
        });
        jRadioButtonDivisasIngresar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonDivisasIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonDivisasIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        buttonGroupDivisas.add(jRadioButtonDivisasCalcular);
        jRadioButtonDivisasCalcular.setSelected(true);
        jRadioButtonDivisasCalcular.setText("Calcular");
        jRadioButtonDivisasCalcular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButtonDivisasCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonDivisasCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jTextPaneDivisasInstrucciones.setEditable(false);
        jTextPaneDivisasInstrucciones.setText("Para Convertir Mx a las demas divisas elija la opcion de \"Calcular\" e ingrese una cantidad en la casilla Mx, despues oprima Enter.\n\nPara guardar nuevos valores de conversiones seleccione \"Tipo de Cambio\", llene las casillas que quiera cambiar y despues oprima Enter.");
        jTextPaneDivisasInstrucciones.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextPaneDivisasInstrucciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 380, 100));

        jLabelConversionesFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelConversionesFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDivisasRetornoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDivisasRetornoActionPerformed
    {//GEN-HEADEREND:event_jButtonDivisasRetornoActionPerformed
        Intro intro = new Intro();
        this.setVisible(false);
        intro.setVisible(true);
    }//GEN-LAST:event_jButtonDivisasRetornoActionPerformed

    private void jTextFieldResultadoEuroActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldResultadoEuroActionPerformed
    {//GEN-HEADEREND:event_jTextFieldResultadoEuroActionPerformed
        float valor = revisarNumeroSinCero(evt.getActionCommand());
        if(valor != 0.0){
            divisasOp.setEuro(valor);
        } 
        jTextFieldResultadoEuro.setText(String.valueOf(divisasOp.getEuro()));
        Mensajes.numeroGuardado();
    }//GEN-LAST:event_jTextFieldResultadoEuroActionPerformed

    private void jTextFieldResultadoYenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldResultadoYenActionPerformed
    {//GEN-HEADEREND:event_jTextFieldResultadoYenActionPerformed
        float valor = revisarNumeroSinCero(evt.getActionCommand());
        if(valor != 0.0){
            divisasOp.setYen(valor);
        } 
        Mensajes.numeroGuardado();
        jTextFieldResultadoYen.setText(String.valueOf(divisasOp.getYen()));
    }//GEN-LAST:event_jTextFieldResultadoYenActionPerformed

    private void jTextFieldResultadoDolarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldResultadoDolarActionPerformed
    {//GEN-HEADEREND:event_jTextFieldResultadoDolarActionPerformed
        float valor = revisarNumeroSinCero(evt.getActionCommand());
        if(valor != 0.0){
            divisasOp.setDolar(valor);
        } 
        Mensajes.numeroGuardado();
        jTextFieldResultadoDolar.setText(String.valueOf(divisasOp.getDolar()));
    }//GEN-LAST:event_jTextFieldResultadoDolarActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldCantidadActionPerformed
    {//GEN-HEADEREND:event_jTextFieldCantidadActionPerformed
        float valor = revisarNumeroSinCero(evt.getActionCommand());
        imprimirResulatdos(valor);
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed

    private void jRadioButtonDivisasCalcularActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonDivisasCalcularActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonDivisasCalcularActionPerformed
        jTextFieldCantidad.setText("");
        jTextFieldResultadoDolar.setText(String.valueOf(divisasOp.getDolar()));
        jTextFieldResultadoEuro.setText(String.valueOf(divisasOp.getEuro()));
        jTextFieldResultadoLibra.setText(String.valueOf(divisasOp.getLibra()));
        jTextFieldResultadoYen.setText(String.valueOf(divisasOp.getYen()));
        jTextFieldResultadoWon.setText(String.valueOf(divisasOp.getWon()));
    }//GEN-LAST:event_jRadioButtonDivisasCalcularActionPerformed

    private void jRadioButtonDivisasIngresarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jRadioButtonDivisasIngresarMouseClicked
    {//GEN-HEADEREND:event_jRadioButtonDivisasIngresarMouseClicked
        jTextFieldCantidad.setText("");
        jTextFieldResultadoDolar.setText(String.valueOf(divisasOp.getDolar()));
        jTextFieldResultadoEuro.setText(String.valueOf(divisasOp.getEuro()));
        jTextFieldResultadoLibra.setText(String.valueOf(divisasOp.getLibra()));
        jTextFieldResultadoYen.setText(String.valueOf(divisasOp.getYen()));
        jTextFieldResultadoWon.setText(String.valueOf(divisasOp.getWon()));
    }//GEN-LAST:event_jRadioButtonDivisasIngresarMouseClicked

    private void jRadioButtonDivisasIngresarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButtonDivisasIngresarActionPerformed
    {//GEN-HEADEREND:event_jRadioButtonDivisasIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDivisasIngresarActionPerformed

    private void jRadioButtonDivisasIngresarItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jRadioButtonDivisasIngresarItemStateChanged
    {//GEN-HEADEREND:event_jRadioButtonDivisasIngresarItemStateChanged
        if(evt.getStateChange() == 2)
            ponerEditable(false);
        else if(evt.getStateChange() == 1)
            ponerEditable(true);
    }//GEN-LAST:event_jRadioButtonDivisasIngresarItemStateChanged

    private void jTextFieldResultadoLibraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldResultadoLibraActionPerformed
    {//GEN-HEADEREND:event_jTextFieldResultadoLibraActionPerformed
        float valor = revisarNumeroSinCero(evt.getActionCommand());
        if(valor != 0.0){
            divisasOp.setLibra(valor);
        }
        Mensajes.numeroGuardado();
        jTextFieldResultadoLibra.setText(String.valueOf(divisasOp.getLibra()));
    }//GEN-LAST:event_jTextFieldResultadoLibraActionPerformed

    private void jTextFieldResultadoWonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldResultadoWonActionPerformed
    {//GEN-HEADEREND:event_jTextFieldResultadoWonActionPerformed
        float valor = revisarNumeroSinCero(evt.getActionCommand());
        if(valor != 0.0){
            divisasOp.setWon(valor);
        } 
        Mensajes.numeroGuardado();
        jTextFieldResultadoWon.setText(String.valueOf(divisasOp.getWon()));
    }//GEN-LAST:event_jTextFieldResultadoWonActionPerformed

    private void ponerEditable(boolean editable){
        if (!editable){
            jTextFieldCantidad.setEditable(true);
            jTextFieldResultadoDolar.setEditable(false);
            jTextFieldResultadoEuro.setEditable(false);
            jTextFieldResultadoLibra.setEditable(false);
            jTextFieldResultadoYen.setEditable(false);
            jTextFieldResultadoWon.setEditable(false);
        }else{
            jTextFieldCantidad.setEditable(false);
            jTextFieldResultadoDolar.setEditable(true);
            jTextFieldResultadoEuro.setEditable(true);
            jTextFieldResultadoLibra.setEditable(true);
            jTextFieldResultadoYen.setEditable(true);
            jTextFieldResultadoWon.setEditable(true);
        }
    }
    private void iniciarOperaciones(){
        jTextFieldResultadoDolar.setText(String.valueOf(divisasOp.getDolar()));
        jTextFieldResultadoEuro.setText(String.valueOf(divisasOp.getEuro()));
        jTextFieldResultadoLibra.setText(String.valueOf(divisasOp.getLibra()));
        jTextFieldResultadoYen.setText(String.valueOf(divisasOp.getYen()));
        jTextFieldResultadoWon.setText(String.valueOf(divisasOp.getWon()));
    };
    
    private void imprimirResulatdos(float valor){
        jTextFieldResultadoDolar.setText(String.valueOf(divisasOp.mxDolar(valor)));
        jTextFieldResultadoEuro.setText(String.valueOf(divisasOp.mxEuro(valor)));
        jTextFieldResultadoLibra.setText(String.valueOf(divisasOp.mxLibra(valor)));
        jTextFieldResultadoYen.setText(String.valueOf(divisasOp.mxYen(valor)));
        jTextFieldResultadoWon.setText(String.valueOf(divisasOp.mxWon(valor)));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDivisas;
    private javax.swing.JButton jButtonDivisasRetorno;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelConversionesFondo;
    private javax.swing.JLabel jLabelDivisasTitulo;
    private javax.swing.JLabel jLabelResultadoDolar;
    private javax.swing.JLabel jLabelResultadoEuro;
    private javax.swing.JLabel jLabelResultadoLibra;
    private javax.swing.JLabel jLabelResultadoWon;
    private javax.swing.JLabel jLabelResultadoYen;
    private javax.swing.JRadioButton jRadioButtonDivisasCalcular;
    private javax.swing.JRadioButton jRadioButtonDivisasIngresar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldResultadoDolar;
    private javax.swing.JTextField jTextFieldResultadoEuro;
    private javax.swing.JTextField jTextFieldResultadoLibra;
    private javax.swing.JTextField jTextFieldResultadoWon;
    private javax.swing.JTextField jTextFieldResultadoYen;
    private javax.swing.JTextPane jTextPaneDivisasInstrucciones;
    // End of variables declaration//GEN-END:variables
}