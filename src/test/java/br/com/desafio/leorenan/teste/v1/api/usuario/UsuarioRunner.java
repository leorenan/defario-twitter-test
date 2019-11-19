package br.com.desafio.leorenan.teste.v1.api.usuario;

import com.intuit.karate.junit5.Karate;


public class UsuarioRunner {

	@Karate.Test
    Karate testBuscaHashtag() {
        return new Karate().feature("Usuario").relativeTo(getClass());
    } 
	
}
