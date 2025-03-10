package lab;

class Voo {
    String numero;
    String partida;
    String chegada;
    String origem;
    String destino;
    Piloto piloto;
    Piloto copiloto;
    Passageiro[] passageiros;
    int[] assentos;
    double[] bagagens;
    int totalPassageiros;
    
    Voo(String numero, String partida, String chegada, String origem, String destino, 
        Piloto piloto, Piloto copiloto) {
        
        numero = numero;
        partida = partida;
        chegada = chegada;
        origem = origem;
        destino = destino;
        piloto = piloto;
        copiloto = copiloto;
        passageiros = new Passageiro[250];
        assentos = new int[250];
        bagagens = new double[250];
        totalPassageiros = 0;
    }
    
    boolean adicionarPassageiro(Passageiro passageiro, int assento, double bagagem) {
        if (totalPassageiros < 250 && assento >= 0 && assento < 250 && passageiros[assento] == null) {
            passageiros[assento] = passageiro;
            assentos[assento] = assento;
            bagagens[assento] = bagagem;
            totalPassageiros++;
            return true;
        }
        return false;
    }
    
    void mostrarDados() {
        System.out.println("\nDados do Voo:");
        System.out.println("Número: " + numero);
        System.out.println("De: " + origem + " Para: " + destino);
        System.out.println("Partida: " + partida);
        System.out.println("Chegada: " + chegada);
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Copiloto: " + copiloto.nome);
        System.out.println("Total passageiros: " + totalPassageiros);
    }
}
