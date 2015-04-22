package com.appdirect.sanbox.sonar.issues.squid.s1604;

import java.io.File;

import org.apache.wicket.Page;
import org.apache.wicket.markup.html.link.DownloadLink;

public class WicketFunctionalClass extends Page {
	public WicketFunctionalClass() {

		// DownloadLink is a wicket component and not a
		DownloadLink downloadLink = new DownloadLink("toto", new File("toto.txt")) {
			private static final long serialVersionUID = -2288584645078900234L;

			@Override
			public void onClick() {
				this.setVisible(false);
				super.onClick();
			}
		};

		this.add(downloadLink);
	}
}
