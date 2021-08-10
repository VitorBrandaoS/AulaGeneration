package ExerciciosJava5;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/
		
		Funcionario pessoa1 = new Funcionario("joão Carrasco", 462743, "Gerente de Negocios", 165 );
		Funcionario pessoa2 = new Funcionario("Alice Souza", 845678, "Desenvolvedor(a)", 150 );
		Funcionario pessoa3 = new Funcionario("Maria Aparecida", 754894, "Gerente de projetos", 176 );
		
		pessoa1.showFuncionario();
		pessoa2.showFuncionario();
		pessoa3.showFuncionario();
		

	}

}
