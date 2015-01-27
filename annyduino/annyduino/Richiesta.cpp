/*
 * Richiesta.cpp
 *
 *  Created on: 12/12/2014
 *      Author: jcbombardelli
 */

#include "Richiesta.h"


Richiesta::Richiesta(){
	this->id = 0;
	this->pin = 0;
	this->io = false;
	this->inf = 0;
	this->act = false;
}

Richiesta::Richiesta(unsigned long id, bool io, unsigned char pin, bool act, int inf){
	this->id = id;
	this->pin = pin;
	this->act = act;
	this->inf = inf;
	this->io = io;
}

Richiesta::~Richiesta() {

}

