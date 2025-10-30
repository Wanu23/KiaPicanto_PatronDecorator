package accesorios;

import model.KiaPicanto;

public class FrenosSeguridad extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public FrenosSeguridad(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Frenos de Seguridad";
    }

    public double costo() {
        return 156100 + kiaPicanto.costo();
    }
}