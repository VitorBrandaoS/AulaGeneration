package ExerciciosJava5;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.*/
		
		Funcionario pessoa1 = new Funcionario("jo�o Carrasco", 462743, "Gerente de Negocios", 165 );
		Funcionario pessoa2 = new Funcionario("Alice Souza", 845678, "Desenvolvedor(a)", 150 );
		Funcionario pessoa3 = new Funcionario("Maria Aparecida", 754894, "Gerente de projetos", 176 );
		
		pessoa1.showFuncionario();
		pessoa2.showFuncionario();
		pessoa3.showFuncionario();
		

	}

}
