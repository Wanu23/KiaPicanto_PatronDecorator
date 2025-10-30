package accesorios;

import model.KiaPicanto;

public class RinAluminio extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public RinAluminio(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Rines de Aluminio";
    }

    public double costo() {
        return 350000 + kiaPicanto.costo();
    }
}