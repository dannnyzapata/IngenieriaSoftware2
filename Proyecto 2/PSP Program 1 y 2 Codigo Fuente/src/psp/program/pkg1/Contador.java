/******************************************************************/ 
/* Programa:  2                                                        
/* Nombre: Daniel Alberto Zapata Jimenez                                                                        
/* Fecha: 17/10/2021                
/* Descripción: Contador fisico de lineas de codigo para java
/******************************************************************/
/* CONTENIDO:                                                                                                    
/*    Instrucciones para ser re utilizado
/*    Instrucciones de modificaciones
/*    Instrucciones de compilacion                                                                                    
/*    Includes/Imports
/*import java.io.IOException;
/*import java.nio.file.Files;
/*import java.nio.file.Path;
/*import java.nio.file.Paths;
*/
                                                                                                   
/*   Source code en C:\Users\Danny\Desktop\Libros Septimo\Noveno\Software\PSP\Proyecto 1:                                                                   
/*    Contador() la clase primaria
/*    readFile()
/*       
/******************************************************************/
/******************************************************************/ 
/* INSTRUCCIONES PARA RE UTILIZAR
/*    En caso de querer re utilizar este codigo, lo unico que debes cambiar es el nombre del archivo que lee
/*    fileReader(), tiene que ser el camino absoluto.   
*/
/******************************************************************/
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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/******************************************************************/ 
/*
/*    PROGRAMA PRINCIPAL
/*    Esta sección es la principal, contiene los getters y setters así como los valores que 
/*    usaran por el resto del codigo
*/
/******************************************************************/
public class Contador {
    String Camino = "C:\\Users\\Danny\\Desktop\\Libros Septimo\\Noveno\\Software\\PSP\\Proyecto 1\\PSP Program 1 Codigo Fuente\\src\\psp\\program\\pkg1\\Contador.java"; //Esta función convierte una string que contiene el camino absoluto del archivo a una variable tipo path para poder ser usada por el metodo
    Path Direccion = Paths.get(Camino);  //Convierte la variable Dirección se tring a Path para poder ser usada por el metodo   
/******************************************************************/ 
/*
/*   Lee los archivos de java para despues imprimir la cantidad de lineas de codigo utiles
*/
/******************************************************************///     
    
    public void readFile() throws IOException { //Lee el archivo que vamos a contar las lineas
        long TotalLineas = Files.lines(Direccion).filter((line -> line.length() > 0)).filter(line -> !line.startsWith("*/")).filter(line -> !line.startsWith("/*")).count(); //Utiliza las libreria Files para filtrar todos las lineas vacias o que empiecen con un comentario a corde a nuestro sistema de conteo          
        System.out.println("El Numero total de lineas sin comentarios o espacios  blancos del archivo es: ");
        System.out.println(TotalLineas); //Estas dos últimas lineas imprimen el pantalla el total de lineas utiles del codigo                    
    }                
}
    

