/*
 * Annyduino.cpp
 *
 *  Created on: 11/12/2014
 *      Author: jcbombardelli
 */

#include "Annyduino.h"
#include <Arduino.h>

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

