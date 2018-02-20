/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author diego
 */
public class logica {

    public logica() {
    }
    
    /*
    El ejercicio de buscar va a recibir de parametros un arreglo y una llave.
    El objetivo de este ejercicio es buscar la llave en el arreglo y devolver la
    posicion donde se encuentra la llave. Caso contrario que no esta, deberia retornar -1
    Ejemplo
        arreglo [4,5,6,8]
        buscar(arreglo,8)
    Va a retornar 3
    
    */
    public int buscar(int [] arreglo, int llave){
        boolean result =true;
        int contador=0;
       for(int i=0;i<arreglo.length;i++){
           if(arreglo[i]==llave){
               result=true;
               break;
           }else{
               result=false;
           }
           contador+=1;
        }
        if(result){
         System.out.println(contador);
        }else{
         System.out.println("-1");  
        }
        return -1; 
    }
    
    
    /*
    Este ejercio recibira de 3 argumentos de parametros.
    int year, int mes, int dia
    El objetivo del ejercicio es que tiene que retornar true si es una fecha valida y false si no lo es.
    Los año bisiesto se tienen que tomar en cuenta.
    
    Tome en consideracion que la funcion solo funcionara con años del 1-5000
    Si no cumple esos requisitos deberia de retorn false
    
    Estas fechas van a retornar true
    2014,6,4
    2016,2,29
    
    Estas fechas van a retorn false
    2015,2,30
    2015,4,31
    */
    
    public boolean fechavalida(int year, int mes, int dia){
        boolean result=true;
        int nDia=0;
        //condicione el anio ingresado...
        if(year<=5000){
            // verificamos que el mes ingresado es correcto.
            switch(mes){
                case 1: case 3: case 5: case 7: case 8: case 12: 
                    nDia=31;
                    break;
                case 4: case 6: case 9: case 11:
                    nDia=30;
                    break;
                case 2:
                    //verifico si el anio es bisiesto.
                    if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
                        nDia=29;
                    }else{
                        nDia=28;
                    }
                    break;
                default:
                    System.out.println("El mes"+ mes +" es incorrecto");
            }
        }
        if (dia>nDia){
            result=false;
        }else{
            result=true;
        }
        if (result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return false;
    }
    
    /*
    La siguiente funcion tiene que validar si un numero es primo.
    Retornara True si el numero es primo y false si no lo es
    */
    public boolean esPrimo(int year){
        boolean result =true;
        int cont=2;
        //mientras sea verdadero el resultado y el contador sea distinto de el year. entrara al bucle sino saldra.
        while ((result) && (cont!=year)){
            if(year%cont==0){
                result =false;
            }else{
                result=true;
                cont++;
            }
        }
        if (result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        return result;
    }
    
    
}
