public class Reprovado implements Estado {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("O orçamento foi reprovado");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento foi reprovado");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O orçamento foi reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
