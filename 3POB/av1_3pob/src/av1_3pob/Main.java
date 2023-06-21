package av1_3pob;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	private static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	    Scanner sc = new Scanner(System.in);
	    
	    int id = -1;
	    int codBarra = -1;
	    int sku = -1;
	    float preco = -1;
	    float peso = -1;
	    String nome = "";
	    String descricao = "";
	    String categoria = "";
	    String fabricante = "";
	    temp = 0;
	    
		
		do
		{
			
			
			System.out.println("Bem vindo ao menu!\r\n"
					+ "Digite uma das opcoes:\r\n"
					+ "\r\n"
					+ "1 - Incluir produto\r\n"
					+ "2 - Alterar produto\r\n"
					+ "3 - Excluir produto\r\n"
					+ "4 - Listar todos produtos\r\n"
					+ "5 - Listar um produto\r\n"
					+ "6 - Encerrar Programa\r\n"
					+ "");
	        op = sc.nextInt();
			
			
			switch (op)
			{
				case 1: 
				System.out.println("informe o Codigo de Barra do produto:  ");
		        codBarra = sc.nextInt();
		        
		        System.out.println("informe o Codigo SKU do produto:  ");
		        sku = sc.nextInt();
		            
				System.out.println("informe o nome do produto:  ");
	            nome = sc.next();

	            System.out.println("informe o preco do produto:  ");
	            preco = sc.nextFloat();
	            
	            System.out.println("informe o peso do produto:  ");
	            peso = sc.nextFloat();

	            System.out.println("informe a Descricao do produto:  ");
	            descricao = sc.next();
	            
	            System.out.println("informe a categoria do produto:  ");
	            categoria = sc.next();
	            
	            System.out.println("informe o fabricante do produto:  ");
	            fabricante = sc.next();

	            id = id+1;

	            Produto prod = new Produto(id, codBarra, sku, preco, peso, nome, descricao, categoria, fabricante);
	            listaProdutos.add(prod);
	            
				break;

				case 2: break;

				case 3: 
						System.out.println ("Digite o id do produto a ser removido:");
						temp = sc.nextInt();
						listaProdutos.removeIf(e -> (e.getId() == temp));
				break;
				
				case 4:
					listaProdutos.forEach(e -> {
						System.out.println ("ID do produto: " + e.getId());
						System.out.println ("Nome do produto: " + e.getNome());
						System.out.println ("Preco do produto: " + e.getPreco());
						System.out.println ("\n");
					});
		        break;
		        
				case 5: break;
				
				case 6: System.out.println ("Programa finalizado!");
				        break;
				        
				default: System.out.println ("Opcao invalida! Tente novamente.");
			}
		}
		while (op != 6);
		sc.close();
	}

}
