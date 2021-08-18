package ExerciciosJava5;

public class TesteProdEletronico {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
		
		ProdutoEletronico item1 = new ProdutoEletronico("Eletrodoméstico", "Geladeira Electrolux", 4150, 10);
		ProdutoEletronico item2 = new ProdutoEletronico("Computador", "Dell Vostro Small", 3050, 50);
		ProdutoEletronico item3 = new ProdutoEletronico("Eletrodoméstico", "Smart tv Samsung", 4500, 25);
		
		item1.imprimeEletro();
		item2.imprimeEletro();
		item3.imprimeEletro();
	}

}
