public class TesteDeDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);

		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());

		reforma.aprova();

		reforma.aplicaDescontoExtra();

		reforma.finaliza();

		// Deve apresentar erro pois esta finalizado
		reforma.aplicaDescontoExtra();

		System.out.println(reforma.getValor());
	}
}
