package br.com.sagitta.opeanny.annyberry.start;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.bombardelli.gpio.GPIO;

import br.com.sagitta.opeanny.annyberry.core.StartAnnyBerry;
import br.com.sagitta.opeanny.annyberry.core.conexao.impl.ConexaoMongoDB;


/**
 * Inicio do Projeto
 * 
 * @author JCBombardelli
 * @version 1.0
 * @since 07/07/2014
 *
 */
public class StartUp extends StartAnnyBerry implements ServletContextListener{

	
	public void contextDestroyed(ServletContextEvent arg0) {
		
		ConexaoMongoDB conexaoMongoDB = new ConexaoMongoDB();
		//conexaoMongoDB.configuraConexao(url, port, user, passwd, database);
		conexaoMongoDB.iniciaConexao();
		
		if(conexaoMongoDB.isConectado()){
			iniciaAnnyBerry();
		}else {
			//Definição visual para erro no Banco de Dados
			GPIO.piscaTodos(99, 2);
		}		
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Finaliza MongoDB
		// TODO Finaliza AnnyBerry
		
	}

}
