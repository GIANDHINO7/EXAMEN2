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
public class CLASE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("numero: ");
        int  numero = scanner.nextInt();
        if (numero%2==0){
            System.out.println("numero PAR: "+numero);
        }else{
            System.out.println("numero IMPAR: "+numero);
        }
       
        
            
    }
    
}
