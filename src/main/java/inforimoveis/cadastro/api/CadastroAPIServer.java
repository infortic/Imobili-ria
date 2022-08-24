package inforimoveis.cadastro.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import inforimoveis.cadastro.dominio.persistir.ImovelService;
import inforimoveis.cadastro.imovel.dataobjects.ImovelORM;

@Controller

public class CadastroAPIServer {

	@Autowired
	private ImovelService imovelService;
	
	@PostMapping
	public ResponseEntity<?> saveImovel(@RequestBody ImovelORM imovel){
		return new ResponseEntity<>(imovelService.saveImovel(imovel), HttpStatus.OK);
	}
	
}
