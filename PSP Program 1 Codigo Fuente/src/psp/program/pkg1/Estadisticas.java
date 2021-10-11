/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psp.program.pkg1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Danny
 */
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
    
    // Lee un archivo de texto con numeros enteros
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
    
    //Calcula media
    public Double calculateMean(){
        double sum = 0.0;
        for (Float value: dataList){
            sum += value;
        }
        this.setN(this.getDataList().size());
        this.setMean (sum / this.getN());
        return this.getMean();
    }
    
    //Calcula la media
    public Double calculatestdDev(){
        this.calculateMean();
        double sum = 0.0;
        for (Float value: dataList){
            sum += Math.pow(value - this.getMean(), 2);
        }
        this. setStdDev(Math.sqrt(sum / (this.getN() - 1)));
        
        return this.getStdDev();
    }
    
    //Muestra los resultados
    public void showReports(){
        for (Float value: dataList){
            System.out.println("Datos: " + value);
        }
        
        this.calculatestdDev();
        System.out.println("Media: " + this.getMean());
        System.out.println("Desviación Estandar: " + this.getStdDev());
        
    }
    
}
