package org.spring.app;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTests {

	static {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {

		try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/platform", "postgres",
				"kt@2000")) {

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
