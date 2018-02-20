/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

//import java.util.Scanner;
import java.sql.SQLException;
import logica.logica;
import resultset.Resultados;


/**
 *
 * @author diego
 */
public class JavaApplication8 {
logica callLogica =new logica();
Resultados callResultados=new Resultados();
//Scanner teclado=new Scanner(System.in);
    /**
     * @param arg
     */
    public static void main(String arg[]) throws SQLException{
         System.out.println("**********Funcion buscar************");
         System.out.print("==> ");
         JavaApplication8 call =new JavaApplication8();
         call.buscar();
         System.out.println("**********Funcion FechaValida************");
         System.out.print("==> ");
         call.fechavalida();
         System.out.println("**********Funcion esPrimo************");
         System.out.print("==> ");
         call.esPrimo();
         System.out.println("**********Funcion Estudiantes************");
         System.out.print("==> ");
         call.estudiantes();
         
     }

    public void buscar(){ 
        //ingreso de datos a la funcion buscar.
         int llave=1620;
         int[] arreglo={1614,1615,1616,1617,1618,1619,1620};
         callLogica.buscar(arreglo, llave); 
    }
  
    public void fechavalida(){
        //ingreso de datos a funcion fechaValida.
        int year=2014;
        int mes=6;
        int dia=4;
        callLogica.fechavalida(year, mes, dia);
        
    }
    public void esPrimo(){
        //ingreso de datos a funcion esPrimo.
        int year=997;
        callLogica.esPrimo(year);   
    }
    public void estudiantes() throws SQLException{
        //ingreso de datos a funcion esPrimo.
        //int year=997;
        callResultados.arreglosetResultSetUno();
       // callResultados.ResultSetToArray();
    }
}
