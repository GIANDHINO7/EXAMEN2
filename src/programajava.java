
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class programajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ht, s=0, the=0,a,i=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ingrese la cantidad de horas trbajadas:");
            ht=sc.nextInt();
            
            if(ht>35){
            the=ht-35;
            s=(the*22)+(35*15);
            }if(ht<=35){
                s=ht*15;
            }
            System.out.println("su salario es de;"+s);
            System.out.println("desea calcular otro salario");
            System.out.println("[1] SI");
            System.out.println("[2] NO");
            a=sc.nextInt();
            i++;
        }while(a==1);
        
    }
   
    
}
