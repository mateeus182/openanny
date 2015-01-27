package br.com.sagitta.opeanny.annyberry.core;

import java.util.Date;

import org.bombardelli.gpio.GPIO;

import br.com.sagitta.opeanny.annyberry.model.Arduino;
import br.com.sagitta.opeanny.annyberry.model.ConfigAnnyBerry;
import br.com.sagitta.opeanny.annyberry.model.Device;
import br.com.sagitta.opeanny.annyberry.model.Java;
import br.com.sagitta.opeanny.annyberry.model.TCPIP;

import com.sun.jersey.api.client.ClientResponse;

public class StartAnnyBerry {


	@SuppressWarnings("null")
	public static void iniciaAnnyBerry(){

		// TODO Substituir pelo returno do Banco de Dados;
		ConfigAnnyBerry berry = new ConfigAnnyBerry();

		if(berry.getCredencial().getPorta().equals(null) && berry.getCredencial().getChave().equals(null)){
			if(!berry.isEnviado()){
				if(!berry.isConfigurado()){

					berry.setArduino(new Arduino());
					berry.setDevice(new Device());
					berry.getDevice().setJava(new Java());
					berry.getDevice().setIp(new TCPIP());

					berry.setConfigurado(true);
					berry.setAtualizacao(new Date());

					//enviaRegistro
				}

				ClientResponse cr = null;

				if(cr.getStatus() == 200 || cr.getStatus() == 201)
					berry.setEnviado(true);
				else
					GPIO.piscaTodos(99, 99);	
			}
			else{
				
				//valida porta e chave registrados
				ClientResponse cr = null;
				
				if(cr.getStatus() == 200 || cr.getStatus() == 201)
					berry.setEnviado(true);
				else
					GPIO.piscaTodos(99, 99);
			}
		}

	}

}
