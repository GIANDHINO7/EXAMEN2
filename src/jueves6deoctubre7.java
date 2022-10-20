
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, j=1, fac=1, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar un numero: ");
        x = sc.nextInt();
        while(j<=x){
            fac = fac*j;
            j++;
        }
        j=1;
        System.out.println("factrial "+x+"!= "+fac);
        fac=1;
    }
    
}
