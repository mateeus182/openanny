/*
 * Risposta.cpp
 *
 *  Created on: 12/12/2014
 *      Author: jcbombardelli
 */

#include "Risposta.h"

Risposta::Risposta() {
	this->id = 0;
	this->stts = false;
}

Risposta::Risposta(unsigned int id){
	this->id = id;
	this->stts = false;

}

Risposta::~Risposta() {

}
