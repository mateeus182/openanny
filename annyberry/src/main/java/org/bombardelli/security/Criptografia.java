package org.bombardelli.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
	
	public final static String MD5 = "MD5"; //32
	public final static String SHA256 = "SHA-256"; //64
	public final static String SHA512 = "SHA-512"; //128

	public static String cripografa (String senha, String modo) {
		try {
			MessageDigest algoritmo = MessageDigest.getInstance(modo);
			algoritmo.update(senha.getBytes());                 
			return	new BigInteger(1, algoritmo.digest()).toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return senha;
	}

}
