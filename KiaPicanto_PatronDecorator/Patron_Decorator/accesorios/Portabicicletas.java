package accesorios;

import model.KiaPicanto;

public class Portabicicletas extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public Portabicicletas(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Portabicicletas";
    }

    public double costo() {
        return 910000 + kiaPicanto.costo();
    }
}