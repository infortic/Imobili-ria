package inforimoveis.cadastro.imovel.dataobjects;

import java.util.UUID;

public class EnderecoORM {
	private String  enderecoID = UUID.randomUUID().toString();
	private String  imovelId;
	private String  estado;
	private String  cidade;
	private String  bairro;
	private String  rua;
	private Integer cep; 
	private Integer numero;
}
