
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class menu {

    private static int op;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, op;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar dos numeros:");
        x= sc.nextInt();
        y= sc.nextInt();
        System.out.println("MENU");
        System.out.println("[1].SUMA");
        System.out.println("[2].RESTA");
        System.out.println("[3].MULTIPLICACION");
        System.out.println("[4].DIVISION");
        System.out.println("[5].SALI");
        op = sc.nextInt();
        switch (op){
            case 1:System.out.println("Suma: "+(x+y));
               break;
            case 2:System.out.println("Resta:"+(x-y));
               break;
            case 3:System.out.println("Multiplicacion:"+(x*y));
               break;
            case 4:System.out.println("Division:"+(x/y));
               break;
            case 5:System.out.println("Adios!.....");
               System.exit(0);
               break;
            default:System.out.println("Eror!.....");
               break;
               
                    
        }
    }
    
}
