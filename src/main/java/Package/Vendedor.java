package Package;

public class Vendedor extends Persona {
	private String tituloProfesional;
	public Venta unnamed_Venta_;
	private EstadoCivil estadoCivil;

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public Vendedor(String nombre, String rut, String direccion, String tituloProfesional, EstadoCivil estadoCivil) {
		super(nombre, rut, direccion);
		this.tituloProfesional = tituloProfesional;
		this.estadoCivil = estadoCivil;
	}
}