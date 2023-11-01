package interfaces;

public interface Dispositivo {
	String getName();
	void encender();
	void apagar();
	boolean isEncendido();
	int getVolumen();
	void setVolumen(int pVolumen);
}
