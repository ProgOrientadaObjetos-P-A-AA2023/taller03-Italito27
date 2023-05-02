package problema2;

/**
 *
 * @author Italo
 */
public class EquivalenteHora {
    /*
    Atributos
    */
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;
    /*
    Metodos 
    */
    public void establecerHoras(int h){
        horas = h;
    }
    
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    
    public void establecerSegundos(){
        segundos = horas * 3600;
    }
    public void establecerDias(){
        dias = (double)horas / 24;
    }
    
    public int obtenerHoras() {
        return horas;
    }
    public int obtenerMinutos() {
        return minutos;
    }
    public int obtenerSegundos() {
        return segundos;
    }
    public double obtenerDias() {
        return dias;
    }
}
