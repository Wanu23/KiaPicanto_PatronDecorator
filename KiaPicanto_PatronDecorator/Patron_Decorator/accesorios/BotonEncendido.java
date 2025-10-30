package accesorios;

import model.KiaPicanto;

public class BotonEncendido extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public BotonEncendido(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Botón Encendido";
    }

    public double costo() {
        return 1500000 + kiaPicanto.costo();
    }
}