
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ec;
        double sb, b=0, st=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar estado civil y sueldo base");
        sb = sc.nextDouble();
        ec = sc.next();
           switch (ec){
             case "S": case "s":
               b = sb*0.05;
               st = sb + b;
               break;
             case "C": case "c":
               b = sb*0.01;
               st = sb + b;
             case "V": case "v":
               b = sb*0.15;
               st = sb + b;
             case "D": case "d":
               b = 
                       
           }
        
                
    }
    
            
}
