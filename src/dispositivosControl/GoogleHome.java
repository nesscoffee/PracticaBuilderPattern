package dispositivosControl;

import interfaces.Dispositivo;
import interfaces.DispositivoControl;

public class GoogleHome implements DispositivoControl {
	
	private Dispositivo dispositivo;
	
	public GoogleHome(Dispositivo pDispositivo) {
		this.dispositivo = pDispositivo;
	}

	@Override
	public void encender() {
		dispositivo.encender();
		System.out.println("Dispositivo " + dispositivo.getName() + " encendido");
	}

	@Override
	public void apagar() {
		dispositivo.apagar();
		System.out.println("Dispositivo " + dispositivo.getName() + " apagado");
	}

	@Override
	public void mute() {
		dispositivo.setVolumen(0);
	}

	@Override
	public void aumentarVolumen() {
		int volumen = dispositivo.getVolumen() + 1;
		dispositivo.setVolumen(volumen);
	}

	@Override
	public void disminuirVolumen() {
		int volumen = dispositivo.getVolumen() - 1;
		dispositivo.setVolumen(volumen);
	}

}
