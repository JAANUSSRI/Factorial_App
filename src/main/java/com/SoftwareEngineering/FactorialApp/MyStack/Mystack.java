package com.SoftwareEngineering.FactorialApp.MyStack;

public interface Mystack<T> {
    void push(T object);
    T pop();
    int size();
}
