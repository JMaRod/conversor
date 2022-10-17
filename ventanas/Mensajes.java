/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author JMaRod
 */
public class Mensajes
{
    public static void numeroGuardado(){
        JOptionPane.showMessageDialog(null, "El valor se guardo correctamente");
    }
    
    public static void numeroMayorCero(){
        JOptionPane.showMessageDialog(null, "El numero tiene que ser mayor a 0");
    }
    
    public static void numeroNoCadena(){
        JOptionPane.showMessageDialog(null, "El valor ingresado debe ser un numero");
    }
    
    public static void numeroPositivo(){
        JOptionPane.showMessageDialog(null, "El valor ingresado debe ser un numero Postivo");
    }
}
