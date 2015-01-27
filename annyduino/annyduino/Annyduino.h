/*
 * Annyduino.h
 *
 *  Created on: 11/12/2014
 *      Author: jcbombardelli
 */

#ifndef ANNYDUINO_ANNYDUINO_H_
#define ANNYDUINO_ANNYDUINO_H_

#include <Arduino.h>
#include <ArduinoJson.h>
#include "Richiesta.h"
#include "Risposta.h"

class Annyduino {

public:
	Annyduino();
	void setup();
	void loop();

	void aguardaRequisicao();
	void recebeRequisicao();
	void converteRequisicao();
	void executaAcao();
	void criaResposta();
	void enviaResposta();

	virtual ~Annyduino();

};

#endif /* ANNYDUINO_ANNYDUINO_H_ */
