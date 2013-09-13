public class AcaoImprime implements AcaoNotaFiscalBuilder {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviado para Impressora");
	}
}
