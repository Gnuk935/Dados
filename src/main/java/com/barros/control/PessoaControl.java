package com.barros.control;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.barros.model.PessoaModel;
import com.barros.view.GeralView;
import com.barros.view.PessoaView;

public class PessoaControl {
	public void receberPessoa() {
		JSONArray jAr = new JSONArray();
		FileWriter escrever = null;
		JSONObject objOne = new JSONObject();
		PessoaModel pOne = new PessoaModel();
		PessoaView pView = new PessoaView();
		GeralView gView = new GeralView();
		VeiculoControl vC = new VeiculoControl();
		
		try (Scanner ss = new Scanner(System.in)) {
			pView.nome();
			pOne.setNome(ss.next());

			pView.cpf();
			pOne.setCpf(ss.nextFloat());

			pView.cidade();
			pOne.setCidade(ss.next());

			pView.bairro();
			pOne.setBairro(ss.next());

			pView.estado();
			pOne.setEstado(ss.next());

			objOne.put("Nome", pOne.getNome());
			objOne.put("CPF", pOne.getCpf());
			objOne.put("Bairro", pOne.getBairro());
			objOne.put("cidade", pOne.getCidade());
			objOne.put("Estado", pOne.getEstado());

			jAr.put(objOne);
			

			try {
				escrever = new FileWriter("pessoa.json");

				escrever.write(objOne.toString());
				escrever.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			gView.cadVeic();
			int x;
			x = ss.nextInt();
			if (x == 1) {
				vC.receberVeiculo();
			}
		}
		
		

	}
}
