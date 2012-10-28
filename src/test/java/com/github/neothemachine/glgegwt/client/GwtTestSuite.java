package com.github.neothemachine.glgegwt.client;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;
import junit.framework.TestCase;

public class GwtTestSuite extends TestCase {

	public static Test suite() {
		GWTTestSuite suite = new GWTTestSuite();
		suite.addTestSuite(RendererTestGwt.class);
		return suite;
	}

}
