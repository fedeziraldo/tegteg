package cartasGlobales;

import application.Jugador;
import application.VistaPais;

public final class DescansoVerde extends CartaGlobal {
	
	DescansoVerde() {
	}

	@Override
	public boolean estaDescansando(Jugador jugador) {
		return "VERDE".equals(VistaPais.colores[jugador.getNumero()]);
	}

}
