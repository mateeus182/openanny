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

	/*TODO At� o momento, ficou decidido que n�o ser�
	 * realizada qualquer tipo de valida��o de integridade
	 * com o json oriundo da requisi��o. Presume-se que t0do
	 * arquivo enviado pelo annyberry estar� "correto" */
}

void Annyduino::converteRequisicao(){

	if(json.length() > 0){
		//Falta recuperar a STRING "JSO b'N"
		aJsonObject* jsonObj;

		if (jsonObj != NULL) {

			aJsonObject* v1 = aJson.getObjectItem(jsonObj, "id");
			aJsonObject* v2 = aJson.getObjectItem(jsonObj, "io");
			aJsonObject* v3 = aJson.getObjectItem(jsonObj, "pin");
			aJsonObject* v4 = aJson.getObjectItem(jsonObj, "act");
			aJsonObject* v5 = aJson.getObjectItem(jsonObj, "inf");

			requisicao = Richiesta(
					v1->valueint,
					v2->valuebool,
					v3->valuebool,
					v4->valuebool,
					v5->valueint);
		}
	}
}

void Annyduino::executaAcao(){

	pinMode(requisicao.pin, requisicao.io);

	//Escrita Digital
	if(requisicao.io && requisicao.inf == NULL){

		digitalWrite(requisicao.pin, requisicao.act);

		if(digitalRead(requisicao.pin) != requisicao.act)
			return;

	}

	//Escrita Anal�gica
	else if(requisicao.io && requisicao.inf != NULL){

		analogWrite(requisicao.pin, requisicao.inf);

		if(analogRead(requisicao.pin != requisicao.inf)){
				//PAREI AQUI !!!
		}



	}
	//Leitura Digital
	else if(!requisicao.io && requisicao.inf == NULL){

		bool rs = digitalRead(requisicao.pin);

	}
	//Leitura Analogica
	else {

		int rs = analogRead(requisicao.pin);
	}


}


void Annyduino::criaResposta(){  }


void Annyduino::enviaResposta(){
	json = "";
}

Annyduino::~Annyduino() { }

