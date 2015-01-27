package org.bombardelli.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class ArquivoJSON {
	
	public static void criaJSON(String local, String nomeArquivo, Object obj) throws IOException{
		FileWriter fw = new FileWriter(local+nomeArquivo);
		fw.write(new Gson().toJson(obj));
		fw.flush();
		fw.close();
	}

	public static Object leJSON(String local, String nomeArquivo) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(local+nomeArquivo));
		return new Gson().fromJson(br, Object.class);
	}

}
