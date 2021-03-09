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
		return asientos.length;
		}
	
	String verificarIntegridad( ) {
		if (Asiento.registro == this.registro && Motor.registro == this.registro) {
			return "Auto original" ;
		} else {
			return "Las piezas no son originales";
		}
	}
}
