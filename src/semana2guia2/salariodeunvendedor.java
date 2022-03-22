/*
Una empresa de venta de computadoras paga a su personal de ventas un salario de $300,00 más una comisión de 
$50,00 por computadora vendida. Diseñar un programa para calcular el salario de un vendedor en un determinado mes, 
conociendo el nº de computadoras vendidas. Al salario devengado se debe de retener el 10% en concepto de renta. Imprimir 
el nombre del vendedor, el salario devengado y la retención de la renta
 */
package semana2guia2;

import java.util.Scanner;

public class salariodeunvendedor {
    public static void main(String[] args) {
       
        String nombre;
        int numcomputadoras;
        double salario,comicionporpc,renta, salariodevengado;
        
        salario=300.00;
        comicionporpc=50.00;
        
        Scanner teclado = new Scanner(System.in);
             
        System.out.println("ingrese el nmbre de el vendedor");
        nombre = teclado. nextLine();  
        System.out.println("Ingresar cantidad de pc vendidas en un mes :");
        numcomputadoras= teclado.nextInt();
        
        salariodevengado=comicionporpc*numcomputadoras+salario;
        renta=salariodevengado*0.10;     
         
         
           System.out.println("El monbre del vendedoe es  : " + nombre);
           System.out.println("El salario devengado es : " + salariodevengado);
           System.out.println("La retencion de la renta es : " + renta);
          
    }

               
    
}
