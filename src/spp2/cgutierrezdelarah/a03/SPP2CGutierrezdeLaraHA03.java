/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.cgutierrezdelarah.a03;
import java.util.Scanner;
/**
 *Calcular la hipotenusa 
 * @author alumno
 */
public class SPP2CGutierrezdeLaraHA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c;
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese un cateto");
        double a=sc.nextDouble();
        System.out.println("Ingrese el siguiente cateto");
        double b=sc.nextDouble();
        c =Math.sqrt((a*a+b*b));
        System.out.println("La hipotenusa es" +c);
        
    }
    
}
