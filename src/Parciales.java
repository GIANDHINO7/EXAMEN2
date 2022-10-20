
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Parciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String nombre;
        double estatura;
        
        System.out.println("ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("ingrese su estatura: ");
        estatura = sc.nextDouble();
        
        System.out.println("SE LLAMA "+nombre+ "MIDE "+estatura);
    }
    
}
