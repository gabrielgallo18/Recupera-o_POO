public class Retangulo implements Figura{

    private int altura;
  
    public Figura (int altura) {
          this.altura = altura;
      }
  
    public int getAltura() {
      return altura;
    }
  
    public void setAltura(int altura) {
      this.altura = altura;
    }
  
    @Override
    public int getBase() {
      int base = 0;
      base = altura * altura;
  
      return base;
    }
  
    @Override
    public int getAltura() {
      int area = 0;
  
      area = altura * 4;
      return area;
    }
  }