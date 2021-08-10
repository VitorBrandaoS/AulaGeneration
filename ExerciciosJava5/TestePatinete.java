package ExerciciosJava5;

public class TestePatinete {

	public static void main(String[] args) {
		/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
		
		Patinete x1 = new Patinete("DM Toys", 365, false, 20);
		Patinete x2 = new Patinete("Foston", 1200, true, 5);
		Patinete x3 = new Patinete("Oxelo", 800, false, 10);
		
		x1.infoPatinete();
		x2.infoPatinete();
		x3.infoPatinete();
	}

}
