package com.appdirect.sanbox.sonar.issues.squid.s1948;

import org.apache.wicket.Page;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class WicketSpringBean extends Page {
	public interface SomeService {
		int doStuff();

		String doOtherStuff();
	}

	// I don't expect to find my service in here but wicket's serializable proxy instead.
	@SpringBean
	private SomeService someService;

	private int someString;

	public WicketSpringBean() {
		// That actually works because Wicket will inject the spring bean during the call to super()
		someString = someService.doStuff();
	}
}
