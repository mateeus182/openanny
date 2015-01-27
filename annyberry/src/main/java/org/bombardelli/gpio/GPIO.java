package org.bombardelli.gpio;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class GPIO {

	private static final GpioController gpio = GpioFactory.getInstance();
	private static final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.LOW);

	public static void piscaTodos(int vezes, int segundos){
		for(int i = 0 ; i < vezes; i++){
			pin.toggle();
			try {
				Thread.sleep(segundos*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}

	}
	
}
