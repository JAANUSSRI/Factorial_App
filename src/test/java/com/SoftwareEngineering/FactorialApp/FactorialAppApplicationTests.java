package com.SoftwareEngineering.FactorialApp;
import com.SoftwareEngineering.FactorialApp.controller.PalindromeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FactorialAppApplicationTests {

	@Autowired
	private PalindromeController controller;


	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
