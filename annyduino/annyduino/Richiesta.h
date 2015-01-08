/*
 * Richiesta.h
 *
 *  Created on: 12/12/2014
 *      Author: jcbombardelli
 */


#ifndef ANNYDUINO_RICHIESTA_H_
#define ANNYDUINO_RICHIESTA_H_

class Richiesta {
private:
	unsigned int id;
	unsigned int pin;
	unsigned int act;
	unsigned int inf;

public:
	Richiesta();
	Richiesta(unsigned int id,
				unsigned int pin,
				unsigned int act,
				unsigned int inf);
	virtual ~Richiesta();
};

#endif /* ANNYDUINO_RICHIESTA_H_ */
