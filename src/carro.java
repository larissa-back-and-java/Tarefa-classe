  
  /**
 * Classe Carro representa um carro com suas propriedades e métodos básicos.
 */
public class carro {
    
    // Propriedades do Carro
    private String marca;
    @SuppressWarnings("unused")
    private int ano;
    @SuppressWarnings("unused")
    private String cor;

    // Método para definir a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Método para obter a marca do carro
    public String getMarca() {
        return marca;
    }

    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    // Método para desligar o carro
    public void desligar() {
        System.out.println("O carro está desligado.");
    }
}


   

