package inforimoveis.cadastro.imovel.dataobjects;
import java.math.BigDecimal;
import java.util.UUID;
public class ImovelORM {
	private String imovelId = UUID.randomUUID().toString();
	private String descricao;
	private Integer numQuartos;
	private Integer numBanheiros;
	private Integer numSalas;
	private Integer numGaragens;
	private BigDecimal areaFrente;
	private BigDecimal areaFundo;
	private BigDecimal areaLateral;
	private BigDecimal areaTotalImovel;
	private BigDecimal areaConstruida;
	private Boolean altoPadrao;
	private EnderecoORM endereco;
	private ImagensORM imagens;
	private PessoaORM proprietario; 
}
