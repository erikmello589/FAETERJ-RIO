package av1_3pob;

public class Produto {
	
	private int id, codBarra, sku;
    private float preco, peso;
    private String nome, descricao, categoria, fabricante;
    
	public Produto(int id, int codBarra, int sku, float preco, float peso, String nome, String descricao,
			String categoria, String fabricante) {
		super();
		this.id = id;
		this.codBarra = codBarra;
		this.sku = sku;
		this.preco = preco;
		this.peso = peso;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.fabricante = fabricante;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCodBarra() {
		return codBarra;
	}
	
	public void setCodBarra(int codBarra) {
		this.codBarra = codBarra;
	}
	
	public int getSku() {
		return sku;
	}
	
	public void setSku(int sku) {
		this.sku = sku;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
    
    
    
}
