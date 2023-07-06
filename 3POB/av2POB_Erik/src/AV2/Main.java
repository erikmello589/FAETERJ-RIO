package AV2;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Cliente lClientes = new Cliente(-1, "",  "",  "",  "", "", "");
		int id_Cliente = -1;
		String nome = "";
		String endereco = "";
		String cep = "";
	    String cpf = "";
	    String passaporte = "";
	    String email = "";
	    
	    Quarto lQuartos = new Quarto(-1, "", -1, false, "");
	    int id_Quarto = -1;
	    String nomeQuarto = "";
	    int qtdCamas = -1;
	    boolean temBanheiro = false;
	    String descricaoQuarto = "";
	    
	    Cama lCama = new Cama(-1, "", false, "", "");
	    int id_Cama = -1;
	    String cod_Cama = "";
		boolean ehBeliche = false;
		String posicao = "";
	    String descricaoCama = "";
	    
	    Reserva lReservas = new Reserva(-1, -1, -1, -1, new Date(), new Date());
	    int id_Reserva = -1;
	    Date dataEntrada = new Date();
		Date dataSaida = new Date();
	    
		int op;
	    Scanner sc = new Scanner(System.in);
	    
	    
	    do
		{
			
			
			System.out.println("Bem vindo ao menu!\r\n"
					+ "Digite uma das opcoes:\r\n"
					+ "\r\n"
					+ "1 - Incluir Cliente\r\n"
					+ "2 - Alterar Cliente\r\n"
					+ "3 - Excluir Cliente\r\n"
					+ "4 - Listar um Cliente\r\n"
					+ "5 - Incluir Quarto\r\n"
					+ "6 - Alterar Quarto\r\n"
					+ "7 - Excluir Quarto\r\n"
					+ "8 - Listar um Quarto\r\n"
					+ "9 - Incluir Cama\r\n"
					+ "10 - Alterar Cama\r\n"
					+ "11 - Excluir Cama\r\n"
					+ "12 - Listar uma Cama\r\n"
					+ "13 - Incluir Reserva\r\n"
					+ "14 - Alterar Reserva\r\n"
					+ "15 - Excluir Reserva\r\n"
					+ "16 - Listar uma Reserva\r\n"
					+ "17 - Encerrar Programa\r\n"
					+ "");
	        op = sc.nextInt();
			
			
			switch (op)
			{
				case 1: 
				System.out.println("informe o nome do cliente:  ");
		        nome = sc.next();
		        
		        System.out.println("informe o endereco deste cliente:  ");
		        endereco = sc.next();
		            
				System.out.println("informe o cep do cliente:  ");
	            cep = sc.next();

	            System.out.println("informe o cpf do cliente:  ");
	            cpf = sc.next();
	            
	            System.out.println("informe o passaporte do cliente:  ");
	            passaporte = sc.next();

	            System.out.println("informe o email do cliente:  ");
	            email = sc.next();

	            id_Cliente = id_Cliente+1;

	            Cliente cliente = new Cliente(id_Cliente, nome,  endereco,  cep,  cpf, passaporte, email);
	            lClientes.incluirCliente(cliente);
	            
				break;

				case 2: break;

				case 3: break;
				
				case 4: break;
		        
				case 5: break;
				
				case 17: System.out.println ("Programa finalizado!");
				        break;
				        
				default: System.out.println ("Opcao invalida! Tente novamente.");
			}
		}
		while (op != 17);
		sc.close();
	}

}
