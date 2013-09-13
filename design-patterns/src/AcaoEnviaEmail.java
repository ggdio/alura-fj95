public class AcaoEnviaEmail implements AcaoNotaFiscalBuilder {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviado por email");
	}
}
