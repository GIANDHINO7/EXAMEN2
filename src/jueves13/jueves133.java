/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jueves13;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class jueves133 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         String socios, op="", deporte; int ht, to; //ht= horas trabajadas
        to = 30;
        double dc=0.05, sb, sn, tarifa, st=0;
        do{
            System.out.println("socios: ");
            socios = sc.next();
            System.out.println("Horas trabajadas: ");
            ht = sc.nextInt();
            System.out.println("tipo de deporte [F,V,R,H,T]: ");
            deporte = sc.next();
            deporte = deporte.toUpperCase();  
            System.out.println("Turno: "+deporte);
            if(deporte.equals("T")){
                tarifa = to + to*0.012;
            }else if(deporte.equals("N")){            
                tarifa = to + to*0.015;
            }else{
                tarifa = to;
            }
            sb = ht*tarifa;
            sn = sb - sb*dc;
            System.out.println("Sueldo Bruto: "+sb);
            System.out.println("Sueldo Neto:" +sn);
            st = st + sb;
            System.out.println("¿Más trabajadores (S/N)?");
            op = sc.next();
            op = op.toUpperCase();
        }while(!op.equals("N"));
        System.out.println("Sueldo total de los trabajadores: "+st);
    }
    
}
