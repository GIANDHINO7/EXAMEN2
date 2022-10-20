
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, j=1, fac=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar un numero: ");
        n = sc.nextInt();
        for(int i=2;i<=n;i++){
            while(j<=i){
                fac = fac * j;
                j++;
            }
            System.out.println("factorial "+i+"!= "+fac);
        }
    }
    
}
