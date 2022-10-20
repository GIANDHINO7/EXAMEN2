
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class NewMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        int piezas, i=1, cp=0; double perfil;
        System.out.println("N° de piezas");
        piezas = sc.nextInt();
        while(i<=piezas){
            System.out.println("perfil: ");
            perfil = sc.nextInt();
            if(perfil>1.20 && perfil<1.30){
                cp++;
            }
            i++;
        }
        System.out.println("cantidad de piezas aptas: "+cp);
    }
    
}
