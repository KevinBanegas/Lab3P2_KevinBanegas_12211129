package lab3p2_kevinbanegas_12211129;

import java.util.ArrayList;

public class Cohetes {
    protected int pesoSoport;
    protected String nombre;
    protected int numSerie;
    protected int potencia;
    protected int velocidad;
    protected ArrayList<Personas> personas = new ArrayList();

    public Cohetes(int pesoSoport, String nombre, int numSerie, int potencia) {
        this.pesoSoport = pesoSoport;
        this.nombre = nombre;
        this.numSerie = numSerie;
        this.potencia = potencia;
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

    public void setVelocidad(int random) {
        this.velocidad = random*potencia;
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Cohetes{" + "pesoSoport=" + pesoSoport + ", nombre=" + nombre + ", numSerie=" + numSerie + ", potencia=" + potencia + ", velocidad=" + velocidad + ", personas=" + personas + '}';
    }
    
    
}
