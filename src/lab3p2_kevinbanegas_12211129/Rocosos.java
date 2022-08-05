package lab3p2_kevinbanegas_12211129;

public class Rocosos extends Planetas{
    protected int densidad;
    protected boolean indicadorVida;

    public Rocosos(int densidad, boolean indicadorVida, String nombre, int masa, int radio, int tempProm) {
        super(nombre, masa, radio, tempProm);
        this.densidad = densidad;
        this.indicadorVida = indicadorVida;
    }

    public int getDensidad() {
        return densidad;
    }

    public void setDensidad(int densidad) {
        this.densidad = densidad;
    }

    public boolean isIndicadorVida() {
        return indicadorVida;
    }

    public void setIndicadorVida(boolean indicadorVida) {
        this.indicadorVida = indicadorVida;
    }

    @Override
    public String toString() {
        return super.toString()+"Rocosos{" + "densidad=" + densidad + ", indicadorVida=" + indicadorVida + '}';
    }

    
    
    
}
