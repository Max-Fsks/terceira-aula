package POO;

public class Pessoa {

    double Altura;
    String Nome;
    double Peso;
    String Etnia;
    String Genero;
    int Idade;
    Carro carro;

    void ligarCarro(){
        carro.ligar();
    }
    
    void desligarcarro(){
        carro.desligar();
    }
    
    void acelerarCarro(){
        carro.acelerar();
    }
    
    void frearCarro(){
        carro.frear();
    }
    
    void setCambioMarcha(){
        carro.setCambio();
    }
    
    void ImprimirDadosPessoas() {
        System.out.println("-------PESSOA-------");
        System.out.println("Nome: " + Nome);
        System.out.println("Altura: " + Altura);
        System.out.println("Genero: " + Genero);
        System.out.println("Idade: " + Idade);
        System.out.println("Peso: " + Peso);
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getEtnia() {
        return Etnia;
    }

    public void setEtnia(String Etnia) {
        this.Etnia = Etnia;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    void setCambioMarcha(int cambio){
        
    }

}
