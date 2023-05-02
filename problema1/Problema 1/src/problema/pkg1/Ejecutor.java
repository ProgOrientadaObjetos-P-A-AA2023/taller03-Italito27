package problema.pkg1;
import problema.pkg1.Terreno;
/**
 *
 * @author Italo
 */
public class Ejecutor {
    public static void main(String[] args) {
        /*
        Objeto
        */
        Terreno terreno1 = new Terreno();
        Terreno terreno2 = new Terreno();
        /*
        Valores de los atributos 1
        */
        double ancho1 = 16.5;
        double largo1 = 18.2;
        double valorMetroCuadrado1 = 1550.30;
        /*
        Valores de los atributos 2
        */
        double ancho2 = 17.5;
        double largo2 = 11.2;
        double valorMetroCuadrado2 = 1250.50;
        /*
        Objeto1
        */
        terreno1.establecerAncho(ancho1);
        terreno1.establecerLargo(largo1);
        terreno1.establecerArea();
        terreno1.establecerValorMetroCuadrado(valorMetroCuadrado1);
        terreno1.establecerCosto_terreno();
        /*
        Objeto2
        */
        terreno2.establecerAncho(ancho2);
        terreno2.establecerLargo(largo2);
        terreno2.establecerArea();
        terreno2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        terreno2.establecerCosto_terreno();
        /*
        Salida de Datos
        */
        System.out.printf("Datos del terreno:\n");
        System.out.printf("- Ancho: %.1f m\n", terreno1.obtenerAncho());
        System.out.printf("- Largo: %.1f m\n", terreno1.obtenerLargo());
        System.out.printf("- Valor del metro cuadrado: $%.2f\n", terreno1.obtenerValorMetroCuadrado());
        System.out.printf("- Área: %.2f m²\n", terreno1.obtenerArea());
        System.out.printf("- Costo del terreno: $%.2f\n", terreno1.obtenerCosto_terreno());
        
        System.out.printf("Datos del terreno:\n");
        System.out.printf("- Ancho: %.1f m\n", terreno2.obtenerAncho());
        System.out.printf("- Largo: %.1f m\n", terreno2.obtenerLargo());
        System.out.printf("- Valor del metro cuadrado: $%.2f\n", terreno2.obtenerValorMetroCuadrado());
        System.out.printf("- Área: %.2f m²\n", terreno2.obtenerArea());
        System.out.printf("- Costo del terreno: $%.2f\n", terreno2.obtenerCosto_terreno());
        

    }

}
