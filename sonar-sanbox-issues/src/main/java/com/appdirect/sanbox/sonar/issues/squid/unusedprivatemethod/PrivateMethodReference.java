package com.appdirect.sanbox.sonar.issues.squid.unusedprivatemethod;

import java.util.Arrays;

public class PrivateMethodReference {
	private String doStuff(Integer value) {
		return String.valueOf(value);
	}

	public void myMethod() {
		Arrays.asList(1, 2, 3, 4).stream()
				.map(this::doStuff);
	}
}
