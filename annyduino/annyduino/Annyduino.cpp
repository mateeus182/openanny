/*
 * Annyduino.cpp
 *
 *  Created on: 11/12/2014
 *      Author: jcbombardelli
 */

#include "Annyduino.h"


Annyduino::Annyduino() { }

String json;
Richiesta requisicao;
Risposta resposta;


void Annyduino::setup(){

	//11500
	Serial.begin(9600);

}

void Annyduino::loop(){
	recebeRequisicao();
	converteRequisicao();
	executaAcao();
	criaResposta();
	enviaResposta();
}


void Annyduino::recebeRequisicao(){
	while(Serial.available() > 0)
		json = Serial.readString();
}

void Annyduino::converteRequisicao(){

	if(json.length() > 0){

		StaticJsonBuffer<200> jsonBuffer;

		unsigned int tamanhoJSON = json.length()+1;
		char kjson[tamanhoJSON];
		json.toCharArray(kjson, tamanhoJSON);

		JsonObject& root = jsonBuffer.parseObject(kjson);

		requisicao = Richiesta(root["id"], root["io"], root["pin"],	root["act"], root["inf"]);
	}

}

void Annyduino::executaAcao(){

	pinMode(requisicao.getPin(), requisicao.isIo());

	//Escrita Digital
	if(requisicao.isIo() && requisicao.getInf() == NULL){

		digitalWrite(requisicao.getPin(), requisicao.isAct());

		if(digitalRead(requisicao.getPin()) != requisicao.isAct())
			return;

	}

	//Escrita Analógica
	else if(requisicao.isIo() && requisicao.getInf() != NULL){

		analogWrite(requisicao.getPin(), requisicao.getInf());

		if(analogRead(requisicao.getPin() != requisicao.getInf())){
			//PAREI AQUI !!!
		}



	}
	//Leitura Digital
	else if(!requisicao.isIo() && requisicao.getInf() == NULL){

		bool rs = digitalRead(requisicao.getPin());

	}
	//Leitura Analógica
	else {

		int rs = analogRead(requisicao.getPin());
	}


}


void Annyduino::criaResposta(){ 

	resposta = Risposta(requisicao.getId());
	resposta.setStts(true);

}

void Annyduino::enviaResposta(){

	StaticJsonBuffer<200> jsonBuffer;

	
	JsonObject& root = jsonBuffer.createObject();


	root["id"] = resposta.getId();
	root["status"] = resposta.isStts();


	root.printTo(serial);

	json = "";
}

Annyduino::~Annyduino() { }

