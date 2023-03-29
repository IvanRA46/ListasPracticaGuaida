/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaguiada_22110100;

/**
 *
 * @author Usuario
 */
public class Viaje {
    private int numero;
    private String pais;
    private String ciudad;
    private int numDias;
    private Viaje siguiente;

    public Viaje() {
        this.numero = -1;
        this.pais = "";
        this.ciudad = "";
        this.numDias = 0;
        this.siguiente = null;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public void setSiguiente(Viaje siguiente) {
        this.siguiente = siguiente;
    }

    public int getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNumDias() {
        return numDias;
    }

    public Viaje getSiguiente() {
        return siguiente;
    }
    
    
}
