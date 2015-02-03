package br.com.sagitta.opeanny.annyberry.info.impl;

import java.util.ArrayList;
import java.util.List;

public class InfoDevice {
	
	public List<String> getPropriedades(){
		List<String> lista = new ArrayList<String>();
		lista.add("awt.toolkit");
		lista.add("file.encoding.pkg");
		lista.add("file.encoding");		
		lista.add("file.separador");
		lista.add("line.separator");
		lista.add("os.name");
		lista.add("os.arch");
		lista.add("os.version");
		lista.add("path.separator");
		lista.add("user.name");
		lista.add("user.home");
		lista.add("user.dir");
		lista.add("user.country");
		lista.add("user.script");
		lista.add("user.variant");		
		lista.add("user.home");
		lista.add("user.timezone");
		lista.add("user.language");
		return lista;
	}

}
