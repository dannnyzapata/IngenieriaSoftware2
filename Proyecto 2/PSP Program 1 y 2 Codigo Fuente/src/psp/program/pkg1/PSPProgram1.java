package psp.program.pkg1;

import java.io.IOException;


public class PSPProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Estadisticas data = new Estadisticas();
        Contador contar = new Contador ();
        //data.readFile();
        //data.showReports();
        contar.readFile();
    }
    
}
