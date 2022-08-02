package org.nasdanika.demo.drawio.actions.tests;

import java.util.ServiceLoader;

import org.junit.Ignore;
import org.junit.Test;
import org.nasdanika.demo.drawio.actions.DrawioActionsGenerator;
import org.nasdanika.drawio.ElementComparator;

public class TestDrawioActionsGenerator {
	
	@Test
	@Ignore
	public void generate() throws Exception {
		new DrawioActionsGenerator().generate();
	}
	
	@Test
	public void testComparatorsLoad() {
		for (ElementComparator.Factory comparatorFactory: ServiceLoader.load(ElementComparator.Factory.class)) {
			System.out.println(comparatorFactory);
		}			
	}

}
