package inforimoveis.cadastro.imovel.dataobjects;

import java.util.List;
import java.util.UUID;

public class ImagensORM {
	private String imagemId = UUID.randomUUID().toString();
	private String imovelId;
	private List<String> imagens;
	private String video;
}
