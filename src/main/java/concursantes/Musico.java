package concursantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Musico implements IConcursante {
	private String cancion = "";
		
	private IInstrumento instrumento;

	public Musico() {
	}

	public void ejecutar() throws EjecucionException {
		System.out.println("Tocando " + cancion + ": ");
		instrumento.tocar();

	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public IInstrumento getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(IInstrumento instrumento) {
		this.instrumento = instrumento;
	}

}
