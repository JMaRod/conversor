/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.MetodosNumeros;

import java.awt.HeadlessException;
import com.jmr.ventanas.Mensajes;

/**
 *
 * @author JMaRod
 */
public class ConversorDeStrings
{
 
    public static float revisarNumeroSinCero(String numero){
        float valor = 0;
        try {
            valor = Float.valueOf(numero);
            if(valor <= 0 ){
                Mensajes.numeroMayorCero();
                valor = 0;
            }     
        } catch (HeadlessException | NumberFormatException e) {
            Mensajes.numeroNoCadena();
        } 
        return valor;
    }
    
    public static float revisarNumeroConCero(String numero){
        float valor = 0;
        try {
            valor = Float.valueOf(numero);
            if(valor < 0 ){
                Mensajes.numeroPositivo();
                valor = -1;
            }     
        } catch (HeadlessException | NumberFormatException e) {
            Mensajes.numeroNoCadena();
        } 
        return valor;
    }
}
