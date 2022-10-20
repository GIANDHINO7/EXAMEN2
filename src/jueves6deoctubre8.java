
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, x, fac = 1, j=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar un numero: ");
        n = sc.nextInt();
        for (int i = 0; i<n; i++){
            System.out.println("ingrese numero");
            x = sc.nextInt();
            while (j<=x){
                fac = fac  *j;
                j++;
            }
            j=1;
            System.out.println("factrial "+x+"!= "+fac);
            fac=1;
        }
    }
    
}
