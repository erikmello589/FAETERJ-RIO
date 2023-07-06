package AV2;

import java.util.ArrayList;

public class Cliente {
	private int id_Cliente;
	private String nome;
	private String endereco;
	private String cep;
    private String cpf;
    private String passaporte;
    private String email;
    private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    
    
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Cliente(int id_Cliente, String nome, String endereco, String cep, String cpf, String passaporte,
			String email) {
		super();
		this.id_Cliente = id_Cliente;
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
	}
	
	 public void incluirCliente(Cliente cliente) {
	        listaClientes.add(cliente);
	        System.out.println("Novo cliente cadastrado");
	        //escrever no arquivo
	    }
	   
	 public void excluirCliente(int id) {
	    	listaClientes.removeIf(e -> (e.getId_Cliente() == id));
	        System.out.println("Exclusão feita com sucesso");
	        //escrever no arquivo
	    }
	 
	 public void alterarCliente() {
	        System.out.println("Alteração feita com sucesso");
	    }
	 
	 public void listarClientes () {
		 listaClientes.forEach(e -> {
				System.out.println ("ID do Cliente: " + e.getId_Cliente());
				System.out.println ("Nome do cliente: " + e.getNome());
				System.out.println ("CPF do cliente: " + e.getCpf());
				System.out.println ("Passaporte do cliente: " + e.getPassaporte());
				System.out.println ("Email do cliente: " + e.getEmail());
				System.out.println ("Endereco do cliente: " + e.getEndereco());
			});
	 }
	    
	
    
	
    
}
