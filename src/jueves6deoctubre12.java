/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class jueves6deoctubre12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pa = 25, pb=19.9;
        
        for(int i=1994;i<2022;i++){
            pa = pa + pa*0.02;
            pb = pb + pb*0.03;
            if(pb>pa){
                System.out.println("en el año: "+i);
                break;
            }
        }
    }
    
}
