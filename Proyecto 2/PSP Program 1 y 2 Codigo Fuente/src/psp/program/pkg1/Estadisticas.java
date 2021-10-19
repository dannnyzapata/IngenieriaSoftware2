/******************************************************************/ 
/* 
/*CABEZERA
/*Programa:  1                                                         
/* Nombre: Daniel Alberto Zapata Jimenez                                                                        
/* Fecha: 17/10/2021                
/* Descripción: Programa que saca la media y desviación estandar de una lista de datos para despues mostrar la información en pantalla
/******************************************************************/
/******************************************************************/ 
/* CONTENIDO:                                                                                                    
/*    Instrucciones para ser re utilizado
/*    Instrucciones de modificaciones
/*    Instrucciones de compilacion                                                                                    
/*    Includes/Imports
/*    import java.io.BufferedReader;
/*    import java.io.FileNotFoundException;
/*    import java.io.FileReader;
/*    import java.io.IOException;
/*    import java.util.ArrayList;
/*    import java.util.List;
/*    import java.util.logging.Logger;                                                                                                    
/*   Source code en C:\Users\Danny\Desktop\Libros Septimo\Noveno\Software\PSP\Proyecto 1:                                                                   
/*    Estadisticas()
/*    Getter y Setters
/*    readFile()
/*    calculateMean()   
/*    calculatestdDev()
/*    showReports()        
/******************************************************************/
/******************************************************************/ 
/* INSTRUCCIONES PARA RE UTILIZAR
/*    En caso de querer re utilizar este codigo, lo unico que debes cambiar es el nombre del archivo que lee
/*    fileReader().
/*    Debes tener cuidado, el archivo .txt debe estar en la carpeta root y solo debe contener valores numericos. 
*/
/******************************************************************/
/* INSTRUCCIONES PARA Modificarse
/*    Se puede utilizar los calculos de la forma que sea deseado, ya sea para hacer otros calculos o mover alguna cosa necesaria
*/
/******************************************************************/
/* INSTRUCCIONES PARA Compilación
/*   Cualquier IDE de Java debería poder compilar este programa, compilación hecha en netbeans 
*/
/******************************************************************/

package psp.program.pkg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/******************************************************************/ 
/*
/*    PROGRAMA PRINCIPAL
/*    Esta sección es la principal, contiene los getters y setters así como los valores que 
/*    usaran por el resto del codigo
*/
/******************************************************************/

public class Estadisticas {
    private int n;
    private double mean;
    private double stdDev;
    private List<Float> dataList = new ArrayList<>();

    public Estadisticas() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getStdDev() {
        return stdDev;
    }

    public void setStdDev(double stdDev) {
        this.stdDev = stdDev;
    }

    public List<Float> getDataList() {
        return dataList;
    }

    public void setDataList(List<Float> dataList) {
        this.dataList = dataList;
    }
    
/******************************************************************/ 
/*
/*   Lee un archivo de texto con valores numericos
*/
/******************************************************************/// 
    public void readFile() {
        
        try {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        
            try{
                StringBuilder sb = new StringBuilder();
                String line = br.readLine(); 
                    while (line != null){
                    float number = Float.parseFloat(line);
                    dataList.add (number);
                    line = br.readLine();
            }
            } catch (IOException | NullPointerException ex){
            System.out.println("No se lee el archivo");
            }
                                  }catch (IOException | NullPointerException ex){
            System.out.println("No se lee el archivo");
        }                       
    }
    
/******************************************************************/ 
/*
/*   Calcula la media
*/
/******************************************************************/// 
    public Double calculateMean(){
        double sum = 0.0;
        for (Float value: dataList){
            sum += value;
        }
        this.setN(this.getDataList().size());
        this.setMean (sum / this.getN());
        return this.getMean();
    }
    
/******************************************************************/ 
/*
/*   Calcula la desviación estandar
*/
/******************************************************************/// 
    public Double calculatestdDev(){
        this.calculateMean();
        double sum = 0.0;
        for (Float value: dataList){
            sum += Math.pow(value - this.getMean(), 2);
        }
        this. setStdDev(Math.sqrt(sum / (this.getN() - 1)));
        
        return this.getStdDev();
    }
    
/******************************************************************/ 
/*
/*  Muestra los resultados
*/
/******************************************************************/// 
    public void showReports(){
        for (Float value: dataList){
            System.out.println("Datos: " + value);
        }
        
        this.calculatestdDev();
        System.out.println("Media: " + this.getMean());
        System.out.println("Desviación Estandar: " + this.getStdDev());
        
    }
    
}
