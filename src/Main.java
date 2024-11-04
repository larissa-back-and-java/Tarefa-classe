public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Carro
        carro meuCarro = new carro();

        // Definindo a marca do carro
        meuCarro.setMarca("Toyota");

        // Ligando e desligando o carro
        meuCarro.ligar();
        System.out.println("Marca do carro: " + meuCarro.getMarca());
        meuCarro.desligar();
    }
}