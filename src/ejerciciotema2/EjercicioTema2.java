/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotema2;

/**
 *
 * @author mpolo
 */
public class EjercicioTema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("%10.2f%n",precioConIva(1500.20d));
    }
    
    static double precioConIva(double precio){
        //En mexico el iva es del 16%
        return precio * 1.16;
    }
    
}
