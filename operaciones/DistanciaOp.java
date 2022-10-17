package com.jmr.operaciones;

/**
 *
 * @author JMaRod
 */

import com.jmr.MetodosNumeros.Redondear;

public class DistanciaOp {
    double result;
        
    public double centimetrosAMetro(double valor) {
        return Redondear.rendodearNumero(valor / 100D);
    }
        
    public double centimetrosAKilometro(double valor) {
        return Redondear.rendodearNumero( valor / 1000D );
    }
        
    public double centimetrosAPie(double valor) {
        return Redondear.rendodearNumero( valor / 30.48D );
    }
        
    public double centimetrosAPulgada(double valor) {
        return Redondear.rendodearNumero( valor / 2.54D );
    }
	
    public double metrosACentimetros(double valor) {
        return Redondear.rendodearNumero( valor * 100D );
    }
	
    public double metrosAkilometros(double valor) {
        return Redondear.rendodearNumero( valor * .001D );
    }
	
    public double metrosAPie(double valor) {
        return Redondear.rendodearNumero( valor * 3.28084D );
    }
	
    public double metrosAPulgadas(double valor) {
        return Redondear.rendodearNumero( valor * 39.37D );
    }
        
    public double kilometrosACentimetro(double valor) {
        return Redondear.rendodearNumero( valor * 100000D );
    }
        
    public double kilometrosAMetro(double valor) {
        return Redondear.rendodearNumero( valor / .001D );
    }
        
    public double kilometrosAPie(double valor) {
        return Redondear.rendodearNumero( valor * 3281D );
    }
        
    public double kilometrosAPulgada(double valor) {
        return Redondear.rendodearNumero( valor * 39370D );
    }
        
    public double pieACentimetro(double valor) {
        return Redondear.rendodearNumero( valor * 30.48D );
    }
	
    public double pieAMetro(double valor) {
        return Redondear.rendodearNumero( valor / 3.28084D );
    }
        
    public double pieAkilometro(double valor) {
        return Redondear.rendodearNumero( valor / 3281D );
    }
        
    public double pieAPulgadas(double valor) {
        return Redondear.rendodearNumero( valor * 12D );
    }
        
    public double pulgadasACentimetro(double valor) {
        return Redondear.rendodearNumero( valor * 2.54D );
    }
	
    public double pulgadasAMetro(double valor) {
        return Redondear.rendodearNumero( valor / 39.37D );
    }
        
    public double pulgadasAKilometro(double valor) {
        return Redondear.rendodearNumero( valor / 39370D );
    }
        
    public double pulgadasAPies(double valor) {
        return Redondear.rendodearNumero( valor / 12D );
    }
        
}

