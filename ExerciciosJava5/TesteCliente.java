package ExerciciosJava5;

public class TesteCliente {

	public static void main(String[] args) {
		/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
		
		Cliente person = new Cliente("", 0 , 3); 
		person.cadastro();
		person.imprimir();
	}
}
