package ExerciciosJava5;

public class TesteContaBancaria {

	public static void main(String[] args) {
		/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/
		
		contaBancaria conta1 = new contaBancaria("Vitor", 47464728, 3, 5000);
		contaBancaria conta2 = new contaBancaria("Jasmin", 82818441, 1, 10500);
		contaBancaria conta3 = new contaBancaria("Roberto", 445848521, 2, 33400);
		
		conta1.infoConta();
		conta2.infoConta();
		conta3.infoConta();
		
		conta1.deposito();
		conta2.saque();
		
		conta1.infoConta();
		conta2.infoConta();
	}

}
