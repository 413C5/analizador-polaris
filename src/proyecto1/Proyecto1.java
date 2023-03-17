package proyecto1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alejandro
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProyectoParcial1 leng =new ProyectoParcial1(System.in);
            leng.Programa();  
        } catch (TokenMgrError e) {
            System.out.println("Error lexico:"+e.getMessage());
        }
        catch (ParseException e) {
            System.out.println("Error Sintactico:"+e.getMessage());
        }
        
    }
    
}
