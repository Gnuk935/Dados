package com.barros.control;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.barros.model.PessoaModel;
import com.barros.scanner.Scan;
import com.barros.view.PessoaView;

public class PessoaControl {
	public void receberPessoa() {
		JSONArray jAr = new JSONArray();
		FileWriter escrever = null;
		JSONObject objOne = new JSONObject();
		PessoaModel pOne = new PessoaModel();
		PessoaView pView = new PessoaView();

			pView.nome();
			pOne.setNome(Scan.vrauString());

			pView.cpf();
			pOne.setCpf(Scan.vrauFloat());

			pView.cidade();
			pOne.setCidade(Scan.vrauString());

			pView.bairro();
			pOne.setBairro(Scan.vrauString());

			pView.estado();
			pOne.setEstado(Scan.vrauString());

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

	}
}
