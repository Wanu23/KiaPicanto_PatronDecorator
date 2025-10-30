import model.KiaPicanto;
import componentes.*;
import accesorios.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("   Kia Picanto - Cotizacion     ");
        System.out.println();
        

        KiaPicanto auto1 = new GTLineAT();
        auto1 = new BotonEncendido(auto1);
        auto1 = new RinAluminioPremium(auto1);
        auto1 = new AlarmaMatrix(auto1);
        
        System.out.println("Auto 1: " + auto1.getDescripcion());
        System.out.println("Costo total: $" + auto1.costo());
        System.out.println();


        KiaPicanto auto2 = new ZenithAT();
        auto2 = new RinAluminio(auto2);
        auto2 = new SensorParqueo(auto2);
        auto2 = new MallaCarga(auto2);
        
        System.out.println("Auto 2: " + auto2.getDescripcion());
        System.out.println("Costo total: $" + auto2.costo());
        System.out.println();


        KiaPicanto auto3 = new VibrantMT();
        auto3 = new Portabicicletas(auto3);
        auto3 = new TiroArrastre(auto3);
        auto3 = new FrenosSeguridad(auto3);
        
        System.out.println("Auto 3: " + auto3.getDescripcion());
        System.out.println("Costo total: $" + auto3.costo());
        System.out.println();


        KiaPicanto auto4 = new ZenithMT();
        auto4 = new TapeteTresPiezas(auto4);
        auto4 = new SensorParqueo(auto4);
        
        System.out.println("Auto 4: " + auto4.getDescripcion());
        System.out.println("Costo total: $" + auto4.costo());
    }
}