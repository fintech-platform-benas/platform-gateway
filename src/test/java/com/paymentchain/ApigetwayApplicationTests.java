package com.paymentchain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class ApigetwayApplicationTests {

	@Test
	void contextLoads() {
		// Test passes if Spring context loads successfully
	}

}
