package ExerciciosJava7;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro("Sif", 12, true, "Checoslovaco", 2, true);
		Cachorro cao2 = new Cachorro("Pit", 12, false, "Viralata", 1, true);
		Cavalo alazao1 = new Cavalo("Apolo", 25, true, false, 2, true, 30.0);
		Cavalo alazao2 = new Cavalo("Hades", 25, false, true, 2, true, 40.0);
		Preguica bicho1 = new Preguica("Mari", 18, false, 1, false, true);
		Preguica bicho2 = new Preguica("Jack", 18, true, 2, false, false);
		
		 cao1.infoCao();	 
		 cao2.infoCao();
		 alazao1.infoCavalo();	
		 alazao2.infoCavalo();
		 bicho1.infoPreguica();
		 bicho2.infoPreguica();
		 
	 }

}
