package com.github.neothemachine.glgegwt.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.Composite;

public class GLGECanvas extends Composite {

	private final Renderer renderer;
	private final Canvas canvas;
	
	/**
	 * Wraps a Canvas and initializes a GLGE Renderer onto it.
	 */
	public GLGECanvas() {
		canvas = Canvas.createIfSupported();
		initWidget(canvas);
		renderer = Renderer.create(canvas.getCanvasElement());
	}
	
	public Renderer getRenderer() {
		return renderer;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}

	public int getCoordinateSpaceWidth() {
		return canvas.getCoordinateSpaceWidth();
	}
	
	public int getCoordinateSpaceHeight() {
		return canvas.getCoordinateSpaceHeight();
	}
	
	public void setCoordinateSpaceWidth(int width) {
		canvas.setCoordinateSpaceWidth(width);
	}
	
	public void setCoordinateSpaceHeight(int height) {
		canvas.setCoordinateSpaceHeight(height);
	}
	
}
