
package problema4;
import problema4.EquipoCelular;
/**
 *
 * @author Italo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de dos objetos EquipoCelular
        EquipoCelular equipo1 = new EquipoCelular();
        EquipoCelular equipo2 = new EquipoCelular();
        
        
        /*
        Valores de los atributos
        */
        String sistemaOperativo ="iOS" ;
        String direccionMac = "00-0C-29-8E-02-33";
        String imei ="123456789012345";
        double tamanoPantalla =6.2;
        double costoInicial = 700.50 ;
        double ivaPorcentaje = 12;
        
        String sistemaOperativo1 ="Android" ;
        String direccionMac1 = "00-0C-29-8E-02-44";
        String imei1 ="123456789012345";
        double tamanoPantalla1 =7.3;
        double costoInicial1 = 920.10 ;
        double ivaPorcentaje1 = 12;
        
        /*
        Objeto 1
        */
        equipo1.establecerSistemaOperativo(sistemaOperativo);
        equipo1.establecerDireccionMac(direccionMac);
        equipo1.establecerImei(imei);
        equipo1.establecerTamanoPantalla(tamanoPantalla);
        equipo1.establecerCostoInicial(costoInicial);
        equipo1.establecerIvaPorcentaje(ivaPorcentaje);
        equipo1.establecerIvaCostoInicial();
        equipo1.establecerCostoFinal();
        /*
        Objeto 2
        */
        equipo2.establecerSistemaOperativo(sistemaOperativo1);
        equipo2.establecerDireccionMac(direccionMac1);
        equipo2.establecerImei(imei1);
        equipo2.establecerTamanoPantalla(tamanoPantalla1);
        equipo2.establecerCostoInicial(costoInicial1);
        equipo2.establecerIvaPorcentaje(ivaPorcentaje1);
        equipo2.establecerIvaCostoInicial();
        equipo2.establecerCostoFinal();
        
        /*
        Salida
        */
    System.out.printf("Datos del Equipo Celular 1:\n");
        System.out.printf("Sistema Operativo: %s\n", equipo1.obtenerSistemaOperativo());
        System.out.printf("Dirección MAC: %s\n", equipo1.obtenerDireccionMac());
        System.out.printf("Información IMEI: %s\n", equipo1.obtenerImei());
        System.out.printf("Tamaño de Pantalla: %.1f pulgadas\n", equipo1.obtenerTamanoPantalla());
        System.out.printf("Costo Inicial: $%.2f\n", equipo1.obtenerCostoInicial());
        System.out.printf("IVA en Porcentaje: %.0f%%\n", equipo1.obtenerIvaPorcentaje());
        System.out.printf("IVA del Costo Inicial: $%.2f\n", equipo1.obtenerIvaCostoInicial());
        System.out.printf("Costo Final: $%.2f\n", equipo1.getCostoFinal());
        
        System.out.printf("%n" );
        
        System.out.printf("Datos del Equipo Celular 2:\n");
        System.out.printf("Sistema Operativo: %s\n", equipo2.obtenerSistemaOperativo());
        System.out.printf("Dirección MAC: %s\n", equipo2.obtenerDireccionMac());
        System.out.printf("Información IMEI: %s\n", equipo2.obtenerImei());
        System.out.printf("Tamaño de Pantalla: %.1f pulgadas\n", equipo2.obtenerTamanoPantalla());
        System.out.printf("Costo Inicial: $%.2f\n", equipo2.obtenerCostoInicial());
        System.out.printf("IVA en Porcentaje: %.0f%%\n", equipo2.obtenerIvaPorcentaje());
        System.out.printf("IVA del Costo Inicial: $%.2f\n", equipo2.obtenerIvaCostoInicial());
        System.out.printf("Costo Final: $%.2f\n", equipo2.getCostoFinal());
        
    }
    
    
}
