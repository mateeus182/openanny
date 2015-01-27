package org.bombardelli.database;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;



/**
 * Singleton
 * 
 * @author JCBombardelli
 * @since 02/02/2015
 * @version 1.0
 *
 */
public class MongoDB {

	static { }
	private static MongoDB instance;

	private String url = "localhost";
	private Integer port = 27017;
	private String database;
	private String user;
	private String passwd;
	private MongoDB() { }

	public static MongoDB getInstance() {

		if(instance == null)
			instance = new MongoDB();
		return instance;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}	
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}

	public DB connect() throws UnknownHostException{
		MongoClient mongoClient = new MongoClient(url,port);		
		return mongoClient.getDB(database);
	}
	
	
}
