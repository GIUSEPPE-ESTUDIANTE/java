package objetos;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell Computer");
		dell.setNomeFantasia("dell");
		dell.setCnpj("451245512121");
		System.out.println(dell.cadastrou());
		
		Produto mouse = new Produto();
		mouse.setnome("Mouse sem Fio");
		mouse.setDescricao("Mouse sem fio recarregável");
		mouse.setPreco(54.20);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("O preço do produto é "+mouse.getPreco());
		
	}

}
