package classes;

public class Fornecedor {
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	
	public String cadastrou() {
		String msg = "Fornecedor Cadastrado";
		return msg;
	}

//	public String cadastro() {
//		Boolean rs = true;
//		return rs;
//		// verdadeiro ou falso
//	}
//}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}

