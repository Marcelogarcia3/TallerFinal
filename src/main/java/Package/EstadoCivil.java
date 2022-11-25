package Package;

public enum EstadoCivil {
    CONCRETO("Concreto"),
    MADERA("Madera"),
    LADRILLO("Ladrillo");

    private String estadoCivil;

    private EstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}