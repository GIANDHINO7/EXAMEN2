
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Ejerciciosselectia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    int n; double suma=0, i=1;
    System.out.println("ingresar valor de N: ");
    n = scanner.nextInt();
    while(i<=n){
        if (i%2==0)
           suma=suma+Math.sqrt(i);
        i++;
    }
        System.out.println("LA SUMA ES: 0"+suma);
    }
}