
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String codigo, op="", turno; int ht, to; //ht= horas trabajadas
        to = 30;
        double dc=0.05, sb, sn, tarifa, st=0;
        do{
            System.out.println("Código: ");
            codigo = sc.next();
            System.out.println("Horas trabajadas: ");
            ht = sc.nextInt();
            System.out.println("Turno [M,T,N]: ");
            turno = sc.next();
            turno = turno.toUpperCase();  
            System.out.println("Turno: "+turno);
            if(turno.equals("T")){
                tarifa = to + to*0.012;
            }else if(turno.equals("N")){            
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
    

