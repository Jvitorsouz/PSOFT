import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        Controller controller = new Controller();
        Scanner sc = new Scanner(System.in);

        String op = "";

        while(true){
            op = menu(sc);
            comando(op, controller, sc);

        }
    }

    private static String menu(Scanner scanner) {
		System.out.println(
						"\n---\nMENU\n"+
										"(C)adastrar Pessoa\n"+
										"(L)istar Pessoas\n"+
										"(E)xibir Pessoa\n"+
										"(S)air\n"+
										"\nOpção> ");
		
		return scanner.next().toUpperCase();
	}

    private static void comando(String opcao, Controller controller, Scanner scanner) {
		switch(opcao) {
			case "C":
				cadastrarPessoa(controller, scanner);
				break;
			case "L":
				listarPessoas(controller);
				break;
			case "E":
				exibirPessoa(controller, scanner);
				break;
                /* 
			case "F":
				exibirFavoritos(controller);
				break;
			case "A":
				adicionarFavorito(controller, scanner);
				break;
			case "R":
				removerFavorito(controller, scanner);
				break;
                */
			case "S":
				System.exit(0);
				break;
			default: 
				System.out.println("OPÇÃO INVALIDA!");
            }
		}

        private static void cadastrarPessoa(Controller controller, Scanner sc) {
            sc.nextLine();
            System.out.print("Nome> ");
            String nome = sc.nextLine();
            System.out.print("Idade> ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("cpf> ");
            String cpf = sc.nextLine();
            System.out.print("Profissao> ");
            String profissao = sc.nextLine();
            controller.cadastrarPessoa(nome, idade, cpf, profissao);
        }
        
        private static void listarPessoas(Controller controller) {
            System.out.println(controller.mostrarPessoas());
        }
        
        private static void exibirPessoa(Controller controller, Scanner sc) {
            sc.nextLine();
            System.out.print("cpf> ");
            String cpf = sc.nextLine();
            System.out.println(controller.mostrarPessoa(cpf));
        }
        
       
    
}
