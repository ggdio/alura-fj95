public abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		// TODO Auto-generated constructor stub
	}

	public abstract double calcula(Orcamento orcamento);

	public double calculaOutroImposto(Orcamento orcamento) {
		if (outroImposto == null)
			return 0;
		return outroImposto.calcula(orcamento);
	}
}
