package br.com.desafio.leorenan.teste;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;

@KarateOptions(tags = {"~@ignore"})
public class ExecuteTest {

	@Karate.Test
    Karate testAll() {
		return new Karate().relativeTo(getClass());
    }
	
	/*
	@Test
    void testParallel() {
        Results results = Runner.parallel(getClass(), 5, "target/surefire-reports");
        assertTrue(results.getFailCount() == 0, results.getErrorMessages());
    }*/
}
