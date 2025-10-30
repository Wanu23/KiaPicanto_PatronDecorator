package accesorios;
import model.KiaPicanto;

public class MallaCarga extends AccesorioDecorator {
    KiaPicanto kiaPicanto;

    public MallaCarga(KiaPicanto kiaPicanto) {
        this.kiaPicanto = kiaPicanto;
    }

    public String getDescripcion() {
        return kiaPicanto.getDescripcion() + ", Malla de Carga";
    }

    public double costo() {
        return 110000 + kiaPicanto.costo();
    }
}
