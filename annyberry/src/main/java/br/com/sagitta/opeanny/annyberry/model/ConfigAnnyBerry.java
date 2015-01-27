package br.com.sagitta.opeanny.annyberry.model;

import java.util.Date;


public class ConfigAnnyBerry {
	
	private boolean enviado;
	private boolean configurado;
	private Date atualizacao;
	private Credencial credencial;
	private Arduino arduino;
	private Device device;
	
	public boolean isEnviado() {
		return enviado;
	}
	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}
	public boolean isConfigurado() {
		return configurado;
	}
	public void setConfigurado(boolean configurado) {
		this.configurado = configurado;
	}
	public Credencial getCredencial() {
		return credencial;
	}
	public void setCredencial(Credencial credencial) {
		this.credencial = credencial;
	}
	public Arduino getArduino() {
		return arduino;
	}
	public void setArduino(Arduino arduino) {
		this.arduino = arduino;
	}
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public Date getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(Date atualizacao) {
		this.atualizacao = atualizacao;
	}
	
	
	
	

}
