package problema3;

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
        InstitucionEducativa institucion1 = new InstitucionEducativa();
        InstitucionEducativa institucion2 = new InstitucionEducativa();
        /*
        Valor 1
        */
        String nombre1 = "UTPL";
        String tipoInstitucion1 ="Universidad";
        int numeroAlumnos1 =4000;
        int numeroDocentes1 =2500;
        int numeroSedes1 =100;
        double gastosProyectadosPorEstudiante1 =600.75 ; 
        
        /*
        Valor 2
        */
        String nombre2 = "Calasanz";
        String tipoInstitucion2 ="Colegio";
        int numeroAlumnos2 =3000;
        int numeroDocentes2 =150;
        int numeroSedes2 =1;
        double gastosProyectadosPorEstudiante2 =125.50 ; 
        
        /*
        Objeto 
        */
        institucion1.establecerNombre(nombre1);
        institucion1.establecerTipoInstitucion(tipoInstitucion1);
        institucion1.establecerNumeroAlumnos(numeroAlumnos1);
        institucion1.establecerNumeroDocentes(numeroDocentes1);
        institucion1.establecerNumeroSedes(numeroSedes1);
        institucion1.establecerGastosProyectadosPorEstudiante(gastosProyectadosPorEstudiante1);
        institucion1.establecerPresupuesto();
        
        /*
        Objeto 2
        */
        institucion2.establecerNombre(nombre2);
        institucion2.establecerTipoInstitucion(tipoInstitucion2);
        institucion2.establecerNumeroAlumnos(numeroAlumnos2);
        institucion2.establecerNumeroDocentes(numeroDocentes2);
        institucion2.establecerNumeroSedes(numeroSedes2);
        institucion2.establecerGastosProyectadosPorEstudiante(gastosProyectadosPorEstudiante2);
        institucion2.establecerPresupuesto();
        
        /*
        Salida de Datos
        */
            System.out.printf("Nombre de la Institución: %s%n", institucion1.obtenerNombre());
            System.out.printf("Tipo de Institución: %s%n", institucion1.obtenerTipoInstitucion());
            System.out.printf("Número de Alumnos: %d%n", institucion1.obtenerNumeroAlumnos());
            System.out.printf("Número de Docentes: %d%n", institucion1.obtenerNumeroDocentes());
            System.out.printf("Número de Sedes: %d%n", institucion1.obtenerNumeroSedes());
            System.out.printf("Gastos Proyectados por Estudiante: %.2f%n", institucion1.obtenerGastosProyectadosPorEstudiante());
            System.out.printf("Presupuesto: %.2f%n", institucion1.obtenerPresupuesto());
            System.out.printf("%n" );
            System.out.printf("Nombre de la Institución: %s%n", institucion2.obtenerNombre());
            System.out.printf("Tipo de Institución: %s%n", institucion2.obtenerTipoInstitucion());
            System.out.printf("Número de Alumnos: %d%n", institucion2.obtenerNumeroAlumnos());
            System.out.printf("Número de Docentes: %d%n", institucion2.obtenerNumeroDocentes());
            System.out.printf("Número de Sedes: %d%n", institucion2.obtenerNumeroSedes());
            System.out.printf("Gastos Proyectados por Estudiante: %.2f%n", institucion2.obtenerGastosProyectadosPorEstudiante());
            System.out.printf("Presupuesto: %.2f%n", institucion2.obtenerPresupuesto());
    }
    
}
