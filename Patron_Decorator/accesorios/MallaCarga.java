package accesorios;
import model.KiaPicanto;

public class MallaCarga extends AccesorioDecorator {
    kiapicanto kiapicanto;

    Public MallaCarga(kiapicanto kiapicanto) {
        this.kiapicanto = kiapicanto;
    }

    public String getDescripcion() {
        return kiapicanto.getDescripcion() + ", Malla de Carga";
    }

    public double costo() {
        return 110000 + kiapicanto.costo();
    }
}
