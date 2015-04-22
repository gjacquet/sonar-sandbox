package com.appdirect.sanbox.sonar.issues.squid.unusedprivatemethod;

import java.util.Arrays;

/**
 * https://jira.codehaus.org/browse/SONARJAVA-583
 */
public class PrivateMethodReference {
	private String doStuff(Integer value) {
		return String.valueOf(value);
	}

	public void myMethod() {
		Arrays.asList(1, 2, 3, 4).stream()
				.map(this::doStuff);
	}
}
