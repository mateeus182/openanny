/*
 * Richiesta.h
 *
 *  Created on: 12/12/2014
 *      Author: jcbombardelli
 */


#ifndef ANNYDUINO_RICHIESTA_H_
#define ANNYDUINO_RICHIESTA_H_

class Richiesta {



public:
	unsigned long id;
	bool io;
	unsigned char pin;
	bool act;
	int inf;

	Richiesta();

	Richiesta(
			unsigned long id,
			bool io,
			unsigned char pin,
			bool act,
			int inf);
	virtual ~Richiesta();
};

#endif /* ANNYDUINO_RICHIESTA_H_ */
