package problema4;

/**
 *
 * @author Italo
 */
public class EquipoCelular {
    /*
    Atributos
    */
    
    private String sistemaOperativo;
    private String direccionMac;
    private String imei;
    private double tamanoPantalla;
    private double ivaPorcentaje;
    private double costoInicial;
    private double ivaCostoInicial;
    private double costoFinal;
    
    
    /*
    Metodos
    */
     public void establecerSistemaOperativo(String n){
        sistemaOperativo = n;
    }
    
    public void establecerDireccionMac(String n){
        direccionMac = n;
    }
    
    public void establecerImei(String n){
        imei = n;
    }
    
    public void establecerTamanoPantalla(double n){
        tamanoPantalla= n;
    }
    
    public void establecerCostoInicial(double n){
        costoInicial= n;
    }
    
    public void establecerIvaPorcentaje(double n){
        ivaPorcentaje= n;
    }
    public void establecerIvaCostoInicial(){
        ivaCostoInicial = costoInicial * ivaPorcentaje / 100;
    }
    
    public void establecerCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial; 
    }
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerImei() {
        return imei;
    }
    
    public double obtenerTamanoPantalla() {
        return tamanoPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerIvaPorcentaje() {
        return ivaPorcentaje;
    }
    
    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }
    public double getCostoFinal() {
        return costoFinal;
    }

}   

