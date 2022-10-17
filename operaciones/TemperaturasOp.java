package com.jmr.operaciones;

import com.jmr.MetodosNumeros.Redondear;
public class TemperaturasOp {
	
    public double centigradosKelvin(double valor) {
        return Redondear.rendodearNumero( valor + 273.15D );
    }
	
    public double kelvinCentigrados(double valor) {
        return Redondear.rendodearNumero( valor - 273.15D );
    }
	
    public double centgradosFahrenheit(double valor) {
	return Redondear.rendodearNumero( valor * (9/5D) + 32 );
    }
	
    public double fahrenheitCentigrados(double valor) {
	return Redondear.rendodearNumero( (valor-32) *(5/9D) );
    }
	
    public double kelvinFahrenheit(double valor) {
	return Redondear.rendodearNumero( (9/5D) * (valor-273.15D) + 32 );
    }
	
    public double fahrenheitKelvin(double valor) {
	return Redondear.rendodearNumero( (valor-32) * (5/9D) + 273.15D );
    }
	
}
