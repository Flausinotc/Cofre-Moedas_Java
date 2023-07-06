package empresa;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		        // Criação do obj cofrinho para armazenar as moedas
		        Cofrinho cofrinho = new Cofrinho();
		        // Criação do objeto scanner para ler a entrada
		        Scanner scanner = new Scanner(System.in);
		        int opcao;

		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1. Adicionar moeda");
		            System.out.println("2. Remover moeda");
		            System.out.println("3. Listar moedas");
		            System.out.println("4. Calcular total em Real");
		            System.out.println("0. Sair");
		            System.out.print("Escolha uma opcao: ");
		            // Lê a opção escolhida
		            opcao = scanner.nextInt();

		            switch (opcao) {
		                case 1:
		                    System.out.println("1. Dolar");
		                    System.out.println("2. Euro");
		                    System.out.println("3. Real");
		                    System.out.print("Escolha uma moeda: ");
		                    // Lê a escolha da moeda
		                    int escolhaMoeda = scanner.nextInt();

		                    System.out.print("Digite o valor da moeda: ");
		                    // Lê o valor da moeda informado 
		                    double valor = scanner.nextDouble();

		                    Moeda moeda;

		                    switch (escolhaMoeda) {
		                        case 1:
		                            // Cria uma nova instância da classe Dolar com o valor informado
		                            moeda = new Dolar(valor);
		                            break;
		                        case 2:
		                            // Cria uma nova instância da classe Euro com o valor informado
		                            moeda = new Euro(valor);
		                            break;
		                        case 3:
		                            // Cria uma nova instância da classe Real com o valor informado
		                            moeda = new Real(valor);
		                            break;
		                        default:
		                            System.out.println("Opcao invalida");
		                            continue; // Volta ao início do loop
		                    }

		                    // Adiciona a moeda ao cofrinho
		                    cofrinho.adicionarMoeda(moeda);
		                    System.out.println("Moeda adicionada com sucesso!");
		                    break;
		                case 2:
		                    System.out.print("Digite o valor da moeda a ser removida: ");
		                    // Lê o valor da moeda a ser removida informado 
		                    double valorRemover = scanner.nextDouble();

		                    Moeda moedaRemover = null;

		                    // Procura pela moeda com o valor especificado no cofrinho
		                    for (Moeda m : cofrinho.getMoedas()) {
		                        if (m.getValor() == valorRemover) {
		                            moedaRemover = m;
		                            break;
		                        }
		                    }

		                    if (moedaRemover != null) {
		                        // Remove a moeda do cofrinho
		                        cofrinho.removerMoeda(moedaRemover);
		                        System.out.println("Moeda removida com sucesso!");
		                    } else {
		                        System.out.println("Moeda nao encontrada no cofrinho.");
		                    }
		                    break;
		                case 3:
		                    // Lista as moedas presentes no cofrinho
		                    cofrinho.listarMoedas();
		                    break;
		                case 4:
		                    // Calcula o total em Real das moedas no cofrinho
		                    double totalReal = cofrinho.calcularTotalEmReal();
		                    System.out.println("Total em Real: R$ " + totalReal);
		                    break;
		                case 0:
		                    System.out.println("Saindo...");
		                    break;
		                default:
		                    System.out.println("Opcao invalida");
		                    break;
		            }
		        } while (opcao != 0);

		        // Encerra o scanner
		        scanner.close();
		    }

		

	}
