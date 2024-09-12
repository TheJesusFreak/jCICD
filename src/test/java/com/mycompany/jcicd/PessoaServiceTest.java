/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jcicd;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paulo.hein
 */
public class PessoaServiceTest {

        private PessoaService pessoaService;
        
        @org.junit.jupiter.api.BeforeEach
        public void setUp() throws Exception {
                pessoaService = new PessoaService();
        }

        /**
         * Test of getPessoaModelByNome method, of class PessoaService.
         */
        @org.junit.jupiter.api.Test
        public void testGetPessoaModelByNome() {
                System.out.println("getPessoaModelByNome");

                String nome = "Lori";

                PessoaService instance = new PessoaService();
                instance.addPessoa(PessoaModel.builder().nome(nome).build());

                PessoaModel expResult = PessoaModel.builder().nome(nome).build();

                PessoaModel result = instance.getPessoaModelByNome(nome);

                assertEquals(expResult.getNome(), result.getNome());
        }

}
