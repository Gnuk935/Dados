package com.barros.view;

public class GeralView {
	public void Inicio() {
		System.out.println("===========================================================");
		System.out.println("Esta é uma versão beta de um sistema de geração de requerimentos");
		System.out.println("Tem como objetivo ser integrado ao SDM");
		System.out.println("===========================================================");
	}
	
	public void cadVeic() {
		System.out.println("");
		System.out.println("Você deseja cadastrar um veiculo?");
		System.out.println("Digite:");
		System.out.println("1 para sim");
		System.out.println("2 para não");
	}
	
	public void fim(){
		System.out.println("");
		System.out.println("Obrigado por usar o sistema!");
	}
}
