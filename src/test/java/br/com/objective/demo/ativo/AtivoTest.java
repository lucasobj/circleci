package br.com.objective.demo.ativo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtivoTest {

    @Test
    public void dadoUmNomeValido_quandoInstanciarUmNovoAtivo_deveriaSerInstanciado(){
        new Ativo("MCD-X1000");
    }

    @Test void dadoUmNomeVazio_quandoInstanciarUmNovoAtivo_deveriaLancarExcecao(){
        assertThrows(NomeAtivoInvalido.class, () -> {
           new Ativo("");
        });
    }

    @Test void dadoUmNomeNulo_quantoInstanciarUmNovoAtivo_deveriaLancarExcecao(){
        assertThrows(NomeAtivoInvalido.class, () -> {
            new Ativo(null);
        });
    }

}