/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jcicd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo.hein
 */
public class PessoaService {
        
    private List<PessoaModel> pessoas;
        
    public PessoaService(){
        pessoas = new ArrayList<>();
    }
        
    public void addPessoa(PessoaModel pessoaModel){
        pessoas.add(pessoaModel);
    }
        
    public PessoaModel getPessoaModelByNome(String nome) {
        return pessoas
                .stream()
                .filter((p) -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
