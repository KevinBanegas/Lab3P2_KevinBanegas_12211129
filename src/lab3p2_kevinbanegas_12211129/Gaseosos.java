
package lab3p2_kevinbanegas_12211129;

public class Gaseosos extends Planetas{
    protected int presion;
    protected int cantAnillos;

    public Gaseosos(int presion, int cantAnillos, String nombre, int masa, int radio, int tempProm) {
        super(nombre, masa, radio, tempProm);
        this.presion = presion;
        this.cantAnillos = cantAnillos;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getCantAnillos() {
        return cantAnillos;
    }

    public void setCantAnillos(int cantAnillos) {
        this.cantAnillos = cantAnillos;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTipo: Gaseosos" + "\nPresion: " + presion + "\nCantidad de Anillos: " + cantAnillos;
    }
    
    
    
}
