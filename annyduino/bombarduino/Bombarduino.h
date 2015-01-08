/*
 * Bombarduino.h
 *
 *  Created on: 13/12/2014
 *      Author: jcbombardelli
 */

#ifndef BOMBARDUINO_BOMBARDUINO_H_
#define BOMBARDUINO_BOMBARDUINO_H_



class Bombarduino {
public:
	Bombarduino();
	static unsigned int qtdPortasDigitais();
	static unsigned int qtdPortasAnalogicas();
	static unsigned int qtdPortasPWM();
	static bool isPWM(unsigned int pin);
	virtual ~Bombarduino();
};

#endif /* BOMBARDUINO_BOMBARDUINO_H_ */
