package com.barros.control;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.barros.model.PessoaModel;
import com.barros.view.PessoaView;

public class PessoaControl {
	public void receber() {
		JSONArray jAr = new JSONArray();
		FileWriter escrever = null;
		JSONObject objOne = new JSONObject();
		PessoaModel pOne = new PessoaModel();
		PessoaView pView = new PessoaView();

		
		try (Scanner s = new Scanner(System.in)) {
			pView.nome();
			pOne.setNome(s.next());
			
			pView.cpf();
			pOne.setCpf(s.nextFloat());
			
			pView.cidade();
			pOne.setCidade(s.next());
			
			pView.bairro();
			pOne.setBairro(s.next());
			
			pView.estado();
			pOne.setEstado(s.next());
			
			objOne.put("Nome", pOne.getNome());
			objOne.put("CPF", pOne.getCpf());
			objOne.put("Bairro", pOne.getBairro());
			objOne.put("cidade", pOne.getCidade());
			objOne.put("Estado", pOne.getEstado());
			
			jAr.put(objOne);
			System.out.println(objOne);
			
			try {
				escrever = new FileWriter("dados.json");
				
				escrever.write(objOne.toString());
				escrever.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	
	}
}
