package accesorios;

import model.KiaPicanto;

public class TiroArrastre extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public TiroArrastre(KiaPicanto KiaPicanto) {
        this.kiaPicanto = KiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Tiro de Arrastre";
    }

    public double costo() {
        return 810000 + kiaPicanto.costo();
    }
}