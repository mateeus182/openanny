/*
 * Annyduino.h
 *
 *  Created on: 11/12/2014
 *      Author: jcbombardelli
 */

#ifndef ANNYDUINO_ANNYDUINO_H_
#define ANNYDUINO_ANNYDUINO_H_

class Annyduino {

public:
	Annyduino();
	void setup();
	void resetup();
	void loop();

	bool liga();
	bool desliga();
	bool ajusteAnalogico();
	bool ajustePWM();

	bool isLigado();
	unsigned int valorAnalogico();
	unsigned int valorPWM();

	void enviaResposta();
	void recebeRequisicao();

	static unsigned int portasDisponiveis();

	virtual ~Annyduino();

private:

	int p;
	int i;
	int s;
};

#endif /* ANNYDUINO_ANNYDUINO_H_ */
