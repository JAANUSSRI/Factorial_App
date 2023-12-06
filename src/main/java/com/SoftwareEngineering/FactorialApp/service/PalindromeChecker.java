package com.SoftwareEngineering.FactorialApp.service;

import java.util.List;
import java.util.Map;

public interface PalindromeChecker {
    boolean IsPalindrome(String word);
    Map<String, Boolean> TestForPalindrome(List<String> words);
}
