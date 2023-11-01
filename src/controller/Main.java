package controller;

import dispositivos.*;
import dispositivosControl.*;
import interfaces.*;

public class Main {

	public static void main(String[] args) {
		Dispositivo laptop = new Laptop();
		Dispositivo parlante = new Parlante();
		
		DispositivoControl alexaLaptop = new Alexa(laptop);
		DispositivoControl alexaParlante = new Alexa(parlante);
		
		alexaLaptop.encender();
		alexaParlante.encender();
	}

}
