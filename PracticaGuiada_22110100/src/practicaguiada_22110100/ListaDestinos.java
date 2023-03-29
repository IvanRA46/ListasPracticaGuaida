/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaguiada_22110100;

/**
 *
 * @author Usuario
 */
public class ListaDestinos {
    private Viaje destinos;

    public ListaDestinos() {
        this.destinos = null;
    }
    
    public void agregar(int n, String p, String c, int nd){
        Viaje nuevo = new Viaje();
        nuevo.setNumero(n);
        nuevo.setPais(p);
        nuevo.setCiudad(c);
        nuevo.setNumDias(nd);
        
        if(destinos==null){
            destinos = nuevo;
        }else{
                Viaje aux = destinos;
                while(aux.getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(nuevo);
            }
    }
    
    public String recorrerDestinos(){
        String datos = "";
        Viaje aux = destinos;
        if(destinos == null){
            datos = "La lista esta vacia";
        }else{
            while(aux != null){
                datos += "Numero: " + aux.getNumero() + "\n";
                datos += "Viaje: " + aux.getPais() + "\n";
                datos += aux.getCiudad() + aux.getNumero() + "\n";
                datos += "Dias: " + aux.getNumero() + "\n";
                aux = aux.getSiguiente();
            }
        }
        return datos;
    }
    
    public boolean estaVacia(){
        if(destinos == null){
            return true;
        }else{
            return false;
        }
    }
}
