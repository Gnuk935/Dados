package com.barros.bo;

import java.util.Scanner;

import com.barros.control.PessoaControl;
import com.barros.control.VeiculoControl;
import com.barros.view.GeralView;

public class ChamaBB {
	private Scanner ss;

	public void chamaBB() {
		GeralView gView = new GeralView();
		PessoaControl pC = new PessoaControl();
		VeiculoControl vC = new VeiculoControl();
		pC.receberPessoa();
		gView.cadVeic();
		int x;
		ss = new Scanner(System.in);
		x = ss.nextInt();
		if (x == 1) {
			vC.receberVeiculo();
		}
		
	}
}
