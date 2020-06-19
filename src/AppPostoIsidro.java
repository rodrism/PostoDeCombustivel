public class AppPostoIsidro {
	public static void main(String args[]) {
		BombaDeCombustivelIsidro b1 = new BombaDeCombustivelIsidro("Gasolina", 4.39);
		
		b1.abastecerPorLitro(45);
		b1.exibirRecibo();
		
		System.out.println("\n\n");
		b1.abastecerPorValor(150.0);
		b1.exibirRecibo();
	}

}