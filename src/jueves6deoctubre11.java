
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ct, precio=0, cant=0; double desc=0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            System.out.println("cantidad: ");
            cant = sc.nextInt();
            System.out.println("precio: ");
            precio = sc.nextInt();
            if(cant>=100 && cant>=200){
                desc = precio*cant*0.12;
            }else if(cant>100 && cant<400){
                desc = precio*cant*0.15;
            }else if(cant>400){
                desc = precio*cant*0.18;
            }else{
                desc= 0;
            }
            }
            System.out.println("cantidad "+cant+"precio s/."+precio+"descuento"+desc+"costo total"+(cant*precio-desc));
        
    }
    
}
