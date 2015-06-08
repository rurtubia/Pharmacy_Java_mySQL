package modelo;

public class Medicamento {
    private String codigo;
    private String farmaco;
    private int precio;

    public Medicamento() {
        codigo = new String();
        farmaco = new String();
        precio = 0;
    }

    public Medicamento(String codigo, String farmaco, int precio) {
        this.codigo = codigo;
        this.farmaco = farmaco;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFarmaco() {
        return farmaco;
    }

    public void setFarmaco(String farmaco) {
        this.farmaco = farmaco;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
