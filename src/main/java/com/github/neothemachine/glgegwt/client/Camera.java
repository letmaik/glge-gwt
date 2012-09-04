package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class Camera extends JavaScriptObject {

	public static final int PERSPECTIVE = 1;
	public static final int ORTHO = 2;
	
	protected Camera() {}
	
	public native void setType(final int type) /*-{
		this.setType(type);
	}-*/;

	public native void setLoc(final double x, final double y, final double z) /*-{
		this.setLoc(x,y,z);
	}-*/;
	
	public native void setProjectionMatrix(Matrix4 matrix) /*-{
		this.setProjectionMatrix(matrix);
	}-*/;
}
