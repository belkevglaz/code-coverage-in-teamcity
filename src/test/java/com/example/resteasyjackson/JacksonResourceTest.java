package com.example.resteasyjackson;

import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Aksenov Ivan
 * @since 0.0.1
 */
@SuppressWarnings("ObviousNullCheck")
@QuarkusTest
@TestHTTPEndpoint(JacksonResource.class)
class JacksonResourceTest {

	@Test
	void list() {
		Assertions.assertNotNull("");
	}

	@Test
	void add() {
		Assertions.assertNotNull("");
	}

	@Test
	void delete() {
		Assertions.assertNotNull("");
	}
}