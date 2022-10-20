/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase03;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar [1-7]");
        int n = sc.nextInt();
        switch(n){
            case 1:System.out.println("DOMINGO");
               break;
            case 2:System.out.println("LUNES");
               break;
            case 3:System.out.println("MARTES");
               break;
            case 4:System.out.println("MIERCOLES");   
               break;
            case 5:System.out.println("JUEVES");
               break;
            case 6:System.out.println("VIERNES");
               break;
            case 7:System.out.println("SABADO");
               break;
            default:System.out.println("NO EXISTE OPCION DE DIA");
               break;
          
            
            
        }        
    }
    
}
