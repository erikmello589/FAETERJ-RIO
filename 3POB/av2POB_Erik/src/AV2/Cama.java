package AV2;

import java.util.ArrayList;

public class Cama {
	private int id_Cama;
	private String cod_Cama;
	private boolean ehBeliche;
	private String posicao;
    private String descricao;
    private static ArrayList<Cama> listaCamas = new ArrayList<Cama>();
    
	public int getId_Cama() {
		return id_Cama;
	}
	public void setId_Cama(int id_Cama) {
		this.id_Cama = id_Cama;
	}
	public String getCod_Cama() {
		return cod_Cama;
	}
	public void setCod_Cama(String cod_Cama) {
		this.cod_Cama = cod_Cama;
	}
	public boolean isEhBeliche() {
		return ehBeliche;
	}
	public void setEhBeliche(boolean ehBeliche) {
		this.ehBeliche = ehBeliche;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Cama(int id_Cama, String cod_Cama, boolean ehBeliche, String posicao, String descricao) {
		super();
		this.id_Cama = id_Cama;
		this.cod_Cama = cod_Cama;
		this.ehBeliche = ehBeliche;
		this.posicao = posicao;
		this.descricao = descricao;
	}
    
	public void incluirCama(Cama cama) {
        listaCamas.add(cama);
        System.out.println("Nova cama cadastrada");
        //escrever no arquivo
    }
	
	public void excluirCama(int id) {
    	listaCamas.removeIf(e -> (e.getId_Cama() == id));
        System.out.println("Exclusão feita com sucesso");
        //escrever no arquivo
    }
	
	public void alterarCama() {
        System.out.println("Alteração feita com sucesso");
    }
	
	public void listarQuartos() {
		listaCamas.forEach(e -> {
		System.out.println ("ID da cama: " + e.getId_Cama());
		System.out.println ("Codigo da cama: " + e.getCod_Cama());
		System.out.println ("É Beliche?: " + e.isEhBeliche());
		System.out.println ("Posicão da cama: " + e.getPosicao());
		System.out.println ("Descrição da cama: " + e.getDescricao());
		});
	}
}
