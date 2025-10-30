package accesorios;

import model.KiaPicanto;

public class TapeteTresPiezas extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public TapeteTresPiezas(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Tapete Tres Piezas";
    }

    public double costo() {
        return 92200 + kiaPicanto.costo();
    }
}