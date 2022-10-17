package com.jmr.operaciones;

import com.jmr.MetodosNumeros.Redondear;

public class TiempoOp {
    double resultado;
	
    public double segundosMinutos(double valor) {
	return Redondear.rendodearNumero( valor/60 );
    }
   
    public double segundosHoras(double valor) {
	return Redondear.rendodearNumero( valor / 3600 );
    }
    
    public double segundosDias(double valor) {
	return Redondear.rendodearNumero( valor / 86400 );
    }
    
    public double minutosSegundos(double valor) {
        return Redondear.rendodearNumero( valor * 60 );
    }
    
    public double minutosHora(double valor) {
        return Redondear.rendodearNumero( valor / 60 );
    }
    
    public double minutosDias(double valor) {
        return Redondear.rendodearNumero( valor / 1440 );
    }
    
    public double horaSegundos(double valor) {
        return Redondear.rendodearNumero( valor * 3600 );
    }
	
    public double horaMinutos(double valor) {
        return Redondear.rendodearNumero( valor * 60 );
    }
    
    public double horaDias(double valor) {
        return Redondear.rendodearNumero( valor / 24 );
    }
    
    public double horaSemanas(double valor) {
        return Redondear.rendodearNumero( valor / 168 );
    }
    
    public double diaMinutos(double valor) {
        return Redondear.rendodearNumero( valor * 1440 );
    }
    
    public double diaHoras(double valor) {
        return Redondear.rendodearNumero( valor * 24 );
    }
    
    public double diaSemanas(double valor) {
        return Redondear.rendodearNumero( valor / 7 );
    }
    
    public double semanaHoras(double valor) {
        return Redondear.rendodearNumero( valor * 168 );
    }
    
    public double semanaDias(double valor) {
        return Redondear.rendodearNumero( valor * 7 );
    }
    
    public double semanaAno(double valor) {
        return Redondear.rendodearNumero( valor / 52.143 );
    }
    
    public double anoHoras(double valor) {
        return Redondear.rendodearNumero( valor * 8760 );
    }
    
    public double anoDias(double valor) {
        return Redondear.rendodearNumero( valor * 365 );
    }
    
    public double anoSemanas(double valor) {
        return Redondear.rendodearNumero( valor * 52.143 );
    }
}
