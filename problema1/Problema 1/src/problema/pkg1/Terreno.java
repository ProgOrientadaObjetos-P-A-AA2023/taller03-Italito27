
package problema.pkg1;

/**
 *
 * @author Italo
 */
public class Terreno {
    
    /*
    Atributos
    */
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    /*
    Metodos
    */
    public void establecerAncho(double n){
        ancho = n;
    }
    
    public void establecerLargo(double n){
        largo = n;
    }
    
    public void establecerArea(){
        area = ancho*largo;
    }
    
    public void establecerValorMetroCuadrado(double n){
        valorMetroCuadrado = n; 
    }
    
    public void establecerCosto_terreno(){
        costo_terreno = valorMetroCuadrado*area;
    }
    
     public double obtenerCosto_terreno() {
        return costo_terreno;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }
}
