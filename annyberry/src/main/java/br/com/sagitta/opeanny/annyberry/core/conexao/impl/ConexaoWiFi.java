package br.com.sagitta.opeanny.annyberry.core.conexao.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;

import br.com.sagitta.opeanny.annyberry.core.conexao.IConexao;

public class ConexaoWiFi implements IConexao{


	private final static String URLCheckIP = "http://checkip.amazonaws.com";



	public static boolean testeConexao(){

		try {
			if(getWanConfig() != null)
				return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}



	private static String getWanConfig() throws IOException {
		URL meuIP = new URL(URLCheckIP);
		BufferedReader in = null;

		try {			
			in = new BufferedReader(new InputStreamReader(meuIP.openStream()));
			return in.readLine();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@SuppressWarnings("unused")
	private static void getLanConfig(){
		Enumeration<NetworkInterface> interfaces = null;
		try {
			interfaces = NetworkInterface.getNetworkInterfaces();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (interfaces.hasMoreElements()) {
			NetworkInterface iface = interfaces.nextElement();
			try {
				if (iface.isLoopback() || !iface.isUp() || iface.isVirtual())
					continue;
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			Enumeration<InetAddress> enderecos = iface.getInetAddresses();
			while(enderecos.hasMoreElements()) {
				InetAddress ender = enderecos.nextElement();

				//Garante que somente o endereço de IPV4 seja listado
				if(ender.getHostAddress().length() > 0  && ender.getHostAddress().length() <= 15 ){
					//Garante que somente portas Windows e as primeiras portas de LAN e WAN no Linux sejam listadas
					if(iface.getName().substring(0, 3).equals("net") || iface.getName().equals("eth0") || iface.getName().equals("wlan0")){						
					}
				}
			}
		}
	}



	public boolean isConectado() {
		// TODO Auto-generated method stub
		return false;
	}

}
