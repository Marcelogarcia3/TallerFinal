package Package;

public enum TipoConstruccion {

    MADERA("Madera"),
    CONCRETO("Concreto"),
    LADRILLO("Ladrillo");

    private String tipoConstruccion;

    private TipoConstruccion(String tipoConstruccion){
        this.tipoConstruccion = tipoConstruccion;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }
}