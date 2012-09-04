package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.CanvasElement;

public final class Renderer extends JavaScriptObject {

	protected Renderer() {}
	
	public static native Renderer create(final CanvasElement canvas) /*-{
		return new $wnd.GLGE.Renderer(canvas);
	}-*/;
	
	public native void setScene(final Scene scene) /*-{
		this.setScene(scene);
	}-*/;
	
	public native void render() /*-{
		this.render();
	}-*/;
	
}
