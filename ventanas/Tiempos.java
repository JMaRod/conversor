/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.ventanas;

import com.jmr.operaciones.TiempoOp;
import com.jmr.MetodosNumeros.ConversorDeStrings;
import com.jmr.MetodosNumeros.EliminarNotacion;

/**
 *
 * @author JMaRod
 */
public class Tiempos extends javax.swing.JFrame
{
    TiempoOp tiemposOp = new TiempoOp();

    /**
     * Creates new form Distancias
     */
    public Tiempos()
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

        jLabelTiemposTitulo = new javax.swing.JLabel();
        jButtonTiemposRetorno = new javax.swing.JButton();
        jLabelTiemposOrigen = new javax.swing.JLabel();
        jComboBoxTiemposDestino = new javax.swing.JComboBox<>();
        jLabelTiemposDestino = new javax.swing.JLabel();
        jComboBoxTiemposOrigen = new javax.swing.JComboBox<>();
        jLabelTeimposIngreso = new javax.swing.JLabel();
        jLabelTeimposResultado = new javax.swing.JLabel();
        jTextFieldTeimposIngreso = new javax.swing.JTextField();
        jTextFieldTiemposResultado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneDistanciasInstrucciones = new javax.swing.JTextPane();
        jLabelTiemposFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTiemposTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTiemposTitulo.setText("Tiempos");
        getContentPane().add(jLabelTiemposTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jButtonTiemposRetorno.setText("Regresar");
        jButtonTiemposRetorno.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTiemposRetornoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTiemposRetorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabelTiemposOrigen.setText("Unidad Origen:");
        getContentPane().add(jLabelTiemposOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, 20));

        jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "minutos", "horas", "d??as" }));
        getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabelTiemposDestino.setText("Unidad Destino:");
        getContentPane().add(jLabelTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, 20));

        jComboBoxTiemposOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "segundos", "minutos", "horas", "d??as", "semanas", "a??os" }));
        jComboBoxTiemposOrigen.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jComboBoxTiemposOrigenItemStateChanged(evt);
            }
        });
        jComboBoxTiemposOrigen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBoxTiemposOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTiemposOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabelTeimposIngreso.setText("Cantidad:");
        getContentPane().add(jLabelTeimposIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        jLabelTeimposResultado.setText("Resultado:");
        getContentPane().add(jLabelTeimposResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 20));

        jTextFieldTeimposIngreso.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldTeimposIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTeimposIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, -1));

        jTextFieldTiemposResultado.setEditable(false);
        jTextFieldTiemposResultado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldTiemposResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTiemposResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 80, -1));

        jTextPaneDistanciasInstrucciones.setEditable(false);
        jTextPaneDistanciasInstrucciones.setText("Seleccione una unidad de origen, despues una unidad de destino.\nA continuaci??n ingrese la cantidad en \"Cantidad\".\nPor ??ltimo presiones Enter.");
        jTextPaneDistanciasInstrucciones.setCaretPosition(0);
        jScrollPane2.setViewportView(jTextPaneDistanciasInstrucciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 70));

        jLabelTiemposFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabelTiemposFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTiemposRetornoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonTiemposRetornoActionPerformed
    {//GEN-HEADEREND:event_jButtonTiemposRetornoActionPerformed
        Intro intro = new Intro();
        this.setVisible(false);
        intro.setVisible(true);
    }//GEN-LAST:event_jButtonTiemposRetornoActionPerformed

    private void jTextFieldTeimposIngresoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldTeimposIngresoActionPerformed
    {//GEN-HEADEREND:event_jTextFieldTeimposIngresoActionPerformed
        float valor = ConversorDeStrings.revisarNumeroSinCero(evt.getActionCommand());
        seleccionarOperacion(jComboBoxTiemposOrigen.getSelectedItem(), jComboBoxTiemposDestino.getSelectedItem(), valor);
        
    }//GEN-LAST:event_jTextFieldTeimposIngresoActionPerformed

    private void jTextFieldTiemposResultadoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextFieldTiemposResultadoActionPerformed
    {//GEN-HEADEREND:event_jTextFieldTiemposResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTiemposResultadoActionPerformed

    private void jComboBoxTiemposOrigenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBoxTiemposOrigenActionPerformed
    {//GEN-HEADEREND:event_jComboBoxTiemposOrigenActionPerformed

        if ("segundos".equals(String.valueOf(jComboBoxTiemposOrigen.getSelectedItem()))){
            jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"minutos", "horas", "d??as"}));
            getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        } 
        else if ("minutos".equals(String.valueOf(jComboBoxTiemposOrigen.getSelectedItem()))){
            jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"segundos", "horas", "d??as"}));
            getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        } 
        else if ("horas".equals(String.valueOf(jComboBoxTiemposOrigen.getSelectedItem()))){
            jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"segundos", "minutos", "d??as", "semanas"}));
            getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        }
        else if ("d??as".equals(String.valueOf(jComboBoxTiemposOrigen.getSelectedItem()))){
            jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"minutos" , "horas", "semanas"}));
            getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        }
        else if ("semanas".equals(String.valueOf(jComboBoxTiemposOrigen.getSelectedItem()))){
            jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"horas", "d??as", "a??os"}));
            getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        }
        else if ("a??os".equals(String.valueOf(jComboBoxTiemposOrigen.getSelectedItem()))){
            jComboBoxTiemposDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"horas", "d??as", "semanas"}));
            getContentPane().add(jComboBoxTiemposDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));
        }
    }//GEN-LAST:event_jComboBoxTiemposOrigenActionPerformed

    private void jComboBoxTiemposOrigenItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jComboBoxTiemposOrigenItemStateChanged
    {//GEN-HEADEREND:event_jComboBoxTiemposOrigenItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTiemposOrigenItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTiemposRetorno;
    private javax.swing.JComboBox<String> jComboBoxTiemposDestino;
    private javax.swing.JComboBox<String> jComboBoxTiemposOrigen;
    private javax.swing.JLabel jLabelTeimposIngreso;
    private javax.swing.JLabel jLabelTeimposResultado;
    private javax.swing.JLabel jLabelTiemposDestino;
    private javax.swing.JLabel jLabelTiemposFondo;
    private javax.swing.JLabel jLabelTiemposOrigen;
    private javax.swing.JLabel jLabelTiemposTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldTeimposIngreso;
    private javax.swing.JTextField jTextFieldTiemposResultado;
    private javax.swing.JTextPane jTextPaneDistanciasInstrucciones;
    // End of variables declaration//GEN-END:variables

    private void seleccionarOperacion(Object origen, Object destino, float valor)
    {
        if ( origen == "segundos" && destino == "minutos")
            imprimirResultado(tiemposOp.segundosMinutos(valor));
        else if ( origen == "segundos" && destino == "horas")
            imprimirResultado(tiemposOp.segundosHoras(valor));
        else if (origen == "segundos" && destino == "d??as")
            imprimirResultado(tiemposOp.segundosDias(valor));
        else if ( origen == "minutos" && destino == "segundos")
            imprimirResultado(tiemposOp.minutosSegundos(valor));
        else if (origen == "minutos" && destino == "horas")
            imprimirResultado(tiemposOp.minutosHora(valor));
        else if (origen == "minutos" && destino == "d??as")
            imprimirResultado(tiemposOp.minutosDias(valor));
        else if (origen == "horas" && destino == "segundos")
            imprimirResultado(tiemposOp.horaSegundos(valor));
        else if (origen == "horas" && destino == "minutos")
            imprimirResultado(tiemposOp.horaMinutos(valor));
        else if (origen == "horas" && destino == "d??as")
            imprimirResultado(tiemposOp.horaDias(valor));
        else if (origen == "horas" && destino == "semanas")
            imprimirResultado(tiemposOp.horaSemanas(valor));
        else if (origen == "d??as" && destino == "minutos")
            imprimirResultado(tiemposOp.diaMinutos(valor));
        else if (origen == "d??as" && destino == "horas")
            imprimirResultado(tiemposOp.diaHoras(valor));
        else if (origen == "d??as" && destino == "semanas")
            imprimirResultado(tiemposOp.diaSemanas(valor));
        else if (origen == "semanas" && destino == "horas")
            imprimirResultado(tiemposOp.semanaHoras(valor));
        else if (origen == "semanas" && destino == "dias")
            imprimirResultado(tiemposOp.semanaDias(valor));
        else if (origen == "semanas" && destino == "a??os")
            imprimirResultado(tiemposOp.semanaAno(valor));
        else if (origen == "a??os" && destino == "horas")
            imprimirResultado(tiemposOp.anoHoras(valor));
        else if (origen == "a??os" && destino == "d??as")
            imprimirResultado(tiemposOp.anoDias(valor));
        else if (origen == "a??os" && destino == "semanas")
            imprimirResultado(tiemposOp.anoSemanas(valor));
    }

    private void imprimirResultado(double valor)
    {
        jTextFieldTiemposResultado.setText(EliminarNotacion.eliminarNotaci??nCient??fica(valor));
    }
}
