package lab3p2_kevinbanegas_12211129;

import java.util.ArrayList;

public class CombustLiqui extends Cohetes{
    protected int litrosGas;

    public CombustLiqui(int litrosGas, int pesoSoport, String nombre, int numSerie, int potencia) {
        super(pesoSoport, nombre, numSerie, potencia);
        this.litrosGas = litrosGas;
    }

    public int getLitrosGas() {
        return litrosGas;
    }

    public void setLitrosGas(int litrosGas) {
        this.litrosGas = litrosGas;
    }

    public int getPesoSoport() {
        return pesoSoport;
    }

    public void setPesoSoport(int pesoSoport) {
        this.pesoSoport = pesoSoport;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "CombustLiqui{" + "litrosGas=" + litrosGas + '}';
    }
    
    
    
}
