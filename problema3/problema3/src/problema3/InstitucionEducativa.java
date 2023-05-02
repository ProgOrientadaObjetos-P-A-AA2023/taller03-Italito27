
package problema3;

/**
 *
 * @author Italo
 */
public class InstitucionEducativa {
    /*
    Atributos
    */
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;
    
    /*
    Metodos
    */
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipoInstitucion(String n){
        tipoInstitucion = n;
    }
    
    public void establecerNumeroAlumnos(int n){
        numeroAlumnos= n;
    }
    
    public void establecerNumeroDocentes(int n){
        numeroDocentes= n;
    }
    
    public void establecerNumeroSedes(int n){
        numeroSedes= n;
    }
    public void establecerGastosProyectadosPorEstudiante(double n){
        gastosProyectadosPorEstudiante = n; 
    }
    
    public void establecerPresupuesto(){
        presupuesto = numeroAlumnos * gastosProyectadosPorEstudiante; 
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroSedes;
    }

    public double obtenerGastosProyectadosPorEstudiante() {
        return gastosProyectadosPorEstudiante;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
