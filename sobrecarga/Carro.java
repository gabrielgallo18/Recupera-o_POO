public class Carro {

  private String modelo;
  private String marca;
      private int ano;

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public void hello(String moedelo, String marca, int ano) {
    setModelo(modelo);
    setMarca(marca);
    setAno(ano);
    System.out.println( "Seu " + getModelo() + "da" + getMarca() + "é do" + getAno() );
  }

  public void hello(String modelo, String marca) {
    setModelo(modelo);
    setMarca(marca);
    System.out.println("Carro" + getModelo() + "da" + getMarca());
  }

  public void hello(String modelo) {
    setModelo(modelo);
    setMarca(marca);
    System.out.println( "Carro" + getModelo());
  }

  public void hello(int ano) {
    setAno(ano);
    System.out.println(" carro do " + getAno());
  }

}