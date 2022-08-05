package lab3p2_kevinbanegas_12211129;

public class DeFases extends Cohetes {

    protected int cantFases;
    protected int cantMotores;
    protected int altura;

    public DeFases(int cantFases, int cantMotores, int altura, int pesoSoport, String nombre, int numSerie, int potencia) {
        super(pesoSoport, nombre, numSerie, potencia);
        this.cantFases = cantFases;
        this.cantMotores = cantMotores;
        this.altura = altura;
    }

    public int getCantFases() {
        return cantFases;
    }

    public void setCantFases(int cantFases) {
        this.cantFases = cantFases;
    }

    public int getCantMotores() {
        return cantMotores;
    }

    public void setCantMotores(int cantMotores) {
        this.cantMotores = cantMotores;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTipo : De Fases" + "\nCantidad de Fases: " + cantFases + "\nCantidad de Motores: " + cantMotores + "\nAltura: " + altura;
    }

}
