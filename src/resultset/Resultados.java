/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultset;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author diego
 */
public class Resultados {
    private ResultSet rs1;

    public Resultados() {
        rs1 = null;
    }
    
    /*
    Esta funcion obtiene un Result Set de una base de datos.
    La tabla solo tiene 3 campos, codigo, nombre y nota.
    Va a retornar un arreglo de enteros con las notas de los estudiantes
    1 xander 67
    2 pancho 65
    3 juana 64
    
    Retornaria un arreglo de [67,65,64]
    */
    
    public int [] arreglosetResultSetUno() throws SQLException{
        String info = "";
        
        Estudiantes es = new Estudiantes();
        rs1 = es.getTabla();
        int cont=0; 
        while(rs1.next()){  
              info=info+rs1.getInt(3)+" ";
              //cont=rs1.getRow();
              cont=cont+4;
        }
        int[] arr=new int[cont];
        for(int i=0;i<info.length();i++){
                 arr[i]=info.charAt(i);      
        }
        for(int k=0;k<arr.length;k++){
           System.out.println(arr[k]);  
        }
       
        return arr;
    }
    /*
    Esta funcion es similar con la anterior, con la diferencia que retornara un arreglo con 
    los alumnos que sacaron notas igual o mayor a 65
    
    1 xander 67
    2 pancho 65
    3 juana 64
    
    Retornaria un arreglo de [67,65]
    
    */
    //falto terminar.....
    public int [] getAlumnosquepasaron() throws SQLException{
        Estudiantes es = new Estudiantes();
        rs1 = es.getTabla();
        String info = "";
        int cont=0; 
        while(rs1.next()){  
              info=rs1.getInt(3)+" ";
              cont=cont+4;
        }
        int[] arr=new int[cont];
        for(int i=0;i<info.length();i++){
                 arr[i]=info.charAt(i);      
        }
        for(int k=0;k<arr.length;k++){
           System.out.println(arr[k]);  
        }
       
        return arr;
    }
    
    
}
