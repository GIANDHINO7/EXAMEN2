
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class PIZZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int i,op ; double pt,pz=20,it;
        System.out.println("ingtresar el tipo de pizza.");
        String tipodepizza = sc.nextLine();
        System.out.println("el tipo de pizza es " +tipodepizza );
        
        System.out.println("ingrese la cantidad de ingredientes extras que prefiere");
        i=sc.nextInt();
        
        System.out.println("elija el tamaño de la pizza");
        System.out.println("[1]grande 16 pulgadas");
        System.out.println("[2]mediana 12 pulgadas");
        System.out.println("[3]pequeña 10 pulgadas");
        System.out.println("elija una opcion el [1-3]");
        op=sc.nextInt();
        
        switch (op) {
            case 1: System.out.println("el tamaño de la pizza es grande ");
                    it =i * 1.5;
                    System.out.println("numero de ingredientes extras"+i);
                    System.out.println("el precio original: "+ pz);
                    pt=pz + it;
                    System.out.println("el pecio total de la pizza es:"+pt);
                    break;
            case 2: System.out.println("el tamaño de la pizza es mediana ");
                    it =i * 1.5;
                    System.out.println("numero de ingredientes extras"+i);
                    System.out.println("el precio original: "+ pz);
                    pt=pz + it;
                    System.out.println("el pecio total de la pizza es:"+pt);
                    break;
            case 3: System.out.println("el tamaño de la pizza es pequeña ");
                    it =i * 1.5;
                    System.out.println("numero de ingredientes extras"+i);
                    System.out.println("el precio original: "+ pz);
                    pt=pz + it;
                    System.out.println("el pecio total de la pizza es:"+pt);
                    break;
            case 4: System.out.println("salir");
            
            default:System.out.println("no existe esa opcion ");
                    
                    
                    
        }
    }
    
}
