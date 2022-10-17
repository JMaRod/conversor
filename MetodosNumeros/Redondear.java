/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmr.MetodosNumeros;

/**
 *
 * @author kenkut1
 */
public class Redondear
{
    public static double rendodearNumero(double valor){
            return Math.round(valor*1000000.0)/1000000.0;
        }
}
