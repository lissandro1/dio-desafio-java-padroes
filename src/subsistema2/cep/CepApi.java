package subsistema2.cep;

public class CepApi {

	public static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return CepApi.instancia;
	}

	public String recuperarCidade(String cep) {
		return "Jaboticabal";
	}

	public String recuperarEstado(String cep) {
		return "SP";
	}

}
