package one.dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String name, String cep) {
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		CrmService.gravarCliente(name, cep, cidade, estado);
		
		
	}

}
