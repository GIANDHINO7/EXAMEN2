
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, op; double res=0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero: ");
        x = sc.nextInt();
        op = x%4;
        switch(op){
            case 0:
                res= Math.pow(x,3);
                break;
            case 1: res = (Math.pow(x,2)-14)/Math.pow(x,3);
                break;
            case 2: res = Math.pow(x,3)+5;
                break;
            case 3: res=0;
                break;
            default:break;
            
            
            
                    
        }
        System.out.println("resultado"+res);
       
               
         
         
    }
    
}
