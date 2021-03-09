package test;
public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	
	int cantidadAsientos() {
		int numeroAsientos = 0;
		for (Asiento asiento : asientos) {
			if (asiento != null) {
			numeroAsientos++;
			}
		}
		return numeroAsientos;
	}
	
	String verificarIntegridad( ) {
		if (motor != null) {
		if (motor.registro != registro) {
			return "Las piezas no son originales";
		}
	}
		
		for (Asiento asiento : asientos) {
			
			if (asiento != null) {
				if (asiento.registro != registro) {
					return "Las piezas no son originales";
				}
			}
		}
		
		for (Asiento asiento : asientos) {
			if (asiento != null) {
				if (asiento.registro != motor.registro) {
					return "Las piezas no son originales";
				}
		}
	}
		return "Auto original";
	}
}

