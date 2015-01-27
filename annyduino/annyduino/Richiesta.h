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
	unsigned long id;
	bool io;
	unsigned char pin;
	bool act;
	int inf;

public:

	Richiesta();
	Richiesta(unsigned long id, bool io, unsigned char pin, bool act, int inf);
	virtual ~Richiesta();

	bool isAct() const { return act; }
	unsigned long getId() const { return id; }
	int getInf() const { return inf; }
	bool isIo() const {	return io; }
	unsigned char getPin() const { return pin; }


};

#endif /* ANNYDUINO_RICHIESTA_H_ */
