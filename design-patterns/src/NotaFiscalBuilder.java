import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private final List<Item> itens;
	private String observacoes;

	private final List<AcaoNotaFiscalBuilder> acoes;

	public NotaFiscalBuilder() {
		itens = new ArrayList<Item>();
		acoes = new ArrayList<AcaoNotaFiscalBuilder>();
	}

	public void adicionaAcao(AcaoNotaFiscalBuilder acao) {
		acoes.add(acao);
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(Item item) {
		itens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comItem(String nome, double valor) {
		return comItem(new Item(nome, valor));
	}

	public NotaFiscalBuilder naDataAtual() {
		dataDeEmissao = Calendar.getInstance();
		return this;
	}

	public NotaFiscalBuilder comObservacao(String observacao) {
		observacoes = observacao;
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataDeEmissao,
				valorBruto, impostos, itens, observacoes);
		for (AcaoNotaFiscalBuilder acao : acoes)
			acao.executa(nf);

		return nf;
	}

}
