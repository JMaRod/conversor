package com.jmr.operaciones;
public class DivisasOp {
        //las conversiones se haran con base en los dolares
	private float dolar=19.9F, euro=19.5F, libra=22.9F, yen=0.13F, won=0.0144F, resultado;
       
	public void setDolar(float valor) {
		this.dolar = valor;
	}
	public void setEuro(float valor) {
		this.euro = valor;
	}
	public void setLibra(float valor) {
		this.libra = valor;
	}
	public void setYen(float valor) {
		this.yen = valor;
	}
	public void setWon(float valor) {
		this.won = valor;
	}
	
        public float getDolar() {
		return dolar;
	}
	public float getEuro() {
		return euro;
	}
	public float getLibra() {
		return libra;
	}
	public float getYen() {
		return yen;
	}
	public float getWon() {
		return won;
	}
	
        public float mxDolar(float valor) {
		resultado = valor / dolar;
		return resultado;
	}
	public float mxEuro(float valor) {
		resultado = valor / euro;
		return resultado;
	}
	public float mxLibra(float valor) {
		resultado = valor / libra;
		return resultado;
	}
	public float mxYen(float valor) {
		resultado = valor / yen;
		return resultado;
	}
	public float mxWon(float valor) {
		resultado = valor / won;
		return resultado;
	}
	
}
