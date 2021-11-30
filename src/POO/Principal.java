package POO;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro("gol", "preto", "PSG-2503", 2);

        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.80);
        pessoa.setEtnia("Pardo");
        pessoa.setGenero("Masculino");
        pessoa.setIdade(22);
        pessoa.setPeso(77.80);
        pessoa.setNome("José");

        carro.setDono(pessoa);
        
        pessoa.setCarro(carro);
        pessoa.ligarCarro();
        pessoa.setCambioMarcha(1);
        pessoa.acelerarCarro();
        pessoa.acelerarCarro();
        pessoa.setCambioMarcha(2);
        pessoa.acelerarCarro();
        pessoa.frearCarro();
        pessoa.desligarcarro();

        System.out.println("Marcha atual: " + carro.cambio);

        pessoa.ImprimirDadosPessoas();

        carro.imprimeDadosCarro();
    }
}
