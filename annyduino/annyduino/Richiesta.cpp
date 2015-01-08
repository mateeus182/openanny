/*
 * Richiesta.cpp
 *
 *  Created on: 12/12/2014
 *      Author: jcbombardelli
 */

#include "Richiesta.h"

Richiesta::Richiesta() {
	this->act = 0;
	this->inf = 0;
	this->id = 0;
	this->pin = 0;
}

Richiesta::Richiesta(unsigned int id,unsigned int pin, unsigned int act, unsigned int inf){
	this->id = id;
	this->pin = pin;
	this->act = act;
	this->inf = inf;
}

Richiesta::~Richiesta() {

}

