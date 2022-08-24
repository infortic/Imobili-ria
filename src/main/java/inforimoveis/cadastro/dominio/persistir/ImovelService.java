package inforimoveis.cadastro.dominio.persistir;

import org.springframework.stereotype.Service;

import inforimoveis.cadastro.imovel.dataobjects.ImovelORM;

@Service
public class ImovelService {

	public ImovelORM saveImovel(ImovelORM imovel) {
		return imovel;
	}
	
}
