package ExerciciosJava5;

public class Aviao {
	private String nomeDeFabrica;
	private String modelo;
	private int assentos;
	private int porte;
	
	public Aviao(String nomeDeFabrica, String modelo, int assentos, int porte) {
		this.nomeDeFabrica = nomeDeFabrica;
		this.modelo = modelo;
		this.assentos = assentos;
		this.porte = porte;
	}

	public String getNomeDeFabrica() {
		return nomeDeFabrica;
	}

	public void setNomeDeFabrica(String nomeDeFabrica) {
		this.nomeDeFabrica = nomeDeFabrica;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}
	
	public void specsAviao() {
		System.out.println("\n\t ---specs do Avião---");
		System.out.println("Nome de fábrica: " + nomeDeFabrica + "\nModelo: " + modelo + "\nQuantidade de assentos: " + assentos);
		if(porte == 1) {
			System.out.println("Porte: Pequeno");
		}
		else if(porte == 2) {
			System.out.println("Porte: Médio");
		}
		else if(porte == 3) {
			System.out.println("Porte: Grande");
		}
	}
}
