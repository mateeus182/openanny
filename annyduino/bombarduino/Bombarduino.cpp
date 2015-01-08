/*
 * Bombarduino.cpp
 *
 *  Created on: 13/12/2014
 *      Author: jcbombardelli
 */

#include "Bombarduino.h"
#include <Arduino.h>

Bombarduino::Bombarduino() { }

unsigned int Bombarduino::qtdPortasDigitais(){
	int n = 0;
	delay(1500);
	for(n = 1; n < 100; n++){

		uint8_t bit = digitalPinToBitMask(n);
		uint8_t port = digitalPinToPort(n);
		//int p= ;
		Serial.print("BIT = ");
		Serial.println(bit);
		Serial.print("PORT = ");
		Serial.println(port);

		//Serial.print("N pin = ");
		//Serial.println(p);

		if (port == NOT_A_PIN){
			Serial.print("Não é um pin = ");
			Serial.println(port);


			//return n;
		}
		delay(1000);
		//return (*portOutputRegister(port) & bit) ? HIGH : LOW;
		//return 0;
	}
	return n;
}

bool Bombarduino::isPWM(unsigned int pin){
	//verificar antes se é um pino valido

	return  digitalPinHasPWM(pin) == 1 ? true : false;
}

Bombarduino::~Bombarduino() { }

