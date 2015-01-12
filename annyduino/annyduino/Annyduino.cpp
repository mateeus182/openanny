/*
 * Annyduino.cpp
 *
 *  Created on: 11/12/2014
 *      Author: jcbombardelli
 */

#include "Annyduino.h"
#include <Arduino.h>
#include <aJSON.h>

Annyduino::Annyduino() {
	this->p = 0;
	this->i = 0;
	this->s = false;

}

bool Annyduino::liga(){
	digitalWrite(this->p, HIGH);
	if(isLigado())
		return 1;
	return 0;

}

bool Annyduino::desliga(){
	digitalWrite(this->p, LOW);
	if(!isLigado())
		return 1;
	return 0;
}


 unsigned int Annyduino::portasDisponiveis(){

	return 0;
}

Annyduino::~Annyduino() {

}

Annyduino::recebeRequisicao(*jsonString){
    
    char* v1, v2, v3;
    	
    aJsonObject* jsonObj = aJson.parse(jsonString);

    if (jsonObj != NULL) {    
        aJsonObject* v1 = aJson.getObjectItem(jsonObj, "p"); 
        this->p = v1 ->valuestring;
        
        aJsonObject* v2 = aJson.getObjectItem(jsonObj, "i"); 
        this->i = v2 ->valuestring;
        
        aJsonObject* v3 = aJson.getObjectItem(jsonObj, "s"); 
        this->s = v3 ->valuestring;
    }	
}
