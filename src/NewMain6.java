
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Alumno
 */
public class NewMain6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i = 1, c1 = 0, c2 = 0, sueldo, suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("N° de empleados: ");
        n = sc.nextInt();
        System.out.println("ingrese su sueldo: ");
        while (i <= n) {
            sueldo = sc.nextInt();
            suma = suma + sueldo;
            if (sueldo > 100 && sueldo < 300) {
                c1++;
            } else {
                c2++;

            }
            i++;
        }
        System.out.println("dentro del rango: " + c1);
        System.out.println("mayor a 300: " + c2);
        System.out.println("pago total: " + suma);
    }
}
