public class Finalizado implements Estado {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("O orcamento ja foi finalizado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O orcamento ja foi finalizado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O orcamento ja foi finalizado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("O orcamento ja foi finalizado");
	}

}
