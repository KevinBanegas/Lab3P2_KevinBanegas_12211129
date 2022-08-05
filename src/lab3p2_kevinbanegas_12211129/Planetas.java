package lab3p2_kevinbanegas_12211129;

import java.util.ArrayList;
import java.util.Random;
public class Planetas {
    private double G = Math.sqrt(Math.pow(6.67*10, -11));
    protected Random r = new Random();
    protected String nombre;
    protected int masa;
    protected int radio;
    protected int tempProm;
    protected double velEscape;
    protected ArrayList<Lunas> lunas = new ArrayList();

    public Planetas(String nombre, int masa, int radio, int tempProm) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.tempProm = tempProm;
        this.velEscape=(2*G*masa)/radio;
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

    public double getVelEscape() {
        return velEscape;
    }

    public void setVelEscape(double velEscape) {
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
