package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class Scene extends JavaScriptObject {

	protected Scene() {}
	
	public static native Scene create() /*-{
		return new $wnd.GLGE.Scene();
	}-*/;
	
	public native void addChild(JavaScriptObject child) /*-{
		this.addChild(child);
	}-*/;
	
	public native void removeChild(JavaScriptObject child) /*-{
		this.removeChild(child);
	}-*/;
	
	public native Camera getCamera() /*-{
		return this.camera;
	}-*/;
	
	public native void setBackgroundColor(String color) /*-{
		this.setBackgroundColor(color);
	}-*/;
	
}
