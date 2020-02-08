package br.com.domain.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.projetopos.application.service.Valores;
import br.com.projetopos.domain.service.ValoresItf;

class ValoresTfTest {

    @Test
    @DisplayName("Deve ser confirmado se foi incluido um valor com sucesso")
    void testInserirUmValor() {
        int valor = 5;
        ValoresItf valoresTf = new Valores();

        boolean resultado = valoresTf.inserir(valor);
        assertTrue("O valor tinha que está inserido", resultado);
    }
    
    @Test
    @DisplayName("Só deve ser permitido valores positivos")
    void testNaoPodeInserirUmValorNegativo() {
        int valor = -5;
        ValoresItf valoresTf = new Valores();

        boolean resultado = valoresTf.inserir(valor);
        assertFalse("Não pode incluir negativos", resultado);
    }

    @Test
    @DisplayName("Não deve ser possível inserir mais que 10 valores")
    void testNaoPodeInserirMaisQue10() {
        ValoresItf valoresTf = new Valores();

        boolean inseriuUltimoValor = false;
        for (int i = 0; i < 30; i++) {
            inseriuUltimoValor = valoresTf.inserir(i + 1);
        }

        assertFalse("O valor tinha que está inserido", inseriuUltimoValor);
    }

    @Test
    @DisplayName("Deve ser possivel confirmar o valor que foi deletado")
    void testDeletarUmValor() {
        int valorEsperado = 5;
        ValoresItf valoresTf = new Valores();

        valoresTf.inserir(valorEsperado);

        int valorRemovido = valoresTf.deletaPorIndex(0);
        assertEquals(valorEsperado, valorRemovido);
    }

    @Test
    @DisplayName("Ao Inserir 3 inteiros o tamanho tem que ser 3")
    void testSizeCom3Itens() {
        int tamanhoEsperado = 3;

        ValoresItf valoresTf = new Valores();

        insereValor(tamanhoEsperado, valoresTf);

        assertEquals(tamanhoEsperado, valoresTf.size());
    }

    @Test
    @DisplayName("Ao excluir deve diminuir o tamanho da lista")
    void testSizeAposExclusao() {
        ValoresItf valoresTf = new Valores();
        int tamanhoEsperado = 2;

        insereValor(3, valoresTf);

        valoresTf.deletaPorIndex(2);

        assertEquals(tamanhoEsperado, valoresTf.size());
    }
    
    @Test
    @DisplayName("Ao tentar excluir de uma lista vazia deve retornar -1")
    void testExclusaoListaVazia() {
        ValoresItf valoresTf = new Valores();
        int valorEsperado = -1;

        assertEquals(valorEsperado, valoresTf.deletaPorIndex(2));
    }

    private void insereValor(int tamanhoEsperado, ValoresItf valoresTf) {
        for (int i = 0; i < tamanhoEsperado; i++) {
            valoresTf.inserir(i + 1);
        }
    }
}
