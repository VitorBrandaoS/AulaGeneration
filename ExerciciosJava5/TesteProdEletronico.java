package ExerciciosJava5;

public class TesteProdEletronico {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/
		
		ProdutoEletronico item1 = new ProdutoEletronico("Eletrodom�stico", "Geladeira Electrolux", 4150, 10);
		ProdutoEletronico item2 = new ProdutoEletronico("Computador", "Dell Vostro Small", 3050, 50);
		ProdutoEletronico item3 = new ProdutoEletronico("Eletrodom�stico", "Smart tv Samsung", 4500, 25);
		
		item1.imprimeEletro();
		item2.imprimeEletro();
		item3.imprimeEletro();
	}

}
