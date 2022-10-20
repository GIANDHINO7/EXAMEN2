
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class NewMain5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int np, i=1 ;double altura, suma=0;
        np= sc.nextInt();
        System.out.println("ingresar altura");
        while(i<=np){
            altura  = sc.nextDouble();
            suma = suma + altura;
            i++;
        }
        System.out.println("promedio: "+suma/np);
    }
    
}
