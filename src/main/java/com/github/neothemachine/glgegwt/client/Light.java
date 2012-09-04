package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class Light extends JavaScriptObject {

	public static final int POINT = 1;
	public static final int DIR = 2;
	public static final int SPOT = 3;
	public static final int OFF = 4;
	
	protected Light() {}
	
	public static native Light create() /*-{
		return new $wnd.GLGE.Light();
	}-*/;

	public native void setType(int type) /*-{
		this.setType(type);
	}-*/;
	
	public native void setAttenuation(double constant, double linear, double quadratic) /*-{
		this.setAttenuation(constant, linear, quadratic);
	}-*/;
	
}
