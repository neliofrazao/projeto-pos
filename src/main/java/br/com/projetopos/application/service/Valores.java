package br.com.projetopos.application.service;

import br.com.projetopos.domain.service.ValoresItf;

public class Valores implements ValoresItf {
    private int maxSize = 10;
    private int[] valores = new int[maxSize];
    private int currentIndex = 0;

    @Override
    public boolean inserir(int valor) {
        if (currentIndex == maxSize) {
            return false;
        }

        if (valor < 0) {
            return false;
        }

        valores[currentIndex] = valor;
        currentIndex++;
        return true;
    }

    @Override
    public int deletaPorIndex(int index) {
        if (size() == 0) {
            return -1;
        }

        int valorRemovido = valores[index];
        valores[index] = 0;

        return valorRemovido;
    }

    @Override
    public int size() {
        int count = 0;

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > 0) {
                count++;
            }
        }

        return count;
    }

}
