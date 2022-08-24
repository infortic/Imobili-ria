package inforimoveis.cadastro.imovel.dataobjects;

import java.util.List;
import java.util.UUID;

public class PessoaORM {
	private String pessoaID = UUID.randomUUID().toString();
	private String imovelId;
	private String nome;
	private String email;
	private EnderecoORM endereco;
	private List<String> telefones;
}
