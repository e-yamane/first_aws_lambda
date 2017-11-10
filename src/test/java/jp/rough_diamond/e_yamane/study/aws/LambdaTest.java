package jp.rough_diamond.e_yamane.study.aws;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class LambdaTest {
	private Lambda sut = new Lambda();

	@Test
	void testIt() {
		AdderType type = new AdderType();
		type.setX(8);
		type.setY(27);
		Answer ans = sut.handleRequest(type, new DummyLambdaContext());
		Assertions.assertEquals(Long.valueOf(35L), ans.getAnswer());
	}
}
