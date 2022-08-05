package lab3p2_kevinbanegas_12211129;

import java.util.ArrayList;

public class Planetas {
    protected String nombre;
    protected int masa;
    protected int radio;
    protected int tempProm;
    protected int velEscape;
    protected ArrayList<Lunas> lunas = new ArrayList();

    public Planetas(String nombre, int masa, int radio, int tempProm) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.tempProm = tempProm;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getTempProm() {
        return tempProm;
    }

    public void setTempProm(int tempProm) {
        this.tempProm = tempProm;
    }

    public int getVelEscape() {
        return velEscape;
    }

    public void setVelEscape(int velEscape) {
        this.velEscape = velEscape;
    }

    public ArrayList<Lunas> getLunas() {
        return lunas;
    }

    public void setLunas(ArrayList<Lunas> lunas) {
        this.lunas = lunas;
    }

    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", masa=" + masa + ", radio=" + radio + ", tempProm=" + tempProm + ", velEscape=" + velEscape + ", lunas=" + lunas;
    }
    
    
}
