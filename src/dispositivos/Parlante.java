package dispositivos;

import interfaces.Dispositivo;

public class Parlante implements Dispositivo {
	
	private boolean encendido;
	private int volumen;
	private String name = "Parlante";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void encender() {
		encendido = true;
	}

	@Override
	public void apagar() {
		encendido = false;
	}

	@Override
	public boolean isEncendido() {
		return encendido;
	}

	@Override
	public int getVolumen() {
		return volumen;
	}

	@Override
	public void setVolumen(int pVolumen) {
		volumen = pVolumen;
	}


}
