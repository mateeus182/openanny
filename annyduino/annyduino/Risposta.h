/*
 * Risposta.h
 *
 *  Created on: 12/12/2014
 *      Author: JC Bombardelli
 */

#ifndef ANNYDUINO_RISPOSTA_H_
#define ANNYDUINO_RISPOSTA_H_

class Risposta {
private:
	unsigned int id;
	bool stts;
	char* obs[ ];
public:
	Risposta();
	Risposta(unsigned int id);
	virtual ~Risposta();
};

#endif /* ANNYDUINO_RISPOSTA_H_ */
