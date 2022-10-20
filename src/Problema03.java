
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar:");
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("RANGO [0-3]");
               break;
            case 2:System.out.println("RANGO [0-3]");
               break;
            case 3:System.out.println("RANGO [0-3");
               break; 
            case 4:System.out.println("RANGO [4-7");
               break;
            case 5:System.out.println("RANGO [4-7");
               break;
            case 6:System.out.println("RANGO [4-7");
               break; 
            case 7:System.out.println("RANGO [4-7");
               break;
            case 8:System.out.println("RANGO [8-10");
               break;
            case 9:System.out.println("RANGO [8-10");
               break;
            case 10:System.out.println("RANGO [8-10");
               break;
            default:System.out.println("FUERA DE RANGO");
               break;
        }
    }
    
}
