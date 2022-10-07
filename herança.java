public class Veiculo {

	public String modelo;
	public String marca;

	public Veiculo(String varModelo, String varMarca) {
		this.modelo = varModelo;
		this.marca = varMarca;
	}

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}
