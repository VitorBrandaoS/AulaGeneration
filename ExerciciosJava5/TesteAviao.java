package ExerciciosJava5;

public class TesteAviao {

	public static void main(String[] args) {
		/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
		
		Aviao aeronave = new Aviao("EMB-312", "Jato", 2, 1);
		Aviao aeronave2 = new Aviao("Boeing 777-200ER", "Tranporte de viajem", 550, 3);
		
		aeronave.specsAviao();
		aeronave2.specsAviao();
	}

}
