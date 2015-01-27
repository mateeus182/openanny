package br.com.sagitta.opeanny.annyberry.serial;

import java.io.IOException;
import java.io.InputStream;

public class LeituraSerial implements Runnable {

	private InputStream in;
	private byte[] buffer = new byte[1024];
	private int len = -1;

	public InputStream getIn() {return in;}
	public void setIn(InputStream in) {this.in = in;}
	public LeituraSerial(InputStream in){this.in = in;}

	public void run(){
		try{
			while((len = this.in.read(buffer)) > -1 )
				System.out.print(new String(buffer,0,len));
		} catch (IOException e){
			e.printStackTrace();
		}            
	}
}