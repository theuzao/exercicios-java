package lab;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Cadastro do Piloto
        System.out.println("CADASTRO DO PILOTO");
        System.out.print("Nome: ");
        String nomePiloto = sc.nextLine();
        System.out.print("Registro: ");
        String regPiloto = sc.nextLine();
        System.out.print("Data Validade (dd/mm/aaaa): ");
        String valPiloto = sc.nextLine();
        
        Piloto piloto = new Piloto(nomePiloto, regPiloto, valPiloto);
        
        // Cadastro do Copiloto
        System.out.println("\nCADASTRO DO COPILOTO");
        System.out.print("Nome: ");
        String nomeCopiloto = sc.nextLine();
        System.out.print("Registro: ");
        String regCopiloto = sc.nextLine();
        System.out.print("Data Validade (dd/mm/aaaa): ");
        String valCopiloto = sc.nextLine();
        
        Piloto copiloto = new Piloto(nomeCopiloto, regCopiloto, valCopiloto);
        
        // Cadastro do Voo
        System.out.println("\nCADASTRO DO VOO");
        System.out.print("Número do voo: ");
        String numVoo = sc.nextLine();
        System.out.print("Local de origem: ");
        String origem = sc.nextLine();
        System.out.print("Local de destino: ");
        String destino = sc.nextLine();
        System.out.print("Horário partida (hh:mm): ");
        String partida = sc.nextLine();
        System.out.print("Horário chegada (hh:mm): ");
        String chegada = sc.nextLine();
        
        Voo voo = new Voo(numVoo, partida, chegada, origem, destino, piloto, copiloto);
        
        // Cadastro de Passageiros
        char continuar;
        do {
            System.out.println("\nCADASTRO DE PASSAGEIRO");
            System.out.print("Nome: ");
            String nomePass = sc.nextLine();
            System.out.print("Documento: ");
            String docPass = sc.nextLine();
            System.out.print("Telefone: ");
            String telPass = sc.nextLine();
            System.out.print("Endereço: ");
            String endPass = sc.nextLine();
            
            Passageiro passageiro = new Passageiro(nomePass, docPass, telPass, endPass);
            
            System.out.print("Número do assento (0-249): ");
            int assento = sc.nextInt();
            System.out.print("Volume da bagagem (kg): ");
            double bagagem = sc.nextDouble();
            sc.nextLine(); // limpa o buffer
            
            if (voo.adicionarPassageiro(passageiro, assento, bagagem)) {
                System.out.println("Passageiro cadastrado com sucesso!");
            } else {
                System.out.println("Erro: assento ocupado ou inválido!");
            }
            
            System.out.print("\nDeseja cadastrar outro passageiro? (S/N): ");
            continuar = sc.nextLine().toUpperCase().charAt(0);
            
        } while (continuar == 'S');
        
        // Mostra dados do voo
        voo.mostrarDados();
        
        sc.close();
    }
}