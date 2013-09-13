public class AcaoEnviaSMS implements AcaoNotaFiscalBuilder {
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviado por SMS");
	}
}
