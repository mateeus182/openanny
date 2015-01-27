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

public:
	Risposta();
	Risposta(unsigned int id);
	virtual ~Risposta();

	unsigned int getId() const { return id;	}

	bool isStts() const { return stts; }
	void setStts(bool stts) { this->stts = stts; }


};

#endif /* ANNYDUINO_RISPOSTA_H_ */
