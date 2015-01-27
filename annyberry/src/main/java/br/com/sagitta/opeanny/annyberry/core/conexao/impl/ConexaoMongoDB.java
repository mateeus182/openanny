package br.com.sagitta.opeanny.annyberry.core.conexao.impl;

import org.bombardelli.database.MongoDB;

import br.com.sagitta.opeanny.annyberry.core.conexao.IConexao;

public class ConexaoMongoDB implements IConexao {

	public void configuraConexao(String url, Integer port, String user, String passwd, String database){
		MongoDB.getInstance().setUrl(url);
		MongoDB.getInstance().setPort(port);
		MongoDB.getInstance().setUser(user);
		MongoDB.getInstance().setDatabase(database);
	}
	
	public void iniciaConexao(){
		
	}
	
	
	public boolean isConectado() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
