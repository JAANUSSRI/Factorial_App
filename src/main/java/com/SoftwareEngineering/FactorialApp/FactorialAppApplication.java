package com.SoftwareEngineering.FactorialApp;
import com.SoftwareEngineering.FactorialApp.service.HtmlTableFormatterImpl;
import com.SoftwareEngineering.FactorialApp.service.PalindromeCheckerJavaUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
@SpringBootApplication
public class FactorialAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FactorialAppApplication.class, args);
	}
}
