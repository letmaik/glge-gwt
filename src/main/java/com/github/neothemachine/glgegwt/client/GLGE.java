package com.github.neothemachine.glgegwt.client;

public class GLGE {

	public static native Matrix4 makeOrtho(
			double left, double right, double bottom, double top,
			double near, double far) /*-{
		return $wnd.GLGE.makeOrtho(left,right,bottom,top,near,far);
	}-*/;
	
}
