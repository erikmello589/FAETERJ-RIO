package AV2;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
	private int id_Reserva;
	private int id_Quarto;
	private int id_Cama;
	private int id_Cliente;
	private Date dataEntrada;
	private Date dataSaida;
    private static ArrayList<Reserva> listaReservas = new ArrayList<Reserva>();
    
	public int getId_Reserva() {
		return id_Reserva;
	}
	public void setId_Reserva(int id_Reserva) {
		this.id_Reserva = id_Reserva;
	}
	public int getId_Quarto() {
		return id_Quarto;
	}
	public void setId_Quarto(int id_Quarto) {
		this.id_Quarto = id_Quarto;
	}
	public int getId_Cama() {
		return id_Cama;
	}
	public void setId_Cama(int id_Cama) {
		this.id_Cama = id_Cama;
	}
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	public Reserva(int id_Reserva, int id_Quarto, int id_Cama, int id_Cliente, Date dataEntrada,
			Date dataSaida) {
		super();
		this.id_Reserva = id_Reserva;
		this.id_Quarto = id_Quarto;
		this.id_Cama = id_Cama;
		this.id_Cliente = id_Cliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
    
	public void incluirReserva(Reserva reserva) {
        listaReservas.add(reserva);
        System.out.println("Nova reserva cadastrada");
        //escrever no arquivo
    }
	
	public void excluirCama(int id) {
    	listaReservas.removeIf(e -> (e.getId_Reserva() == id));
        System.out.println("Exclusão feita com sucesso");
        //escrever no arquivo
    }
	
	public void alterarCama() {
        System.out.println("Alteração feita com sucesso");
    }
	
	public void listarReservas() {
		listaReservas.forEach(e -> {
		System.out.println ("ID da Reserva: " + e.getId_Reserva());
		System.out.println ("ID do quarto: " + e.getId_Quarto());
		System.out.println ("ID da cama: " + e.getId_Cama());
		System.out.println ("ID do Cliente: " + e.getId_Cliente());
		System.out.println ("Data de entrada: " + e.getDataEntrada());
		System.out.println ("Data de saida: " + e.getDataSaida());
		});
	}
    
}
