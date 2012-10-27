package com.github.neothemachine.glgegwt.client;

import com.google.gwt.core.client.JavaScriptObject;

public final class Document extends JavaScriptObject {

	public interface LoadListener {
		void finishedLoading();
	}

	protected Document() {}
	
	public static native Document create() /*-{
		return new $wnd.GLGE.Document();
	}-*/;
	
	public native void load(String url) /*-{
		this.load(url);
	}-*/;
	
	public native <T> T getElement(String id) /*-{
		return this.getElement(id);
	}-*/;
	
	/**
	 * Adds a listener to be called when all documents have finished loading 
	 * @param listener
	 */
	public native void addLoadListener(LoadListener listener) /*-{
		this.addLoadListener(function() {
			listener.@com.github.neothemachine.glgegwt.client.Document.LoadListener::finishedLoading()();		
		});
	}-*/;
	
}
