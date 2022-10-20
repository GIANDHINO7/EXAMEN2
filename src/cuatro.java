
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int p,op, pc, pt;
        System.out.println("ingrese el costo de su compra:");
        p = sc.nextInt();
        System.out.println("seleccine un color de la bolita:" );
        System.out.println("ingrese la cantidad de ingredientes extras que prefiere");
        p=sc.nextInt();
        
        System.out.println("elija el tamaño de la pizza");
        System.out.println("[1]rojo");
        System.out.println("[2]amarillo");
        System.out.println("[3]blanco");
        op=sc.nextInt();
        
        switch (op) {
            case 1: System.out.println("selecione la bolita de color rojo");
                    System.out.println("felicitaciones obtuvo un descuento de 40%");
                    pc=(int)(p*04);
                    pt= p-pc;
                    System.out.println("el costo total de su compra es de s"+pt);
                    break;
            case 2: System.out.println("selecione la bolita de color amarilla");
                    System.out.println("felicitaciones obtuvo un descuento de 25%");
                    pc=(int)(p*25);
                    pt= p-pc;
                    System.out.println("el costo total de su compra es de s"+pt);
                    break;
            default:
                    System.out.println("seleccione la bolita de color blanca");
                    System.out.println("no cnsiguio ningun descuento");
                    System.out.println("el costo total de su compra es de s"+p);
                    break;
            
            
            
    }
    
}
