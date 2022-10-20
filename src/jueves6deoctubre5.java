
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n , f=1, i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar numero: ");
        n = sc.nextInt();
        while(f<=n){
            f = f*i;
            i++;
        }
        System.out.println("El factorial de "+n+"!= "+f);
}}
