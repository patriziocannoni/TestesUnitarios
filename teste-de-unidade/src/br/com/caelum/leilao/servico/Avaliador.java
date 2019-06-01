package br.com.caelum.leilao.servico;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;

public class Avaliador {

    private double maiorDeTodos = Double.NEGATIVE_INFINITY;
    private double menorDeTodos = Double.POSITIVE_INFINITY;

    public void avalia(Leilao l) {
        for (Lance lance : l.getLances()) {
            if (lance.getValor() > maiorDeTodos) {
                maiorDeTodos = lance.getValor();
            }
            if (lance.getValor() < menorDeTodos ) {
                menorDeTodos = lance.getValor();
            }
        }
    }
    
    public double devolveValorMedioLances(Leilao l) {
        double somaLances = 0.0;
        int quantideLances = l.getLances().size();
        
        for (Lance lance : l.getLances()) {
            somaLances += lance.getValor();
        }
        
        return somaLances / quantideLances;
    }
    
    public double getMaiorLance() {
        return maiorDeTodos;
    }
    
    public double getMenorLance() {
        return menorDeTodos;
    }
    
}
