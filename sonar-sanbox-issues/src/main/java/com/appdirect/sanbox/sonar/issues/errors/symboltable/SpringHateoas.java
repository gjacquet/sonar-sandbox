package com.appdirect.sanbox.sonar.issues.errors.symboltable;

import java.util.Collections;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;

public class SpringHateoas {
	public class MyBean {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public Resources<Resource<MyBean>> doStuff() {
		return Resources.wrap(Collections.singletonList(new MyBean()));
	}
}
