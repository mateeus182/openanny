package br.com.sagitta.opeanny.annyberry.serial;

import java.io.IOException;
import java.io.OutputStream;

public class EscritaSerial implements Runnable {
	
	private OutputStream out;

	public OutputStream getOut() {return out;}
	public void setOut(OutputStream out) {this.out = out;}
	public EscritaSerial(OutputStream out){this.out = out;}

	public void run(){
		try {               
			int c = 0;
			while(( c = System.in.read()) > -1 )
				this.out.write(c);
		} catch(IOException e){
			e.printStackTrace();
		}            
	}

}
