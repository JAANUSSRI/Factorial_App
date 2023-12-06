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
	@Autowired
	private HtmlTableFormatterImpl htmlTableFormatter;

	public static void main(String[] args) {
		SpringApplication.run(FactorialAppApplication.class, args);
	}

	@GetMapping("/factorial")
	public String hello(@RequestParam(value = "words", defaultValue = "madam") String words){
		return performPalindromeAndReturnHtmlOutput(words);
	}

	String performPalindromeAndReturnHtmlOutput(String words){
		List<String> tableHeader = new ArrayList<>();
		tableHeader.add("word");
		tableHeader.add("Java Stack test Result");
		tableHeader.add("MyStack test Result");

		List<List<String>> tableBody = new ArrayList<>();
		PalindromeCheckerJavaUtilImpl palindromeCheckerJavaUtil = new PalindromeCheckerJavaUtilImpl();

		for (String word : words.split(",")){
			List<String> row = new ArrayList<>();
			row.add(word);
			row.add(palindromeResultString(palindromeCheckerJavaUtil.IsPalindrome(word)));
			tableBody.add(row);
		}
		return htmlTableFormatter.getHtmlOutput("Palindrome Test", tableHeader, tableBody);

	}

	private String palindromeResultString(boolean isPalindrome){
		if (isPalindrome){
			return "Is a Palindrome";
		}
		else {
			return "Not a Palindrome";
		}
	}
}
