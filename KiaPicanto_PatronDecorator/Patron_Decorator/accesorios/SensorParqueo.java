package accesorios;

import model.KiaPicanto;

public class SensorParqueo extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public SensorParqueo(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Sensor de Parqueo";
    }

    public double costo() {
        return 150000 + kiaPicanto.costo();
    }
}