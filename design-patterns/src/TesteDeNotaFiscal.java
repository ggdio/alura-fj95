
public class TesteDeNotaFiscal {
	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		builder.paraEmpresa("Sourcesphere")
		.comCnpj("12.564.512/0100-13")
		.comItem("item 1", 200.0)
		.comItem("item 2", 100.0)
		.comItem("item 3", 130.0)
		.comObservacao("Nota fiscal Teste")
		.naDataAtual();
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
		
	}
}
