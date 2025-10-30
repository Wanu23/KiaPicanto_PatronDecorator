package accesorios;

import model.KiaPicanto;

public class AlarmaMatrix extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public AlarmaMatrix(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Alarma Matrix";
    }

    public double costo() {
        return 205000 + kiaPicanto.costo();
    }
}