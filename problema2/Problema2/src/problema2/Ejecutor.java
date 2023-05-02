package problema2;
import problema2.EquivalenteHora;
/**
 *
 * @author Italo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Objetos
        */
        EquivalenteHora equi1 = new EquivalenteHora();
        EquivalenteHora equi2 = new EquivalenteHora();
       /*
        Valores de los atributos
        */
       int horas1 =12; 
       int horas2 = 36;
       /*
       Objeto 1 
       */
       equi1.establecerHoras(horas1);
       equi1.establecerMinutos();        
       equi1.establecerSegundos();     
       equi1.establecerDias();      
       /*
       Objeto 2
       */
       equi2.establecerHoras(horas2);
       equi2.establecerMinutos();        
       equi2.establecerSegundos();     
       equi2.establecerDias(); 
       
       System.out.printf("%d horas son equivalentes a:\n", equi1.obtenerHoras());
        System.out.printf("%d minutos\n", equi1.obtenerMinutos());
        System.out.printf("%d segundos\n", equi1.obtenerSegundos());
        System.out.printf("%.2f días\n", equi1.obtenerDias());

        System.out.printf("\n%d horas son equivalentes a:\n", equi2.obtenerHoras());
        System.out.printf("%d minutos\n", equi2.obtenerMinutos());
        System.out.printf("%d segundos\n", equi2.obtenerSegundos());
        System.out.printf("%.2f días\n", equi2.obtenerDias());
    }
    
}
