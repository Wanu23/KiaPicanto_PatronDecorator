package accesorios;

import model.KiaPicanto;

public class RinAluminioPremium extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public RinAluminioPremium(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Rines de Aluminio Premium";
    }

    public double costo() {
        return 500000 + kiaPicanto.costo();
    }
}