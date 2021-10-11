/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package psp.program.pkg1;

import java.io.IOException;

/**
 *
 * @author Danny
 */
public class PSPProgram1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Estadisticas data = new Estadisticas();
        data.readFile();
        data.showReports();
    }
    
}
