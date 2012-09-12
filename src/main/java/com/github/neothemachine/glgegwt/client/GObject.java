package com.github.neothemachine.glgegwt.client;

public class GObject extends Events {

	protected GObject() {}
	
	public final native Material getMaterial() /*-{
		return this.getMaterial();
	}-*/;
	
	public final native Material getMaterial(int idx) /*-{
		return this.getMaterial(idx);
	}-*/;

}
