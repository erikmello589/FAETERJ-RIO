package AV2;

import java.util.ArrayList;

public class Quarto {
	private int id_Quarto;
	private String nomeQuarto;
	private int qtdCamas;
	private boolean temBanheiro;
    private String descricao;
    private static ArrayList<Quarto> listaQuartos = new ArrayList<Quarto>();
    
	public int getId_Quarto() {
		return id_Quarto;
	}
	public void setId_Quarto(int id_Quarto) {
		this.id_Quarto = id_Quarto;
	}
	public String getNomeQuarto() {
		return nomeQuarto;
	}
	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}
	public int getQtdCamas() {
		return qtdCamas;
	}
	public void setQtdCamas(int qtdCamas) {
		this.qtdCamas = qtdCamas;
	}
	public boolean isTemBanheiro() {
		return temBanheiro;
	}
	public void setTemBanheiro(boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Quarto(int id_Quarto, String nomeQuarto, int qtdCamas, boolean temBanheiro, String descricao) {
		super();
		this.id_Quarto = id_Quarto;
		this.nomeQuarto = nomeQuarto;
		this.qtdCamas = qtdCamas;
		this.temBanheiro = temBanheiro;
		this.descricao = descricao;
	}
	
	public void incluirQuarto(Quarto quarto) {
        listaQuartos.add(quarto);
        System.out.println("Novo quarto cadastrado");
        //escrever no arquivo
    }
	
	public void excluirQuarto(int id) {
    	listaQuartos.removeIf(e -> (e.getId_Quarto() == id));
        System.out.println("Exclusão feita com sucesso");
        //escrever no arquivo
    }
	
	public void alterarQuarto() {
        System.out.println("Alteração feita com sucesso");
    }
	
	public void listarQuartos() {
		listaQuartos.forEach(e -> {
		System.out.println ("ID do Quarto: " + e.getId_Quarto());
		System.out.println ("Nome do quarto: " + e.getNomeQuarto());
		System.out.println ("Quantidade de camas: " + e.getQtdCamas());
		System.out.println ("Tem Banheiro: " + e.isTemBanheiro());
		System.out.println ("Descrição do banheiro: " + e.getDescricao());
		});
	}
    
    
    
    
}
