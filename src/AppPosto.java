import java.util.Scanner;

public class AppPosto {

	public static void main(String[] args) {
		
		BombaCombustivel bomba = new BombaCombustivel();
		Scanner input = new Scanner(System.in);
		
		bomba.setCombustivel("Gasolina");
		bomba.setValorLitro(4);
		
		
		System.out.println("Quantos litros quer abastecer: ");
		bomba.setQtdLitros(input.nextFloat());
		bomba.setValorTotal(bomba.getValorTotal());
		
		
		if (bomba.getCombustivel() == "Gasolina" ) {
			System.out.println(bomba.getValorTotal());
		}
		
		input.close();
		
	}
	
}
