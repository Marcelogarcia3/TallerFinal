package Package;

public class Cliente extends Persona {
	private int edad;

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Cliente(String nombre, String rut, String direccion, int edad) {
		super(nombre, rut, direccion);
		this.edad = edad;
	}
}