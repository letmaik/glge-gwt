package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class Matrix4 extends JavaScriptObject {

	protected Matrix4() {}
	
	public static native Matrix4 create(
			double a1, double a2, double a3, double a4,
			double a5, double a6, double a7, double a8,
			double a9, double a10, double a11, double a12,
			double a13, double a14, double a15, double a16) /*-{
		return $wnd.GLGE.matrix4(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16);
	}-*/;
	
}
