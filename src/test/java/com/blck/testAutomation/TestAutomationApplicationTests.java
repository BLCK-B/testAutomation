package com.blck.testAutomation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TestAutomationApplicationTests {

	@Test
	void simpleTest() {
		System.out.println("hello");
		fail("simulated fail");
	}

}
