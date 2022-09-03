package org.nasdanika.demo.drawio.actions.tests;

import org.junit.Test;
import org.nasdanika.demo.drawio.actions.DrawioActionsGenerator;

public class TestDrawioActionsGenerator {
	
	@Test
	public void generate() throws Exception {
		new DrawioActionsGenerator().generate();
	}

}
