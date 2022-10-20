

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class Cia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic  
        int venta =0, double comision=0;
        for (int x=0 ; x<10 ; x++){
        venta=Integer.parseInt(jOptionPane.showinputDialog("digite la venta del vendedor"));
        if (venta>=1000000&venta<=3000000){
            comision=venta*0.3;
            jOptionPane.showMesaageDialog(null,"la comision del vendedor es de: "+comision);
        }
        else {
            if (venta>=1000000&venta<=3000000){
            comision=venta*0.3;
            jOptionPane.showMesaageDialog(null,"la comision del vendedor es de: "+comision);
        }
            else{
             if (venta>=3000000&venta<5000000){
            comision=venta*0.4;
            jOptionPane.showMesaageDialog(null,"la comision del vendedor es de: "+comision);
            }
             else{
                 if(venta>=5000000&venta<7000000){
            comision=venta*0.5;
            jOptionPane.showMesaageDialog(null,"la comision del vendedor es de: "+comision);
             }
                 else{
                     if(venta>=7000000){
            comision=venta*0.6;
            jOptionPane.showMesaageDialog(null,"la comision del vendedor es de: "+comision);
                 }
                     if (venta>1000000){
            
        }
            
        }
        
