package model;

public abstract class KiaPicanto {
    protected String descripcion = "Picanto Base";

    public String getDescripcion() {
        return descripcion;
    }

    public abstract double costo();
}