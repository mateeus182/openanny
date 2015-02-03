package br.com.sagitta.opeanny.annyberry.info.impl;

import gnu.io.CommPortIdentifier;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class InfoArduino {
	
	public static List<String> listaDePortasDisponiveis(){
		List<String> portas = new ArrayList<String>();
		Enumeration listaDePortas = CommPortIdentifier.getPortIdentifiers();	
		while (listaDePortas.hasMoreElements()) {
			CommPortIdentifier ips = (CommPortIdentifier)listaDePortas.nextElement();
			portas.add(ips.getName());
		}
		return portas;
	}

}
