package br.com.sagitta.opeanny.annyberry.core.conexao.impl;

import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import br.com.sagitta.opeanny.annyberry.core.conexao.IConexao;
import br.com.sagitta.opeanny.annyberry.serial.EscritaSerial;
import br.com.sagitta.opeanny.annyberry.serial.LeituraSerial;

public class ConexaoSerial implements IConexao {

	public ConexaoSerial(){super();}
	private CommPort commPort;

	public void connect() {
		String portName= null;

		try {
			CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
			if (portIdentifier.isCurrentlyOwned())
				System.out.println("Erro: Porta ja está em uso atualmente");
			else{	
				commPort = portIdentifier.open(this.getClass().getName(),2000);

				if (commPort instanceof SerialPort)	{
					SerialPort serialPort = (SerialPort) commPort;
					serialPort.setSerialPortParams(9300,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);

					InputStream in = serialPort.getInputStream();
					OutputStream out = serialPort.getOutputStream();

					(new Thread(new LeituraSerial(in))).start();
					(new Thread(new EscritaSerial(out))).start();
				}
				else
					System.out.println("Erro: Somente portas SERIAIS");
			} 
		} 
		catch (NoSuchPortException e) {e.printStackTrace();} 
		catch (PortInUseException e) {e.printStackTrace();} 
		catch (UnsupportedCommOperationException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
	}


	public boolean isConectado() {
		return commPort != null ? true : false;
	}	

}
