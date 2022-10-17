/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.MetodosNumeros;

import java.text.DecimalFormat;

/**
 *
 * @author kenkut1
 */
public class EliminarNotacion
{
        public static String eliminarNotaciónCientífica(double numero) {
           return new DecimalFormat("#.###########").format(numero);
    }
}
