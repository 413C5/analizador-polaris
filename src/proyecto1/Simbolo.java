/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Objects;

/**
 *
 * @author Alejandro
 */
public class Simbolo {
    //Que nombre y que tipo tienen la variable
    public String nombre;
    public String tipo;
    
    //Metodo toSring()
    @Override
    public String toString(){
        String s=nombre+"\t"+tipo;
        return s;
    }
    
    //Sirve para comparar 2 objetos de tipo simbolo
    @Override
    public boolean equals(Object o){
        if(o instanceof Simbolo){
            Simbolo t=(Simbolo)o;
            if(this.nombre.equals(t.nombre)){
                return true;
            }
            return false;
        }
        return false;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
}
