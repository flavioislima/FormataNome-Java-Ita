package Lesson;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import Lesson.Autoridade;

public class FormatadorTest {
	
	public FormatadorTest() {
		
	}

	@Test
	public void testInformal() {
		FormatadorNome tratamento = new Informal();
		Autoridade pInformal = new Autoridade("Joaquim", "Barnabé", tratamento);
		assertEquals(pInformal.getTratamento(), "Joaquim");
	}

	@Test
	public void testRespeitosoM() {
		FormatadorNome tratamento = new Respeitoso("masculino");
		Autoridade pResp = new Autoridade("Mario", "Bros", tratamento);
		assertEquals(pResp.getTratamento(), "Sr. Mario Bros");
	}
	
	@Test
	public void testRespeitosoF() {
		FormatadorNome tratamento = new Respeitoso("feminino");
		Autoridade pResp = new Autoridade("Joana", "Dar'c", tratamento);
		assertEquals(pResp.getTratamento(), "Sra. Joana Dar'c");
	}

	@Test
	public void testComtitulo() {
		FormatadorNome tratamento = new comTitulo("Princesa");
		Autoridade pCT = new Autoridade("Leia", "Skywalker", tratamento);
		assertEquals(pCT.getTratamento(), "Princesa Leia Skywalker");
	}

}
