package lab3p2_kevinbanegas_12211129;

public class Lunas {
    protected String nombre;
    protected int cantCrater;

    public Lunas(String nombre, int cantCrater) {
        this.nombre = nombre;
        this.cantCrater = cantCrater;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCrater() {
        return cantCrater;
    }

    public void setCantCrater(int cantCrater) {
        this.cantCrater = cantCrater;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nCantidad de Crateres: " + cantCrater;
    }
    
    
}
