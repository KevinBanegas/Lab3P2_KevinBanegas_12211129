package lab3p2_kevinbanegas_12211129;

public class CombustSolid extends Cohetes{
    protected int kilosCombust;
    protected String material;

    public CombustSolid(int kilosCombust, String material, int pesoSoport, String nombre, int numSerie, int potencia) {
        super(pesoSoport, nombre, numSerie, potencia);
        this.kilosCombust = kilosCombust;
        this.material = material;
    }

    public int getKilosCombust() {
        return kilosCombust;
    }

    public void setKilosCombust(int kilosCombust) {
        this.kilosCombust = kilosCombust;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTipo: CombustSolid" + "\nKilos Combustible: " + kilosCombust + "\nMaterial: " + material;
    }
    
    
}
