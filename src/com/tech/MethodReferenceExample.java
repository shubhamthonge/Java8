package com.tech;

import java.util.function.Consumer;

public class MethodReferenceExample {
	

	    public static void printMessage(String message) {
	        System.out.println(message);
	    }

	    public static void main(String[] args) {
	        Consumer<String> messagePrinter = MethodReferenceExample::printMessage;
	        messagePrinter.accept("Hello, Method Reference!");
	    }
	}


