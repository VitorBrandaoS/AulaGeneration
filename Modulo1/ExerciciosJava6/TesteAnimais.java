package ExerciciosJava6;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro("Sif", 12, true, "Checoslovaco", 2, true);
		Cavalo alazao1 = new Cavalo("Apolo", 25, true, false, 2, true, 30.0);
		Preguica bicho1 = new Preguica("Mari", 18, false, 1, false, true);
		
	 cao1.infoCao();
	 alazao1.infoCavalo();
	 bicho1.infoPreguica();
		
	}

}
