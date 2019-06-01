package br.com.caelum.leilao.servico;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.leilao.dominio.Lance;
import br.com.caelum.leilao.dominio.Leilao;
import br.com.caelum.leilao.dominio.Usuario;

public class TesteDoAvaliador {

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {
        // Parte 1: cenário
        Usuario joao = new Usuario("joao");
        Usuario jose = new Usuario("jose");
        Usuario maria = new Usuario("maria");
        Usuario pedro = new Usuario("pedro");
        
        Leilao leilao = new Leilao("Playstation 3 novo");
        
        Lance l1 = new Lance(joao, 250.0);
        Lance l2 = new Lance(jose, 300.0);
        Lance l3 = new Lance(maria, 400.0);
        Lance l4 = new Lance(pedro, 250.0);
        leilao.propoe(l1);
        leilao.propoe(l2);
        leilao.propoe(l3);
        leilao.propoe(l4);
        
        // Parte 2: ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        // Parte 3: validação
        double maiorEsperado = 400.0;
        double menorEsperado = 250.0;
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
    
    public void deveDevolverValorMedioLances() {
        // Parte 1: cenário
        Usuario joao = new Usuario("joao");
        Usuario jose = new Usuario("jose");
        Usuario maria = new Usuario("maria");
        Usuario pedro = new Usuario("pedro");
        
        Leilao leilao = new Leilao("Playstation 3 novo");
        
        Lance l1 = new Lance(joao, 250.0);
        Lance l2 = new Lance(jose, 300.0);
        Lance l3 = new Lance(maria, 400.0);
        Lance l4 = new Lance(pedro, 250.0);
        leilao.propoe(l1);
        leilao.propoe(l2);
        leilao.propoe(l3);
        leilao.propoe(l4);
        
        // Parte 2: ação
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        // TODO
    }

}
