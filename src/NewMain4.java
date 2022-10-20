
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class NewMain4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i=1,c1=0,c2=0,nota; 
        System.out.println("notas: ");
        while(i<=10){
            nota = sc.nextInt();
            if(nota>=7){
                c1++;
            }else{
                c2++;
            }
         i++;
        }
        System.out.println("mayores o iguales a 7: "+c1);
        System.out.println("menores a 7: "+c2);
    }
    
}
