
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Parcialesejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double radio,diametro,area;
        System.out.println("elije la figura");
        System.out.println("dame el area del circulo");
        radio=teclado.nextDouble();
        diametro=radio*2;
        area=(3.14)*(radio*radio);
        System.out.println("el diametro del circulo es" +diametro);
        System.out.println("el area del circuo es" +area);
        Scanner entrada = new Scanner(System.in);
        float base;
        float altura;
        
        System.out.println("dame la base del triangulo");
        base = entrada.nextFloat ();
        System.out.println("dame la altura del triangulo");
        altura = entrada.nextFloat ();
        
        area= (base * altura)/2;
        
        System.out.println("el area del triangulo es:"+" "+area);
    }
    
}
