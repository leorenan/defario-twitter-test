package br.com.desafio.leorenan.teste.v1.api.buscahashtag;

import com.intuit.karate.junit5.Karate;


public class BuscaHashtagRunner {

	@Karate.Test
    Karate testBuscaHashtag() {
        return new Karate().feature("BuscaHashtag").relativeTo(getClass());
    } 
	
}
