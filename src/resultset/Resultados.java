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
        String info = "";//obtiene un array de toda los datos en string.        
        Estudiantes es = new Estudiantes();
        rs1 = es.getTabla();
        int cont=0;//vale 19 
        while(rs1.next()){  
              info=info+rs1.getInt(3)+' ';
              cont=rs1.getRow();             
        }
        //int entero=Integer.parseInt(info);
        char[] stringToCharArray = info.toCharArray();
        int[] arr=new int[cont];
        int cont2=0;
        String concat="";
        int j=0;
        for(int i=0;i<stringToCharArray.length;i++){
            if(Character.isWhitespace(stringToCharArray[i])){
            }else{
                concat=concat+stringToCharArray[i];
                if("10".equals(concat)){
                   arr[j]=Integer.parseInt(concat);  
                   cont2=0;
                   concat="10";
                }
                cont2++;
                if(cont2==2){
                   arr[j]=Integer.parseInt(concat); 
                   j++; 
                   cont2=0;
                   concat="";
                }else{
           
                }   
            }
        }
       for (int output2 : arr) {
            System.out.print(output2 +",");
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
        String info = "";//obtiene un array de toda los datos en string.        
        Estudiantes es = new Estudiantes();
        rs1 = es.getTabla();
        int cont=0;//vale 19 
        while(rs1.next()){  
              info=info+rs1.getInt(3)+' ';
              cont=rs1.getRow();             
        }
        //int entero=Integer.parseInt(info);
        char[] stringToCharArray = info.toCharArray();
        int[] arr=new int[cont];
        int cont2=0;
        String concat="";
        int j=0;
        for(int i=0;i<stringToCharArray.length;i++){
            if(Character.isWhitespace(stringToCharArray[i])){
            }else{
                concat=concat+stringToCharArray[i];
                if("10".equals(concat)){
                   arr[j]=Integer.parseInt(concat);  
                   cont2=0;
                   concat="10";
                }
                cont2++;
                if(cont2==2){
                   arr[j]=Integer.parseInt(concat); 
                   j++; 
                   cont2=0;
                   concat="";
                }else{
           
                }   
            }
        }
       for (int k=0;k<arr.length;k++) {
            if(arr[k]>=65){
               System.out.print(arr[k] +",");  
            }
        }
        return arr;
    }
    
    
}
