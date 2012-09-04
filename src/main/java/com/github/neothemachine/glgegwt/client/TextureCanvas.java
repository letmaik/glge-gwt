package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class TextureCanvas extends JavaScriptObject {

	protected TextureCanvas() {}
	
	public static native TextureCanvas create() /*-{
		return new $wnd.GLGE.TextureCanvas();
	}-*/;
	
	public native void setCanvas(JavaScriptObject canvas) /*-{
		this.setCanvas(canvas);
	}-*/;
	
}
